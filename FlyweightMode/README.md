享元(Flyweight)模式,运用共享技术有效的支持大量细粒度的对象  

享元UML 结构图：  
![](https://ws1.sinaimg.cn/large/006mOQRagy1g51z5gkf2yj326417ce81.jpg)  



享元模式的应用：  
如果一个程序中使用了大量的对象，而这些大量的对象对内存造成很大开销时应该考虑使用；还有就是对象的大多数状态可以为外部状态，如果删除对象的外部状态，
那么可用相对较少的共享对象取代很多组对象，此时可以考虑使用。  

举一个JDK实例，字符串String类，也就是使用了Flyweight模式，如：  
```java
public static void main(String[] args){
    String a="aa";
    String b="aa";
    System.out.println(a.equals(b));
}
```
结果返回true，说明这两个字符串是同一个实例。