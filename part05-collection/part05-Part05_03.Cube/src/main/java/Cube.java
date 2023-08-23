/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class Cube {
    private int edgeLen;
    
    public Cube(int edgeLength){
        this.edgeLen = edgeLength;
    }
    
    public int volume(){
        return (int)Math.pow(this.edgeLen, 3);
    }
    
    public String toString(){
        return "The length of the edge is " + this.edgeLen + " and the volume " + volume();
    }
}
