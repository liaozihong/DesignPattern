package com.dashuai.learning.singletonmode.simple;

/**
 * 饿汉式单例实现，顾名思义，饿汉法就是在第一次引用该类的时候就创建对象实例，而不管实际是否需要创建。
 */
class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getSignleton() {
        return hungrySingleton;
    }
}

/**
 * 单线程下的单例模式，懒汉型写法
 * 这种写法是最简单的，由私有构造器和一个公有静态工厂方法构成，在工厂方法中对singleton进行null判断，如果是null就new一个出来，最后返回singleton对象。
 * 这种方法可以实现延时加载，但是有一个致命弱点：线程不安全。如果有两条线程同时调用getSingleton()方法，就有很大可能导致重复创建对象。
 */
class SimpleSingleton {
    private static SimpleSingleton singleton = null;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getSingleton() {
        if (singleton == null) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }
}

/**
 * 这种写法考虑了线程安全，将对singleton的null判断以及new的部分使用synchronized进行加锁。同时，对singleton对象使用volatile关键字进行限制，保证其对所有线程的可见性，并且禁止对其进行指令重排序优化。
 * 如此即可从语义上保证这种单例模式写法是线程安全的。注意，这里说的是语义上，实际使用中还是存在小坑的，并且其效率低下。
 */
class Singleton {
    private static volatile Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
