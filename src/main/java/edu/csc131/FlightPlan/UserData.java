package edu.csc131.FlightPlan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class UserData {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String address;
    private String travelTimeByCar;
    private String travelTimeByWalking;
    private double insurenceRate;
    private double mpg; 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String gettravelTimeByCar() {
        return travelTimeByCar;
    }

    public void settravelTimeByCar(String travelTimeByCar) {
        this.travelTimeByCar = travelTimeByCar;
    }

    public double getInsurenceRate() {
        return insurenceRate;
    }

    public void setInsurenceRate(double insurenceRate) {
        this.insurenceRate = insurenceRate;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public String getTravelTimeByWalking() {
        return travelTimeByWalking;
    }

    public void setTravelTimeByWalking(String travelTimeByWalking) {
        this.travelTimeByWalking = travelTimeByWalking;
    }
    
}
