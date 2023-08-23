
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared){
        int apart1 = this.squares * this.princePerSquare;
        int apart2 = compared.squares * compared.princePerSquare;
        return Math.abs(apart1 - apart2);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return this.squares * this.princePerSquare > compared.squares * compared.princePerSquare;
    }
}
