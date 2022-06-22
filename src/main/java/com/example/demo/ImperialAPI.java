package com.example.demo;

import javax.persistence.Entity;


@Entity
public class ImperialAPI {
    public double InchToCentimeter(double inch){
        return inch * 2.54;
    }
    public double YardToMeter(double yard){
        return yard * 0.9144;
    }
}
