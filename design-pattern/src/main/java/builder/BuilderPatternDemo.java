package builder;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/2/17 10:31
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder=new MealBuilder();

        System.out.println(builder.build().getCost());
    }
}
