/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class Cat extends Animal implements NoiseCapable{
    
    public Cat(String catName){
        super(catName);
    }
    
    public Cat(){
        this("Cat");
    }
    
    public void makeNoise(){
        this.purr();
    }
    
    public void purr(){
        System.out.println(super.getName() + " purrs");
    }
}
