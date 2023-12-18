package com.raweceek.raweceek_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Drivers {
    @Id
    private Integer drivernumber;
    private String drivername;
    private String team;
    private String url;

    public Integer getDrivernumber() {
        return drivernumber;
    }

    public void setDrivernumber(Integer drivernumber) {
        this.drivernumber = drivernumber;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
