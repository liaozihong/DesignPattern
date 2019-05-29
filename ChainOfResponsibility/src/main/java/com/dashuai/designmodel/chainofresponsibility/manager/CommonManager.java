package com.dashuai.designmodel.chainofresponsibility.manager;


import com.dashuai.designmodel.chainofresponsibility.model.RequestBody;

/**
 * Common manager
 * Created in 2018.10.16
 *
 * @author Liaozihong
 */
public class CommonManager extends Manager {
    /**
     * Instantiates a new Common manager.
     *
     * @param name the name
     */
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(RequestBody request) {
        if (request.getLevel() <= 4 && request.getNum() < 3) {
            System.out.println(String.format("姓名：%s,请求类型：%s,请求内容：%s,%s批准了！", request.getName(), request.getType(), request.getContent(), this.name));
        } else {
            if (this.superior != null) {
                this.superior.RequestApplications(request);
            }
        }

    }
}
