package homework.singleton;

import homework.common.ConcurrentExecutor;
import homework.singleton.hungry.HungrySingleton;
import homework.singleton.lazy.LazyInnerSingleton;
import homework.singleton.threadlocal.ThreadLocalSingleton;
import org.junit.Test;

/**
 * @author dongyue
 * @create 2019/03/10
 */
public class SingletonTest {
    @Test
    public void HungryTest() throws Exception {
        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                HungrySingleton singleton = HungrySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + singleton);
            }
        }, 5, 2);
    }

    @Test
    public void LazyTest() throws Exception {
        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                LazyInnerSingleton singleton = LazyInnerSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + singleton);
            }
        }, 5, 2);
    }

    @Test
    public void ThreadLocalTest() throws Exception {


        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
                ThreadLocalSingleton singleton1 = ThreadLocalSingleton.getInstance();
                ThreadLocalSingleton singleton2 = ThreadLocalSingleton.getInstance();

                System.out.println(Thread.currentThread().getName() + singleton);
                System.out.println(Thread.currentThread().getName() + singleton1);
                System.out.println(Thread.currentThread().getName() + singleton2);

            }
        }, 2, 2);
    }
}
