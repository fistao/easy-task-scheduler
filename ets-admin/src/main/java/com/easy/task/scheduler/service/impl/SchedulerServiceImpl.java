/**
 * Copyright (C), 2011-2019.
 */
package com.easy.task.scheduler.service.impl;

import com.easy.task.scheduler.service.SchedulerService;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author jony 2019/3/14 - 17:27.
 */
@Component
public class SchedulerServiceImpl implements SchedulerService {

    @Override
    public void schedule() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello ETS");
            }
        };
        Timer timer = new Timer();
        long delay = 0L;
        long intevalPeriod = 1 * 1000;
        timer.scheduleAtFixedRate(timerTask,delay,intevalPeriod);
    }
}
