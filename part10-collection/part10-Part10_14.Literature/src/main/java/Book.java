/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class Book {
    private String name;
    private int minAge;
    
    public Book(String name, int minAge){
        this.name = name;
        this.minAge = minAge;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getMinAge(){
        return this.minAge;
    }
    
    public String toString(){
        return this.name + " (recommended for " + this.minAge + " year-olds or older)";
    }
}
