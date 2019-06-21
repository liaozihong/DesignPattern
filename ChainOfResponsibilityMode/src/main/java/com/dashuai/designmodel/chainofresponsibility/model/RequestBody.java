package com.dashuai.designmodel.chainofresponsibility.model;

/**
 * Request body
 * Created in 2018.10.16
 * 请求类
 *
 * @author Liaozihong
 */
public class RequestBody {
    /**
     * 姓名
     */
    private String name;
    /**
     * 请求类型
     */
    private String type;
    /**
     * 请求级别
     */
    private int level;
    /**
     * 数量
     */
    private int num;
    /**
     * 请求内容
     */
    private String content;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }
}
