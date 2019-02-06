import com.qunar.guava.util.FileUtil;
import org.junit.Test;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangyao on 17-7-26.
 */
public class test {
    @Test
    public void test(){
        List<String> list= FileUtil.getFileContent();
        for (String content : list) {
            String pattern = "(GET|POST) ((/.*/)(.*))";

            // 创建 Pattern 对象
            Pattern r = Pattern.compile(pattern);

            // 现在创建 matcher 对象
            Matcher m = r.matcher(content);
            if (m.find( )) {
                System.out.println("ALL: " + m.group(0) );
                System.out.println("Method: " + m.group(1) );
                System.out.println("http: " + m.group(2) );
                System.out.println("AAA: " + m.group(3) );
                System.out.println("BBB: " + m.group(4) );
            } else {
                System.out.println("NO MATCH");
            }


        }
    }
}
