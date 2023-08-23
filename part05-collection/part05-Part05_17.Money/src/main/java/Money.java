
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int euro = this.euros + addition.euros();
        int cent = this.cents + addition.cents();
        Money newMoney = new Money(euro, cent);
        
        return newMoney;
    }
    
    public Money minus(Money decreaser){
        int euro = this.euros - decreaser.euros();
        int cent = this.cents - decreaser.cents();
        if(cent < 0){
            euro -= 1;
            cent = 100 - (cent * -1);
        }
        
        if(euro < 0){
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        
        Money newMoney = new Money(euro, cent);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        } else if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }
}
