package com.dashuai.learning.visitor.supports;

import java.util.ArrayList;
import java.util.List;

/**
 * Object structure
 * Created in 2019.07.17
 *
 * @author Liaozihong
 */
public class ObjectStructure {
    private List<Element> elementList = new ArrayList<>();

    /**
     * Attach.
     *
     * @param element the element
     */
    public void attach(Element element) {
        elementList.add(element);
    }

    /**
     * Delete.
     *
     * @param element the element
     */
    public void delete(Element element) {
        elementList.remove(element);
    }

    /**
     * Accept.
     *
     * @param visitor the visitor
     */
    public void accept(Visitor visitor) {
        elementList.forEach(element -> element.accept(visitor));
    }
}
