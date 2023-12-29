package com.raweceek.raweceek_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="races")
@Entity
public class RaceWeekend {
    @Id
    private String racedate;

    private String quali;
    private String name;
    private String race;
    private String fp1;
    private String fp2;
    private String fp3;
    private String sprint;
    private String sprintshootout;
    private String url;
    private String resultsurl;

    public String getQuali() {
        return quali;
    }

    public void setQuali(String quali) {
        this.quali = quali;
    }

    public String getRaceDate() {
        return racedate;
    }

    public void setRaceDate(String raceDate) {
        this.racedate = raceDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFp1() {
        return fp1;
    }

    public void setFp1(String fp1) {
        this.fp1 = fp1;
    }

    public String getFp2() {
        return fp2;
    }

    public void setFp2(String fp2) {
        this.fp2 = fp2;
    }

    public String getFp3() {
        return fp3;
    }

    public void setFp3(String fp3) {
        this.fp3 = fp3;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public String getSprintshootout() {
        return sprintshootout;
    }

    public void setSprintshootout(String sprintshootout) {
        this.sprintshootout = sprintshootout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResultsurl() {
        return resultsurl;
    }

    public void setResultsurl(String resultsurl) {
        this.resultsurl = resultsurl;
    }
}
