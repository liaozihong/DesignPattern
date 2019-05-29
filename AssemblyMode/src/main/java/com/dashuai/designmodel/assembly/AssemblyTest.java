package com.dashuai.designmodel.assembly;

/**
 * Assembly test
 * Created in 2018.11.26
 *
 *
 * 组合模式，
 * @author Liaozihong
 */
public class AssemblyTest {

    /**
     * The entry point of application.
     *
     * 定义了包含人力资源部和财务部这些基本对象和分公司，办事处等组合对象的类的层次结构。基本对象可以被组合成更复杂的组合对象，
     * 而这个组合对象又可以被组合、这样不断的递归下去，客户端代码中，任何用到基本对象的地方都可以使用组合对象了。
     * 简单的说，组合模式让客户可以一致地使用组合结构和单个对象。
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ConcreteCompany concreteCompany=new ConcreteCompany("北京总公司");
        concreteCompany.add(new HRDepartment("总公司人力资源部"));
        concreteCompany.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp=new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        concreteCompany.add(comp);

        ConcreteCompany comp1=new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        comp.add(comp1);

        ConcreteCompany comp2=new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部"));
        comp2.add(new FinanceDepartment("杭州办事处财务部"));
        comp.add(comp2);

        System.out.println("\n结构图");
        concreteCompany.display(1);
        System.out.println("\n职责:");
        concreteCompany.lineOfDuty();
    }
}
