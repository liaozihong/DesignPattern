package com.dashuai.learning.delegatemode;

import com.dashuai.learning.delegatemode.listener.PlayingGameListener;
import com.dashuai.learning.delegatemode.listener.WatchingTVListener;
import com.dashuai.learning.delegatemode.notify.AbstractNotifier;

import java.util.Date;

/**
 * Delegate mode application
 * <p/>
 * Created in 2019.06.12
 * <p/>
 *
 * @author Liaozihong
 */
public class DelegateModeApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AbstractNotifier notifier = new ConcreteNotifier();
        PlayingGameListener playingGameListener = new PlayingGameListener();
        WatchingTVListener watchingTVListener = new WatchingTVListener();
        notifier.addListener(playingGameListener, "stopPlayGame", new Date());
        notifier.addListener(watchingTVListener, "stopWatchingTV", new Date());
        notifier.notifyX();
    }

}
