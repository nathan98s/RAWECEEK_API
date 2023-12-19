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

    private Integer convertPositionToPoints(Integer position){
        System.out.println(position);
        return switch (position) {
            case 1 -> 25;
            case 2 -> 18;
            case 3 -> 15;
            case 4 -> 12;
            case 5 -> 10;
            case 6 -> 8;
            case 7 -> 6;
            case 8 -> 4;
            case 9 -> 2;
            case 10 -> 1;
            default -> 0;
        };
    }

    @Autowired
    private DriversRepository driverRepo;
    @Autowired
    private RaceResultsRepository raceRepo;

    public Driver getDriverByDriverNumber(String id){
        Iterable<RaceResults> driverPoints = raceRepo.findResultsByDriverNumber(id);
        Optional<Drivers> driverDbObject = driverRepo.findById(Integer.parseInt(id));
        Integer driverTotal = 0;
        for (RaceResults r : driverPoints){
            driverTotal+=convertPositionToPoints(r.getDriverposition());
        }
        Driver returnObject = null;
        if(driverDbObject.isPresent()){
            Drivers currentDriver = driverDbObject.get();
            returnObject = new Driver(currentDriver.getDrivername(), currentDriver.getTeam(), currentDriver.getDrivernumber(), currentDriver.getUrl(), driverTotal);
        }
        return returnObject;
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
