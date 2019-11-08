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
public class Customer {
    
    protected String ccode;
    protected String cusName;
    protected String phone;

    public Customer(String ccode, String cusName, String phone) {
        this.ccode = ccode;
        this.cusName = cusName;
        this.phone = phone;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
