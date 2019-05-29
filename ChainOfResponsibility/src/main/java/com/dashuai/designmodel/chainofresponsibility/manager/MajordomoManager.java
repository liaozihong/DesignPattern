package com.dashuai.designmodel.chainofresponsibility.manager;

import com.dashuai.designmodel.chainofresponsibility.model.RequestBody;

public class MajordomoManager extends Manager {

    public MajordomoManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(RequestBody request) {
        if (request.getType()=="请假"&&request.getNum()<10&&request.getLevel() <= 8) {
            System.out.println(String.format("姓名：%s,类型：%s,内容：%s，%s批准了！", request.getName(),
                    request.getType(), request.getContent(), this.name));
        } else {
            if (this.superior != null) {
                this.superior.RequestApplications(request);
            }
        }
    }
}
