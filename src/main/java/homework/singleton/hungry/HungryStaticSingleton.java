package homework.singleton.hungry;

/**
 * 饿汉式单利模式
 *
 * 
 *
 * @author dongyue
 * @create 2019/03/10
 */
public class HungryStaticSingleton {

    public static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
