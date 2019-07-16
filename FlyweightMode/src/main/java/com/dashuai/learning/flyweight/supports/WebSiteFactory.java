package com.dashuai.learning.flyweight.supports;

import com.dashuai.learning.flyweight.impl.ConcreteWebSite;

import java.util.HashMap;

/**
 * 享元工厂
 * Created in 2019.07.16
 *
 * @author Liaozihong
 */
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> flyweights = new HashMap();

    /**
     * Gets web site category.
     *
     * @param key the key
     * @return the web site category
     */
    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    /**
     * Gets site count.
     *
     * @return the site count
     */
    public int getSiteCount() {
        return flyweights.size();
    }
}
