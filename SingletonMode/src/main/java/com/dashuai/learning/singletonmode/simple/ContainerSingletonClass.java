package com.dashuai.learning.singletonmode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Container singleton class
 * <p/>
 * Created in 2019.06.11
 * <p/>
 * 用ContainerSingletonClass 将多种的单例类统一管理，在使用时根据key获取对象对应类型的对象。
 * 这种方式使得我们可以管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度。
 *
 * @author Liaozihong
 */
public class ContainerSingletonClass {
    /**
     * The constant objectMap.
     */
    public static Map<String, Object> objectMap = new HashMap<>();

    private ContainerSingletonClass() {
    }

    /**
     * Register service.
     *
     * @param key    the key
     * @param object the object
     */
    public static void registerService(String key, Object object) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, object);
        }
    }

    /**
     * Gets service.
     *
     * @param key the key
     * @return the service
     */
    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
