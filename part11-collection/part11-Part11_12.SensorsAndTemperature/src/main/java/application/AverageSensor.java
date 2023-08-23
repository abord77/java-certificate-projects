/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> reading;
    
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.reading = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public boolean isOn(){
        int i = 0;
        while(true){
            if(!this.sensors.get(i).isOn()){
                break;
            }
            if(i == this.sensors.size() - 1){
                return true;
            }
            i++;
        }
        return false;
    }
    
    public List<Integer> readings(){
        return this.reading;
    }
    
    public void setOn(){
        for(Sensor settingOn : this.sensors){
            settingOn.setOn();
        }
    }
    
    public void setOff(){
        for(Sensor settingOn : this.sensors){
            settingOn.setOff();
        }
    }
    
    public int read(){
        if(!this.isOn()){
            throw new IllegalArgumentException();
        }
        int average = 0;
        for(Sensor adding : this.sensors){
            average += adding.read();
        }
        this.reading.add((int)(average / this.sensors.size()));
        return (int)(average / this.sensors.size());
    }
}