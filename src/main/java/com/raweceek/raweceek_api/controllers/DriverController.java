package com.raweceek.raweceek_api.controllers;

import com.raweceek.raweceek_api.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DriverController {
    @Autowired
    private DriverRepository driverRepository;

    @GetMapping(path="/drivers/")
    public @ResponseBody String getDrivers(){
        return "TEST RESPONSE";
    }


}
