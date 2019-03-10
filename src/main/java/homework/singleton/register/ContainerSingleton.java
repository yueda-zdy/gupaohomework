package homework.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// spring中的做法
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized(ioc) {
            if (ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }
        return ioc.get(className);
    }
}
