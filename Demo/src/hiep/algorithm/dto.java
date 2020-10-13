package src.hiep.algorithm;

import java.time.LocalTime;

public class dto {
    String username, language;
    int numDay, numWeek;
    LocalTime timeTo , timeFrom;

    public LocalTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(LocalTime timeTo) {
        this.timeTo = timeTo;
    }

    public LocalTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(LocalTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public dto(String username, String language, int numDay, int numWeek, LocalTime timeTo, LocalTime timeFrom) {
        this.username = username;
        this.language = language;
        this.numDay = numDay;
        this.numWeek = numWeek;
        this.timeTo = timeTo;
        this.timeFrom = timeFrom;
    }


    public dto(String username, String language) {
    }

    public int getNumDay() {
        return numDay;
    }

    public void setNumDay(int numDay) {
        this.numDay = numDay;
    }

    public int getNumWeek() {
        return numWeek;
    }

    public void setNumWeek(int numWeek) {
        this.numWeek = numWeek;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}