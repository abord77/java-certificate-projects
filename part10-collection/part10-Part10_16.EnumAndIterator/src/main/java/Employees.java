
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raymo
 */
public class Employees {
    private List<Person> people;
    
    public Employees(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.people.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        for(Person adding : peopleToAdd){
            this.people.add(adding);
        }
    }
    
    public void print(){
        print(Education.HS);
        print(Education.BA);
        print(Education.MA);
        print(Education.PHD);
    }
    
    public void print(Education education){
        Iterator<Person> iterator = people.iterator();
        while(iterator.hasNext()){
            Person temp = iterator.next();
            if(temp.getEducation().equals(education)){
                System.out.println(temp);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = people.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
