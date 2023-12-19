package com.raweceek.raweceek_api.controllers;

import com.raweceek.raweceek_api.models.RaceResults;
import com.raweceek.raweceek_api.services.RaceResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class RaceResultsController {
    @Autowired
    private RaceResultService raceService;
    @GetMapping(path="/getAllRaceResults")
    public @ResponseBody Optional<Iterable<RaceResults>> getRaceResults(){
        return raceService.getAllRaceResults();
    }



}
