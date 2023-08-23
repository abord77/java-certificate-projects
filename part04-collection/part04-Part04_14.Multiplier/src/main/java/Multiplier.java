/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class Multiplier {
    private int multiple;
    
    public Multiplier(int number){
        this.multiple = number;
    }
    
    public int multiply(int number){
        return this.multiple * number;
    }
}
