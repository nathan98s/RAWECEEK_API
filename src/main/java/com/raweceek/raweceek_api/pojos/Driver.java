package com.raweceek.raweceek_api.pojos;

public class Driver {
    private String name;
    private String team;
    private String number;
    private String url;
    private Integer points;

    public Driver(String name, String team, String number, String url, Integer points) {
        this.name = name;
        this.team = team;
        this.number = number;
        this.url = url;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
