package homework.singleton.hungry;

/**
 * 饿汉式单利模式
 *
 * 
 *
 * @author dongyue
 * @create 2019/03/10
 */
public class HungrySingleton {

    public static final HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
