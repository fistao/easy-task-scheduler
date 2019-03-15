/**
 * Copyright (C), 2011-2019.
 */
package com.easy.task.scheduler.controller;

import com.easy.task.scheduler.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jony 2019/3/14 - 17:35.
 */
@Controller
@RequestMapping(value = "/schedulers")
public class SchedulerController {

    @Autowired
    private SchedulerService schedulerService;

    @GetMapping("/run")
    public String helloScheduler(Model model) {
        schedulerService.schedule();
        model.addAttribute("result","Hello ETS");
        return "scheduler";
    }
}
