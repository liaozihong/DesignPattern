package com.dashuai.learning.delegatemode.listener;

import java.util.Date;

public class PlayingGameListener {
    public PlayingGameListener() {
        System.out.println("playing");
    }

    public void stopPlayGame(Date date) {
        System.out.println("stop playing" + date);
    }
}
