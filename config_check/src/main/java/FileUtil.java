import com.google.common.collect.Lists;
import com.google.common.io.Files;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * Created by wangyao on 17-7-26.
 */
public class FileUtil {
    private static final Logger logger= LoggerFactory.getLogger(FileUtil.class);

    public static String getFileContent(){
        String fileContent;
        String path=FileUtil.class.getClassLoader().getResource("input.txt").getPath();
        try {
            fileContent= Files.asCharSource(new File(path), Charset.defaultCharset()).read();
        } catch (IOException e) {
            fileContent="";
            logger.info("文件读入失败，详情：{}",e.getMessage());
        }
        return fileContent;
    }

}
