package com.dashuai.designmodel.assembly;

import com.dashuai.designmodel.assembly.factory.Company;

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            result.append("-");
        }
        result.append(this.name);
        System.out.println(result);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s   公司财务收支管理", this.name));
    }
}
