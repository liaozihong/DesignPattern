package com.dashuai.learning.bridgemode;


import com.dashuai.learning.bridgemode.impl.GreenColor;
import com.dashuai.learning.bridgemode.impl.Pentagon;
import com.dashuai.learning.bridgemode.impl.RedColor;
import com.dashuai.learning.bridgemode.impl.Triangle;
import com.dashuai.learning.bridgemode.support.Shape;

/**
 * Bridge pattern mode application
 * <p/>
 * Created in 2019.06.17
 * <p/>
 *
 * @author Liaozihong
 */
public class BridgeModeApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Shape shape = new Pentagon(new RedColor());
        shape.applyColor();
        Shape shape1 = new Triangle(new GreenColor());
        shape1.applyColor();
    }

}
