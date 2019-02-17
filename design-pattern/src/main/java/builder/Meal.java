package builder;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/2/17 10:22
 */
public abstract class Meal {
    private List<Item> combo=new ArrayList<Item>();

    public abstract Item addBuger();

    public abstract Item addDrink();

    protected Meal build(){
        combo.add(addBuger());
        combo.add(addDrink());
        return this;
    }

    public double getCost(){
        double cost=combo.stream().filter(item -> item.price()!=0.0).mapToDouble(Item::price).sum();
        return cost;
    }


}
