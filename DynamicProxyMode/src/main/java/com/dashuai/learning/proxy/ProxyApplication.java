package com.dashuai.learning.proxy;


import com.dashuai.learning.proxy.cglib.Real;
import com.dashuai.learning.proxy.cglib.handler.RealInterceptor;
import com.dashuai.learning.proxy.jdk.handler.MyInvocationHandler;
import com.dashuai.learning.proxy.jdk.proxy.UserServiceProxy;
import com.dashuai.learning.proxy.jdk.service.UserService;
import com.dashuai.learning.proxy.jdk.service.impl.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * 基于JDK的代理模式
 * <p/>
 * Created in 2019.06.05
 * <p/>
 *
 * @author Liaozihong
 */
public class ProxyApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //静态代理
        UserService userServiceProxy = new UserServiceProxy(new UserServiceImpl());
        System.out.println(userServiceProxy.getClass());
        userServiceProxy.request();
        //JDK 动态代理
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        UserService userService = (UserService) myInvocationHandler.bind(new UserServiceImpl());
        System.out.println(userService.getClass());
        userService.request();
//        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", UserServiceImpl.class.getInterfaces());
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("E:\\UserService.class");
//            fileOutputStream.write(classFile);
//            fileOutputStream.flush();
//            System.out.println("代理类文件写入成功!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //CGLIB 动态代理
        Enhancer eh = new Enhancer();
        eh.setSuperclass(Real.class);
        eh.setCallback(new RealInterceptor());
        Real r = (Real) eh.create();
        System.out.println(r.getClass());
        int result = r.add(2, 5);
        System.out.println(result);
    }

}
