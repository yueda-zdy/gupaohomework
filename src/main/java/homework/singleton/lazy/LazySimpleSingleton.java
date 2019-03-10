package homework.singleton.lazy;

/**
 * 懒汉式单利模式
 * 优点. 在使用类的时候进行加载，不会造成资源浪费
 * 缺点. synchronized 性能上稍有影响
 */
public class LazySimpleSingleton {

    private volatile static LazySimpleSingleton singleton = null;

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazySimpleSingleton.class) {
                if (singleton == null) {
                    singleton = new LazySimpleSingleton();
                }
            }
        }
        return singleton;
    }
}
