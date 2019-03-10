package geektime.spring.data.mybatisdemo.gupao.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton singleton = null;

    private LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySimpleSingleton();
        }
        return singleton;
    }


}
