package com.dashuai.learning.bridgepatternmode;


import com.dashuai.learning.bridgepatternmode.impl.GreenColor;
import com.dashuai.learning.bridgepatternmode.impl.Pentagon;
import com.dashuai.learning.bridgepatternmode.impl.RedColor;
import com.dashuai.learning.bridgepatternmode.impl.Triangle;
import com.dashuai.learning.bridgepatternmode.support.Shape;

/**
 * Bridge pattern mode application
 * <p/>
 * Created in 2019.06.17
 * <p/>
 *
 * @author Liaozihong
 */
public class BridgePatternModeApplication {

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
