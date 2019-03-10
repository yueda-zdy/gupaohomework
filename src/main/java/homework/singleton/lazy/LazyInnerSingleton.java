package geektime.spring.data.mybatisdemo.gupao.singleton.lazy;

public class LazyInnerSingleton {

    private LazyInnerSingleton(){}

    public static final LazyInnerSingleton getInstance() {
        return null;
    }

    private static class LazyHodle{

    }
}
