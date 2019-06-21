package com.dashuai.study.designmodel.mementomodel.memento;

import com.dashuai.study.designmodel.mementomodel.model.GameStatus;

/**
 * Memento
 * Created in 2018.10.15
 *
 * @author Liaozihong
 */
public class Memento {
    private GameStatus gameStatus;
    private String status;

    /**
     * 初始化游戏
     *
     * @return game status
     */
    public GameStatus initGame() {
        return new GameStatus(100, 100, 100);
    }


    /**
     * 打完boss的损耗
     *
     * @return game status
     */
    public GameStatus bossWastage() {
        return new GameStatus(50, 50, 50);
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets game status.
     *
     * @return the game status
     */
    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    /**
     * Sets game status.
     *
     * @param gameStatus the game status
     */
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
}
