package com.raweceek.raweceek_api.compKeys;

import jakarta.persistence.IdClass;

import java.io.Serializable;

public class raceResultId implements Serializable {
    private String racedate;
    private String drivernumber;

    public raceResultId(){

    }
    public raceResultId(String racedate, String drivernumber) {
        this.racedate = racedate;
        this.drivernumber = drivernumber;
    }
}
