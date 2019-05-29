package com.dashuai.designmodel.assembly.factory;

/**
 * Company
 * Created in 2018.11.26
 *
 * @author Liaozihong
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加
     * Add.
     */
    public abstract void add(Company company);

    /**
     * 移除
     * Remove.
     */
    public abstract void remove(Company company);

    /**
     * 显示
     * Display.
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     * Line of duty.
     */
    public abstract void lineOfDuty();
}
