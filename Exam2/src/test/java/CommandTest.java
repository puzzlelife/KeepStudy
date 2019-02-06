import com.qunar.exam.service.CommandService;
import com.qunar.exam.util.FileUtil;
import org.junit.Test;

import java.util.List;

/**
 * Created by wangyao on 17-7-30.
 */
public class CommandTest {
    private String path=" /home/wangyao/7.20 ";
    CommandService commandService=new CommandService();
    @Test
    public void cat(){
        commandService.excuteCommand("cat "+ path);
    }


    @Test
    public void grep(){
        commandService.excuteCommand("grep 'ing'"+ path);
    }


    @Test
    public void wc(){
        commandService.excuteCommand("wc -l"+ path);
    }


    @Test
    public void test1(){
        commandService.excuteCommand("cat "+path+" |grep ing | wc -l");
    }
    @Test
    public void test2(){
        commandService.excuteCommand("cat "+path+" |grep ing");
    }

}
