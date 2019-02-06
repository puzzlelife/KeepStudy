import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.*;

public class Check {
    public static void main(String[] args) throws DocumentException {
        String text=FileUtil.getFileContent();

        // 通过read方法读取一个文件 转换成Document对象
        Document document = DocumentHelper.parseText(text);
        //获取根节点元素对象
        Element rootElement = document.getRootElement();
        //遍历所有的元素节点
        // listNodes(node);
        Set<String> realBucketsSet=new HashSet<String>();
        Set<String> logicBucketsSet=new HashSet<String>();
        Map<String,int[]> flowPercnet=new HashMap<String, int[]>();

        List buckets=rootElement.element("Buckets").elements("bucket");
        List envList=rootElement.elements("EnvDistribute");






        for (Iterator iterator=buckets.iterator();iterator.hasNext();){
            Element bucketNode=(Element) iterator.next();
            String realBucket=bucketNode.attribute("isLr").getText();
            if (realBucketsSet.contains(realBucket)){
                System.err.println("重复的物理桶");
            }
            realBucketsSet.add(realBucket);
        }

        for (Iterator iterator=envList.iterator();iterator.hasNext();){

            Element env=(Element) iterator.next();

            //逻辑桶重复检查
            String logicBucket=env.attribute("logicBucket").getText();
            if (logicBucketsSet.contains(logicBucket)){
                System.err.println("重复的逻辑桶");
            }
            logicBucketsSet.add(logicBucket);

            //引用物理桶检查
            if(!realBucketsSet.contains(env.attribute("realBucket").getText())){
                System.err.println("引用不存在的物理桶");
            }

            //流量配置
            List clientList=env.elements("client");
            for (Iterator it=clientList.iterator();it.hasNext();){
                Element client=(Element) it.next();
                String plat=client.attribute("plat").getText();
                String startPercent=client.attribute("startPercent").getText();
                String endPercent=client.attribute("endPercent").getText();
                int[] percentSum;
                if (flowPercnet.get(plat)==null){
                    percentSum=new int[101];
                }else{
                    percentSum=flowPercnet.get(plat);
                }

                int endPercentNum=Integer.parseInt(endPercent);
                for (int percent=Integer.parseInt(startPercent);percent<endPercentNum;percent++){
                    if ("MOCK".equals(env.attribute("realBucket").getText())) continue;
                    if (percentSum[percent]==1){
                        System.err.println("流量区间重叠");
                    }
                    percentSum[percent]=1;
                }

                if(endPercentNum==100){
                    if (percentSum[100]==1){
                        System.err.println("流量区间重叠");
                    }
                    percentSum[100]=1;
                }

                flowPercnet.put(plat,percentSum);


            }


        }

        //流量检查
        for (Map.Entry<String,int[]> flow:flowPercnet.entrySet()){
            int[] flowSum=flow.getValue();
            for (int temp=0;temp<101;temp++){
                if(flowSum[temp]!=1){
                    System.err.println("流量区间有空隙");
                }
            }

        }


        System.out.println("格式配置正确");





    }
}
