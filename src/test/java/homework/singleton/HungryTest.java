package homework.singleton;

import homework.singleton.hungry.HungrySingleton;
import org.junit.Test;

/**
 * @author dongyue
 * @create 2019/03/10
 */
public class HungryTest {
    @Test
    public void Test1() throws Exception {
        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + hungrySingleton);
            }
        }, 5, 6);
    }
}
