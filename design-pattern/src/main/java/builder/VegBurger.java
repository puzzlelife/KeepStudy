package builder;

import javax.swing.*;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/2/17 10:19
 */
public class VegBurger extends Burger {
    public String name() {
        return "vegetable burger";
    }

    public double price() {
        return 10.5;
    }
}
