### 代理模式
代理模式结构图：  
![](http://ww1.sinaimg.cn/large/006mOQRagy1g3qd3myf3aj30lf0cm42m.jpg)  

概念：为其他对象提供一种代理以控制对这个对象的访问。    

1. 静态代理

按上述类图进行操作就是静态代理，静态代理如果要对多个方法进行处理，就得在多个方法前后进行修改，不方便，因此产生动态代理。

2. 基于JDK动态代理

代理类在程序运行时创建的代理方式，可以方便的对代理类的函数进行统一的处理，而不用修改代理类的每个方法。
JDK动态代理是利用java反射机制 生成一个实现接口的匿名类, 在调用具体方法前调用InvocationHandler来处理.

3. 基于CGLib动态代理

 CGLib动态代理是利用asm开源包 把被代理类的class文件加载进来 通过修改其字节码生成子类来处理，
 注意，CGLIB中我们用到了MethodProxy，为什么不使用methodProxy.invoke呢，可不可以用呢，当然是否了,
 可以尝试下，使用invoke，程序会进行无限递归，因为代理类会继承原始类，obj指向的是代理类对象的实例，
 所以如果你对它使用method.invoke，由于多态性，就会又去调用代理类的add方法，继而又进入invoke方法，进入一个无限递归：  
 ```java
obj.add() {
  interceptor.invoke() {
    obj.add() {
      interceptor.invoke() {
      }
    }
  }
}
```
那我如何才能在interceptor.invoke()里去调用基类Real的add方法呢？当然通常做法是super.add()，然而这是在MethodInterceptor的方法里，
而且这里的method调用必须通过反射完成，你并不能在语法层面上做到这一点。所以cglib封装了一个类叫MethodProxy帮助你，这也是为什么那个方法的名字叫invokeSuper，
表明它调用的是原始基类的真正方法。它究竟是怎么办到的呢？你可以简单理解为，动态代理类里会生成这样一个方法：  
```java
int super_add(int x, int y) {
  return super.add(x, y);
} 
```

 ### 小结
 对比JDK Proxy和cglib动态代理的使用方法和实现上的区别，就会发现，它们本质上都差不多，都是提供两个最重要的东西：  
 
 接口列表或者基类，定义了代理类（当然也包括原始类）的签名。  
 
 一个方法拦截器，完成方法的拦截和代理，是所有调用链的桥梁。  
 
 需要说明的一点是，以上我给出的代理类ProxyClass的源代码，仅是参考性的最精简版本，只是为了说明原理，
 而不是JDK Proxy和cglib真正生成的代理类的样子，真正的代理类的逻辑要复杂的多，但是原理上基本是一致的。
 另外之前也说到过，事实上它们也不会生成源码，而是直接产生类的字节码，例如cglib是封装了ASM来直接生成Class数据的   
 
 参考链接：  
 http://www.php.cn/java-article-407212.html