package com.dashuai.designmodel.assembly;

import com.dashuai.designmodel.assembly.factory.Company;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> companyList = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        this.companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        this.companyList.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            result.append("-");
        }
        result.append(this.name);
        System.out.println(result);
        for (Company company : this.companyList) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : this.companyList) {
            company.lineOfDuty();
        }
    }
}
