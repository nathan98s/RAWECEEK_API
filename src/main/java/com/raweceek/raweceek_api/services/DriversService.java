package com.raweceek.raweceek_api.services;

import com.raweceek.raweceek_api.models.Drivers;
import com.raweceek.raweceek_api.models.RaceResults;
import com.raweceek.raweceek_api.pojos.Driver;
import com.raweceek.raweceek_api.repositories.DriversRepository;
import com.raweceek.raweceek_api.repositories.RaceResultsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class DriversService {

    @Autowired
    private DriversRepository driverRepo;
    @Autowired
    private RaceResultsRepository raceRepo;

    public Optional<Drivers> getDriverByDriverNumber(Integer id){
        // TODO need to think about approach for finding id's and adding to driver POJO
        Optional<RaceResults> driverPoints = raceRepo.findById(id);
        System.out.println(driverPoints);
        return driverRepo.findById(id);
    }

    public List<Driver> getAllDrivers(){
        List<Driver> driverList = new ArrayList<>();
        Iterable<Drivers> drivers = driverRepo.findAll();
        return driverList;
    }

    public Iterable<Drivers> getDriversByTeam(String team){
        return driverRepo.findDriversByTeam(team);
    }

}
