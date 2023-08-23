
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Person)){
            return false;
        }
        
        Person temp = (Person) compared;
        
        if(this.name.equals(temp.name) &&
           this.birthday.equals(temp.birthday) &&
           this.height == temp.height &&
           this.weight == temp.weight){
            return true;
        }
        
        return false;
    }
}
