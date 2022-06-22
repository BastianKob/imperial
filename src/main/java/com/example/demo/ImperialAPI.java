package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ImperialAPI {
    @Id
    public int id;
    private double inches;
    private double centimeters;
    private double yards;
    private double meters;

    ImperialAPI(int id, double inches, double yards){
        this.id = id;
        this.inches = inches;
        this.centimeters = InchToCentimeter(inches);
        this.yards = yards;
        this.meters = YardToMeter(yards);
    }
    public double InchToCentimeter(double inch){
        return inch * 2.54;
    }
    public double YardToMeter(double yard){
        return yard * 0.9144;
    }

    @Override
    public String toString() {
        return "ImperialAPI{inches=" + inches + ", centimeters=" + centimeters + ", yards=" + yards + ", meters=" + meters + "}";
    }
}
