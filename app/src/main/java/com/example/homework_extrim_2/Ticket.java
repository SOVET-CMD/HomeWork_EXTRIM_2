package com.example.homework_extrim_2;

import java.io.Serializable;

public class Ticket implements Serializable {
    private String user;
    private String where;
    private String here;
    private String departureTime;
    private String arrivalTime;
    private String price;
    public Ticket(String user, String where, String here, String departureTime, String arrivalTime, String price){
        this.user = user;
        this.where = where;
        this.here = here;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;
    }
    public String getWhere(){
        return where;
    }
    public void setWhere(String Where){
        this.where = where;
    }
    public String getHere(){
        return here;
    }
    public void setHere(String here){
        this.here = here;
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    public String getArrivalTime(){
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }

}
