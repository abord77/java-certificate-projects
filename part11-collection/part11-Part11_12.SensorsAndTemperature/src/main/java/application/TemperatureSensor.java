/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;



public class TemperatureSensor implements Sensor{
    private int value;
    private boolean state;
    
    public TemperatureSensor(){
        this.value = 0;
        this.state = false;
    }
    
    public boolean isOn(){
        return this.state;
    }
    
    public void setOn(){
        this.state = true;
    }
    
    public void setOff(){
        this.state = false;
    }
    
    public int read(){
        this.state = true;
        if(this.state ==  true){
            this.value = new Random().nextInt(61);
            if(this.value > 30){
                this.value -= 61;
            }
        }
        return this.value;
    }
}