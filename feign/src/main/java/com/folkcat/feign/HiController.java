package com.folkcat.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tamas on 2017/12/22.
 */
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi mScheduleServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return mScheduleServiceHi.sayHiFromClientOne(name);
    }
}