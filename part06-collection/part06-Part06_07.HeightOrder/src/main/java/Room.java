
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;
    
    public Room(){
        this.room = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.room.isEmpty();
    }
    
    public void add(Person person){
        this.room.add(person);
    }
    
    public ArrayList<Person> getPersons(){
        return this.room;
    }
    
    public Person shortest(){
        if(room.isEmpty()){
            return null;
        }
        
        Person returnObj = this.room.get(0);
        for(Person pers : this.room){
            if(pers.getHeight() < returnObj.getHeight()){
                returnObj = pers;
            }
        }
        
        return returnObj;
    }
    
    public Person take(){
        Person temp = this.shortest();
        room.remove(temp);
        return temp;
    }
}
