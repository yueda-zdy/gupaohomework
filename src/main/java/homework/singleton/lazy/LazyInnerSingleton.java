package homework.singleton.lazy;

public class LazyInnerSingleton {

    private LazyInnerSingleton(){
        throw new RuntimeException("can't create multiple instance");
    }

    public static final LazyInnerSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    // 默认不加载
    private static class LazyHolder{
        private static final LazyInnerSingleton LAZY = new LazyInnerSingleton();
    }
}
