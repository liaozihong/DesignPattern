package com.dashuai.learning.singletonmode.simple;

/**
 * Dcl singleton（双重校验锁），注意jdk1.5下会失效，因为volatile 的禁止重排序语义效果并未生效。
 * 这种写法被称为“双重检查锁”，顾名思义，就是在getSingleton()方法中，进行两次null检查。看似多此一举，但实际上却极大提升了并发度，进而提升了性能。
 * 为什么可以提高并发度呢？在单例中new的情况非常少，绝大多数都是可以并行的读操作。因此在加锁前多进行一次null检查就可以减少绝大多数的加锁操作，执行效率提高的目的也就达到了。
 * <p/>
 * Created in 2019.06.11
 * <p/>
 *
 * @author Liaozihong
 */
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;

    private DCLSingleton() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static DCLSingleton getInstance() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
