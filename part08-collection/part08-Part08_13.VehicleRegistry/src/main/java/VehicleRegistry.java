
import java.util.*;


public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.registry.containsKey(licensePlate)){
            return false;
        }
        
        this.registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(!this.registry.containsKey(licensePlate)){
            return false;
        }
        
        this.registry.remove(licensePlate, this.registry.get(licensePlate));
        return true;
    }
    
    public void printLicensePlates(){
        for(LicensePlate print : this.registry.keySet()){
            System.out.println(print);
        }
    }
    
    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        for(String owner : this.registry.values()){
            if(!names.contains(owner)){
                names.add(owner);
            }
        }
        
        for(String print : names){
            System.out.println(print);
        }
    }
}
