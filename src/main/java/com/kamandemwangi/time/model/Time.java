package com.kamandemwangi.time.model;

public class Time {

    private String time;
    private String day;

    public Time() {
    }

    public Time(String time, String day) {
        this.time = time;
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

}
