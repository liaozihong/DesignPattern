

关于单例模式有几个问题需要注意：

     1、如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。假定不是远端存取，例如一些servlet容器对每个servlet使用完全不同的类装载器，这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。

     2、如果Singleton实现了java.io.Serializable接口，那么这个类的实例就可能被序列化和复原。不管怎样，如果你序列化一个单例类的对象，接下来复原多个那个对象，那你就会有多个单例类的实例。

     3、可能会有人使用反射强行调用我们的私有构造器（如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）。

对第一个问题修复的办法是：

```java
 private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
       if(classLoader == null){ 
           classLoader = Singleton.class.getClassLoader();     
       }
       return (classLoader.loadClass(classname));
}
```
 
 对第二个问题修复的办法是： 
```java
 public class Singleton implements java.io.Serializable {     
    public static Singleton INSTANCE = new Singleton();     
      
    protected Singleton() {     
        
    }     
    private Object readResolve() {     
            return INSTANCE;     
    }    
}   
```
需要注意，使用双重检查锁实现的单例模式，到jdk1.5以后才能正常工作，因为
volatile有两层语义。第一层语义相信大家都比较熟悉，就是可见性。可见性指的是在一个线程中对该变量的修改会马上由工作内存（Work Memory）写回主内存（Main Memory），所以会马上反应在其它线程的读取操作中。
顺便一提，工作内存和主内存可以近似理解为实际电脑中的高速缓存和主存，工作内存是线程独享的，主存是线程共享的。volatile的第二层语义是禁止指令重排序优化。大家知道我们写的代码（尤其是多线程代码），由于编译器优化，在实际执行的时候可能与我们编写的顺序不同。
编译器只保证程序执行结果与源代码相同，却不保证实际指令的顺序与源代码相同。这在单线程看起来没什么问题，然而一旦引入多线程，这种乱序就可能导致严重问题。volatile关键字就可以从语义上解决这个问题。

注意，前面反复提到“从语义上讲是没有问题的”，但是很不幸，禁止指令重排优化这条语义直到jdk1.5以后才能正确工作。
此前的JDK中即使将变量声明为volatile也无法完全避免重排序所导致的问题。所以，在jdk1.5版本前，双重检查锁形式的单例模式是无法保证线程安全的

最后，不管采取何种方案，请时刻牢记单例的三大要点：

* 线程安全
* 延迟加载
* 序列化与反序列化安全

参考链接：  
http://www.blogjava.net/kenzhh/archive/2016/05/16/357824.html  
http://www.importnew.com/18872.html  