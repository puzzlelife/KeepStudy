package builder;

/**
 * @Author: wangyaowy.wang
 * @Date 2019/2/17 10:16
 */
public abstract class Burger implements Item{

    public Packing packing(){
        return new Wrapper();
    }


}
