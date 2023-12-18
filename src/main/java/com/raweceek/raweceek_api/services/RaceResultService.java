package com.raweceek.raweceek_api.services;

import com.raweceek.raweceek_api.models.RaceResults;
import com.raweceek.raweceek_api.repositories.RaceResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RaceResultService {
    @Autowired
    RaceResultsRepository raceRepo;

    public Optional<RaceResults> getResultsByDriverNumber(int drivernumber){
        return raceRepo.findById(drivernumber);
    }

    public Optional<Iterable<RaceResults>> getAllRaceResults(){
        return Optional.of(raceRepo.findAll());
    }
}
