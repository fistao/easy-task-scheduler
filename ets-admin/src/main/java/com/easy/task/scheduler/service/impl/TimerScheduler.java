/**
 * Copyright (C), 2011-2019.
 */
package com.easy.task.scheduler.service.impl;

import com.easy.task.scheduler.service.Scheduler;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author jony 2019/3/14 - 17:27.
 */
@Component
public class TimerScheduler implements Scheduler {

    @Override
    public void schedule() {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

            }
        };
        timer.scheduleAtFixedRate(timerTask, new Date(),1000);
    }
}
