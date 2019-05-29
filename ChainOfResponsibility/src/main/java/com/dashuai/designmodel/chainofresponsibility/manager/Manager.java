package com.dashuai.designmodel.chainofresponsibility.manager;

import com.dashuai.designmodel.chainofresponsibility.model.RequestBody;

public abstract class Manager {
    protected String name;
    //管理者的上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    //设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void RequestApplications(RequestBody request);

}
