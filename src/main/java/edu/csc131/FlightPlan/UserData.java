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

    private String address;//remove Me After Testing
    private int carMPG;
    private String preferredRank;
    private double travelTimeByCar;
    private double travelTimeByWalking;
    private double travelTimeByTransit;
    private double travelTimeByBike;

    private double travelDistanceByCar;
    private double travelDistanceByWalking;
    private double travelDistanceByTransit;
    private double travelDistanceByBike;

    private double[] rankCarbon;
    private double[] rankTime;
    private double[] rankCost;

    private String userEmail;


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

    public double gettravelTimeByCar() {
        return travelTimeByCar;
    }

    public void settravelTimeByCar(double travelTimeByCar) {
        this.travelTimeByCar = travelTimeByCar;
    }

    public double getTravelTimeByWalking() {
        return travelTimeByWalking;
    }

    public void setTravelTimeByWalking(double travelTimeByWalking) {
        this.travelTimeByWalking = travelTimeByWalking;
    }

    public int getCarMPG() {
        return carMPG;
    }

    public void setCarMPG(int carMPG) {
        this.carMPG = carMPG;
    }

    public double getTravelTimeByCar() {
        return travelTimeByCar;
    }

    public void setTravelTimeByCar(double travelTimeByCar) {
        this.travelTimeByCar = travelTimeByCar;
    }

    public double getTravelTimeByTransit() {
        return travelTimeByTransit;
    }

    public void setTravelTimeByTransit(double travelTimeByTransit) {
        this.travelTimeByTransit = travelTimeByTransit;
    }

    public double getTravelTimeByBike() {
        return travelTimeByBike;
    }

    public void setTravelTimeByBike(double travelTimeByBike) {
        this.travelTimeByBike = travelTimeByBike;
    }

    public double getTravelDistanceByCar() {
        return travelDistanceByCar;
    }

    public void setTravelDistanceByCar(double travelDistanceByCar) {
        this.travelDistanceByCar = travelDistanceByCar;
    }

    public double getTravelDistanceByWalking() {
        return travelDistanceByWalking;
    }

    public void setTravelDistanceByWalking(double travelDistanceByWalking) {
        this.travelDistanceByWalking = travelDistanceByWalking;
    }

    public double getTravelDistanceByTransit() {
        return travelDistanceByTransit;
    }

    public void setTravelDistanceByTransit(double travelDistanceByTransit) {
        this.travelDistanceByTransit = travelDistanceByTransit;
    }

    public double getTravelDistanceByBike() {
        return travelDistanceByBike;
    }

    public void setTravelDistanceByBike(double travelDistanceByBike) {
        this.travelDistanceByBike = travelDistanceByBike;
    }

    public double[] getRankCarbon() {
        return rankCarbon;
    }

    public void setRankCarbon(double[] rankCarbon) {
        this.rankCarbon = rankCarbon;
    }

    public double[] getRankTime() {
        return rankTime;
    }

    public void setRankTime(double[] rankTime) {
        this.rankTime = rankTime;
    }

    public double[] getRankCost() {
        return rankCost;
    }

    public void setRankCost(double[] rankCost) {
        this.rankCost = rankCost;
    }

    public String getPreferredRank() {
        return preferredRank;
    }

    public void setPreferredRank(String preferredRank) {
        this.preferredRank = preferredRank;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
