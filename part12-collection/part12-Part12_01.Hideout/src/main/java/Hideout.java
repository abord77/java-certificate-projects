/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class Hideout<T> {
    private T hiding;
    
    public Hideout(){
        
    }
    
    public void putIntoHideout(T toHide){
        this.hiding = toHide;
    }
    
    public boolean isInHideout(){
        if(this.hiding == null){
            return false;
        }
        return true;
    }
    
    public T takeFromHideout(){
        if(this.isInHideout()){
            T temp = this.hiding;
            this.hiding = null;
            return temp;
        }
        return null;
    }
}
