
import java.io.IOException;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by dell--pc on 2017/10/29.
 */
public class spider {
    public static void main(String[] args) throws IOException {
        List<String> list=FileUtil.getFileContent();
        for (String s : list) {
            Document document=Jsoup.connect(s).get();
            Elements element=document.select("video>source");
            System.out.println(element.get(0).attr("src"));
        }
    }
}
