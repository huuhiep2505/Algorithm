package src.hiep.algorithm;

import java.io.Serializable;

public class workingplanDTO implements Serializable {
    String username,language;
    boolean monday,tuesday,wednesday,thursday,friday,saturday,sunday;
    int numDay, numWeek;
    public workingplanDTO() {
    }

    public workingplanDTO(String username, int numDay, int numWeek) {
        this.username = username;
        this.numDay = numDay;
        this.numWeek = numWeek;
    }

    public workingplanDTO(String username, String language, boolean monday, boolean tuesday, boolean wednesday, boolean thursday, boolean friday, boolean saturday, boolean sunday, int numDay, int numWeek) {
        this.username = username;
        this.language = language;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.numDay = numDay;
        this.numWeek = numWeek;
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

    public boolean isMonday() {
        return monday;
    }

    public void setMonday(boolean monday) {
        this.monday = monday;
    }

    public boolean isTuesday() {
        return tuesday;
    }

    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }

    public boolean isWednesday() {
        return wednesday;
    }

    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    public boolean isThursday() {
        return thursday;
    }

    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }

    public boolean isFriday() {
        return friday;
    }

    public void setFriday(boolean friday) {
        this.friday = friday;
    }

    public boolean isSaturday() {
        return saturday;
    }

    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    public boolean isSunday() {
        return sunday;
    }

    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }

    @Override
    public String toString() {
        return "workingplanDTO{" +
                "username='" + username + '\'' +
                ", language='" + language + '\'' +
                ", monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                ", sunday=" + sunday +
                '}';
    }
}
