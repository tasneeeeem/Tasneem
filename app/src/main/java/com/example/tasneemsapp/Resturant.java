package com.example.tasneemsapp;

public class Resturant {
    private String resname;
    private String resLocation;
    private Boolean isBusy;
    private String resWorkTime;
    private String resRate;

    public Resturant() {
    }

    public Resturant(String resname, String resLocation, Boolean isBusy, String resWorkTime, String resRate) {
        this.resname = resname;
        this.resLocation = resLocation;
        this.isBusy = isBusy;
        this.resWorkTime = resWorkTime;
        this.resRate = resRate;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getResLocation() {
        return resLocation;
    }

    public void setResLocation(String resLocation) {
        this.resLocation = resLocation;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    public String getResWorkTime() {
        return resWorkTime;
    }

    public void setResWorkTime(String resWorkTime) {
        this.resWorkTime = resWorkTime;
    }

    public String getResRate() {
        return resRate;
    }

    public void setResRate(String resRate) {
        this.resRate = resRate;
    }

    @Override
    public String toString() {
        return "Resturant{" +
                "resname='" + resname + '\'' +
                ", resLocation='" + resLocation + '\'' +
                ", isBusy=" + isBusy +
                ", resWorkTime='" + resWorkTime + '\'' +
                ", resRate='" + resRate + '\'' +
                '}';
    }
}
