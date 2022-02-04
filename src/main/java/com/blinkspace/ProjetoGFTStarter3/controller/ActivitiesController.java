package com.blinkspace.ProjetoGFTStarter3.controller;

import com.blinkspace.ProjetoGFTStarter3.model.Activities;
import com.blinkspace.ProjetoGFTStarter3.service.ConsumingAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("activity")
public class ActivitiesController {

    @Autowired
    private ConsumingAPI consumingAPI;

    @GetMapping
    public Activities returnActivity() {
        return consumingAPI.returnActivities();
    }
}
