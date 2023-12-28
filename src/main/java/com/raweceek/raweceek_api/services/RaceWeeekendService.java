package com.raweceek.raweceek_api.services;

import com.raweceek.raweceek_api.models.RaceWeekend;
import com.raweceek.raweceek_api.repositories.RaceWeekendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceWeeekendService {
    @Autowired
    private RaceWeekendRepository raceWeekendRepo;

    public Iterable<RaceWeekend> getAllRaceWeekends(){
        return raceWeekendRepo.findAll();
    }


}
