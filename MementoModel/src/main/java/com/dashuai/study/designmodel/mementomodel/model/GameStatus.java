package com.dashuai.study.designmodel.mementomodel.model;

public class GameStatus {
    /**
     * 体力值
     */
    private int physicalPower;
    /**
     * 魔法值
     */
    private int magicPoint;
    /**
     * 力量
     */
    private int strength;

    public GameStatus(int physicalPower, int magicPoint, int strength) {
        this.physicalPower = physicalPower;
        this.magicPoint = magicPoint;
        this.strength = strength;
    }

    public int getPhysicalPower() {
        return physicalPower;
    }

    public void setPhysicalPower(int physicalPower) {
        this.physicalPower = physicalPower;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
