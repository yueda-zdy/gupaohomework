package homework.singleton.hungry;

/**
 * 饿汉式单利模式
 * 优点. 1.线程安全，在线程出现之前实例化
 *       2.没有加锁，执行效率高
 * 缺点. 1.类加载的时候初始化，浪费内存
 *
 * @author dongyue
 * @create 2019/03/10
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();;

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
