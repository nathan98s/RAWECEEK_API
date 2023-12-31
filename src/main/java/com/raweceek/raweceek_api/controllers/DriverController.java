package com.raweceek.raweceek_api.controllers;

import com.raweceek.raweceek_api.models.Drivers;
import com.raweceek.raweceek_api.pojos.Driver;
import com.raweceek.raweceek_api.repositories.DriversRepository;
import com.raweceek.raweceek_api.services.DriversService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class DriverController {
    @Autowired
    private DriversRepository driversRepository;
    @Autowired
    private DriversService driversService;

    @GetMapping(path="/driverById")
    public @ResponseBody Driver getDrivers(@RequestParam(name="id") String id){
        System.out.println("In controller for getting driver by ID");
        return Optional.of(driversService.getDriverByDriverNumber(id)).orElse(new Driver());
    }

    @GetMapping(path="/drivers/")
    public @ResponseBody List<Driver> getAllDrivers(){
        return driversService.getAllDrivers();
    }

    @GetMapping(path="/getDriversByTeam")
    public @ResponseBody Iterable<Drivers> getDriversByTeam(@RequestParam(name="team") String team){
        return driversService.getDriversByTeam(team);
    }


}
