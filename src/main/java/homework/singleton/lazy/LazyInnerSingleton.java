package homework.singleton.lazy;

/**
 * 懒汉式 内部类单利模式
 * 兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
 */
public class LazyInnerSingleton {

    private LazyInnerSingleton(){
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("can't create multiple instance");
        }
    }

    public static final LazyInnerSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    // 默认不加载
    private static class LazyHolder{
        private static final LazyInnerSingleton LAZY = new LazyInnerSingleton();
    }
}
