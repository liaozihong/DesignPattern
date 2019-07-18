package com.dashuai.learning.flyweight;

import com.dashuai.learning.flyweight.model.User;
import com.dashuai.learning.flyweight.supports.WebSite;
import com.dashuai.learning.flyweight.supports.WebSiteFactory;

/**
 * Fly weight main
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public class FlyWeightMain {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite webSite = webSiteFactory.getWebSiteCategory("产品展示");
        webSite.user(new User("大帅"));

        WebSite webSite2 = webSiteFactory.getWebSiteCategory("产品展示");
        webSite2.user(new User("大帅2"));

        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.user(new User("大帅3"));

        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.user(new User("大帅4"));

        System.out.println("享元工厂对象总数：" + webSiteFactory.getSiteCount());

    }
}
