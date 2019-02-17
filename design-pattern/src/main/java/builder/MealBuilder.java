package builder;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/2/17 10:28
 */
public class MealBuilder extends Meal {

    @Override
    public Item addBuger() {
        return new VegBurger();
    }

    @Override
    public Item addDrink() {
        return new Coke();
    }
}
