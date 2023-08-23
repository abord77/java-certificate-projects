/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class LiteracyData implements Comparable<LiteracyData>{
    private String country;
    private String gender;
    private int year;
    private double score;
    
    public LiteracyData(String country, String gender, int year, double score){
        this.country = country;
        String [] parts = gender.split(" ");
        this.gender = parts[1];
        this.year = year;
        this.score = score;
    }
    
    public double getScore(){
        return this.score;
    }
    
    @Override
    public int compareTo(LiteracyData object){
        if(object.getScore() < this.score){
            return 1;
        } else if(object.getScore() > this.score){
            return -1;
        } else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.score;
    }
}
