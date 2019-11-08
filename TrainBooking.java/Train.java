/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.trainbooking;

/**
 *
 * @author admin
 */
public class Train {
    protected String tcode;
    protected String trainName;
    protected int seat;
    protected int booked;
    protected double departTime;
    protected String departPlace;

    public Train() {}

    public Train(String tcode, String trainName, int seat, int booked, double departTime, String departPlace) {
        this.tcode = tcode;
        this.trainName = trainName;
        this.seat = seat;
        this.booked = booked;
        this.departTime = departTime;
        this.departPlace = departPlace;
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public double getDepartTime() {
        return departTime;
    }

    public void setDepartTime(double departTime) {
        this.departTime = departTime;
    }

    public String getDepartPlace() {
        return departPlace;
    }

    public void setDepartPlace(String departPlace) {
        this.departPlace = departPlace;
    }
    
    void display(){
        System.out.printf("%4s %2s %6s %6s %4d %2s %4d %4s %7s %6s %7s %7s %7s",tcode,"|", trainName,"|", seat,"|", booked,"|", departTime,"|", departPlace,"|", (seat-booked));
    }
    
}
