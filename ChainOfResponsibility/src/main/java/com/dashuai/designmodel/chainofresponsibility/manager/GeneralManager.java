package com.dashuai.designmodel.chainofresponsibility.manager;

import com.dashuai.designmodel.chainofresponsibility.model.RequestBody;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplications(RequestBody request) {
        if (request.getType() == "请假") {
            String.format("姓名：%s,类型：%s,内容：%s，" + ((request.getNum() < 15) ? "%s批准了！" : "%s叫你可以收拾完走了！"), request.getName(),
                    request.getType(), request.getContent(), this.name);
        }
        if (request.getType() == "加薪" && request.getNum() <= 500) {
            System.out.println(String.format("姓名：%s,请求类型：%s,请求内容：加薪 %s,%s批准了！", request.getName(), request.getType(), request.getContent(), this.name));
        }
        if (request.getType() == "加薪" && request.getNum() > 500) {
            System.out.println(String.format("姓名：%s,请求类型：%s,请求内容：加薪 %s,%s叫他不干滚吧！", request.getName(), request.getType(), request.getContent(), this.name));
        }

    }
}
