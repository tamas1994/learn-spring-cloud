package com.folkcat.feign;

import org.springframework.stereotype.Component;

/**
 * Created by Tamas on 2017/12/22.
 */
@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
