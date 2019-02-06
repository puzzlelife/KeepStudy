import com.qunar.hotel.qta.base.exception.BizException;
import com.qunar.hotel.qta.baseinfo.bean.exchangerate.ExchangeRate;
import com.qunar.hotel.qta.baseinfo.service.ExchangeRateRemote;
import com.qunar.hotel.qta.order.store.api.query.Query;
import com.qunar.hotel.qta.order.store.api.service.OrderStoreReadService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class DubboTest {

    private static OrderStoreReadService orderStoreReadService;

    @BeforeClass
    public static void initTest(){
        ClassPathXmlApplicationContext ctx;
        ctx = new ClassPathXmlApplicationContext("spring/service-ref.xml");
        orderStoreReadService = ctx.getBean("xx", OrderStoreReadService.class);
    }

    @Test
    public void testQueryRoomBaseInfo() throws BizException {

        int count=orderStoreReadService.count("1001010", Query.newQuery(1,1));
        System.out.println(count);
    }



}
