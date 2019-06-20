委托模式设计UML图：  
![](http://ww1.sinaimg.cn/large/006mOQRagy1g3y7yg20ngj30l40s4t9l.jpg)  


对观察者模式进行了改进，使得放哨者不在需要依赖观察者对象。  
调用通知者（放哨者）不需要知道调用对象（游戏者）是谁，实现了完全解耦。    
扩展性很高，再来一个需要通知的对象只需写一个对应的通知类，并在测试代码中告诉下放哨者即可。   

参考链接：  
大话设计模式  
https://www.kancloud.cn/digest/suski-pattern/160469  
