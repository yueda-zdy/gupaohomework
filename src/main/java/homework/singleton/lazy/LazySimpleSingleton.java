package homework.singleton.lazy;

/**
 * 懒汉式单利模式
 *
 *
 *
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
