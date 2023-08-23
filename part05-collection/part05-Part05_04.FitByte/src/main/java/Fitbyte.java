/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class Fitbyte {
    private int age;
    private int restingRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maxRate = 206.3 - (0.711 * this.age);
        double targetRate = (maxRate - this.restingRate) * (percentageOfMaximum) + this.restingRate;
        
        return targetRate;
        
        //Maximum = 206.3 - (0.711 * age)
        //(maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate
    }
}
