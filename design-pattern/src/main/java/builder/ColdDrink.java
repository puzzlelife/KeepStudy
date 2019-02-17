package builder;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/2/17 10:18
 */
public abstract class ColdDrink implements Item {
    public Packing packing(){
        return new Bottle();
    }
}
