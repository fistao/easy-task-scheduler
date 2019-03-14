/**
 * Copyright (C), 2011-2019.
 */
package com.easy.task.scheduler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jony 2019/3/14 - 17:35.
 */
@Controller
@RequestMapping(value = "/schedulers")
public class SchedulerController {

    @GetMapping
    public void HelloScheduler() {

    }
}
