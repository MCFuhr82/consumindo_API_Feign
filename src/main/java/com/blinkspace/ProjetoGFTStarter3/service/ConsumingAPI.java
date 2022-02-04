package com.blinkspace.ProjetoGFTStarter3.service;

import com.blinkspace.ProjetoGFTStarter3.model.Activities;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//anotação para adicionar um nome e a URL que iremos usar para consumir a API
@FeignClient(name = "activities", url = "https://www.boredapi.com/api/activity")
public interface ConsumingAPI {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Activities returnActivities();
}
