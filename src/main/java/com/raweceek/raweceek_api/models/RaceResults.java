package com.raweceek.raweceek_api.models;

import com.raweceek.raweceek_api.compKeys.raceResultId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name="race_results")
@IdClass(raceResultId.class)
public class RaceResults {
    @Id
    private String racedate;
    @Id
    private String drivernumber;
    private Integer driverposition;

    public String getDrivernumber() {
        return drivernumber;
    }

    public void setDrivernumber(String drivernumber) {
        this.drivernumber = drivernumber;
    }

    public String getRacedate() {
        return racedate;
    }

    public void setRacedate(String racedate) {
        this.racedate = racedate;
    }

    public Integer getDriverposition() {
        return driverposition;
    }

    public void setDriverposition(Integer driverposition) {
        this.driverposition = driverposition;
    }
}
