/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class MisplacingBox extends Box{

    public MisplacingBox(){
        
    }
    
    @Override
    public void add(Item item){
        return;
    }
    
    @Override
    public boolean isInBox(Item item){
        return false;
    }
}
