package com.dashuai.learning.abstractfactorymode;

import com.dashuai.learning.abstractfactorymode.factory.IntelFactory;
import com.dashuai.learning.abstractfactorymode.support.AbstractFactory;

/**
 * Abstract factory mode application
 * <p/>
 * Created in 2019.06.14
 * <p/>
 *
 * @author Liaozihong
 */
public class AbstractFactoryModeApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //创建装机工程师对象
        ComputerEngineer cf = new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new IntelFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);
    }

}
