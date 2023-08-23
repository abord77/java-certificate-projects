
public class Dog extends Animal implements NoiseCapable{
    
    public Dog(String dogName){
        super(dogName);
    }
    
    public Dog(){
        this("Dog");
    }
    
    public void makeNoise(){
        this.bark();
    }
    
    public void bark(){
        System.out.println(super.getName() + " barks");
    }
}
