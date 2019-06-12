观察者模式UML 图：  
![](http://ww1.sinaimg.cn/large/006mOQRagy1g3ybwc8y9rj31460q2jvt.jpg)  

优点:   
很好地解耦了代码，体现了 依赖倒转的原则

缺点:  
抽象通知者还是依赖了抽象观察者，当没有观察者的时候，没办法更新   
要求观察者的所有动作 必须一样 ，如果不一样的话，不能实现   

参考链接：  
大话设计模式  
https://blog.csdn.net/u010452388/article/details/82962592  