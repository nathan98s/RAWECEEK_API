package com.raweceek.raweceek_api.controllers;

import com.raweceek.raweceek_api.models.RaceWeekend;
import com.raweceek.raweceek_api.repositories.RaceWeekendRepository;
import com.raweceek.raweceek_api.services.RaceWeeekendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class RaceWeekendController {

    @Autowired
    private RaceWeeekendService raceWeeekendService;
    @GetMapping(path="/getRaceWeekends")
    public @ResponseBody Optional<Iterable<RaceWeekend>> getAllRaceWeekends(){
        return Optional.ofNullable(raceWeeekendService.getAllRaceWeekends());
    }
}
