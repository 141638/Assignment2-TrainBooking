/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.trainbooking;

import java.io.File;
import java.util.Comparator;


public class Booking implements Comparable<Booking> {
    
    protected String tcode;
    protected String ccode;
    protected int seat;

    public Booking(String tcode, String ccode, int seat) {
        this.tcode = tcode;
        this.ccode = ccode;
        this.seat = seat;
    }

    Booking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    
    @Override
    public int compareTo(Booking t) {
        return Comparator.comparing(Booking :: getTcode).
                thenComparing(Booking :: getCcode).
                compare(this, t);
    }
}
