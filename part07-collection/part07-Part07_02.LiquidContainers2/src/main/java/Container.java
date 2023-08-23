
public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount <= 0) {
            this.volume += 0;
        } else if (amount + this.volume >= 100) {
            this.volume = 100;
        } else {
            this.volume += amount;
        }
    }

    public void remove(int amount) {
        if (amount <= 0) {
            this.volume -= 0;
        } else if (this.volume - amount <= 0) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
    }
    
    public String toString(){
        return this.volume + "/100";
    }
}
