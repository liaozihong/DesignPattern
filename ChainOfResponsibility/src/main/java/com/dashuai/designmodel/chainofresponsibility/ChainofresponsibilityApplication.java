package com.dashuai.designmodel.chainofresponsibility;

import com.dashuai.designmodel.chainofresponsibility.manager.CommonManager;
import com.dashuai.designmodel.chainofresponsibility.manager.GeneralManager;
import com.dashuai.designmodel.chainofresponsibility.manager.MajordomoManager;
import com.dashuai.designmodel.chainofresponsibility.manager.Manager;
import com.dashuai.designmodel.chainofresponsibility.model.RequestBody;


/**
 * Chainofresponsibility application
 * Created in 2018.10.16
 * 职责链模式
 *
 * @author Liaozihong
 */
public class ChainofresponsibilityApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Manager commonManager = new CommonManager("张三经理");
        Manager majorManager = new MajordomoManager("李四总监");
        Manager generalManager = new GeneralManager("大帅总经理");
        //设置上级
        commonManager.setSuperior(majorManager);
        majorManager.setSuperior(generalManager);
        //发送请求
        RequestBody requestBody = new RequestBody();
        requestBody.setName("大傻");
        requestBody.setType("请假");
        requestBody.setNum(2);
        requestBody.setContent("我便秘了，请假看医生！");
        requestBody.setLevel(4);
        //向经理发送请求
        commonManager.RequestApplications(requestBody);
        requestBody.setType("请假");
        requestBody.setNum(7);
        requestBody.setLevel(8);
        requestBody.setContent("处理生理疾病，需要1个星期调养！");
        //向经理发送请求，经理可能没权力处理，这是会上报上级
        commonManager.RequestApplications(requestBody);
        requestBody.setType("加薪");
        requestBody.setNum(500);
        requestBody.setContent("这段时间表现优异，要求加薪");
        commonManager.RequestApplications(requestBody);
        requestBody.setType("加薪");
        requestBody.setNum(1000);
        requestBody.setContent("这段时间表现very very 优异，要求加薪");
        commonManager.RequestApplications(requestBody);


    }
}
