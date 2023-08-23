
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.5){
            this.money += 2.5;
            this.affordableMeals++;
            return payment - 2.5;
        } else {
            this.eatHeartily(payment + this.money);
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.3){
            this.money += 4.3;
            this.heartyMeals++;
            return payment - 4.3;
        } else {
            return payment;
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
        if(card.balance() >= 2.5){
            card.takeMoney(2.5);
            this.affordableMeals++;
            return true;
        } else{
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.balance() >= 4.3){
            card.takeMoney(4.3);
            this.heartyMeals++;
            return true;
        } else{
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum >= 0){
            card.addMoney(sum);
            this.money += sum;
        } 
    }

    @Override
    public String toString() {
        return "money: " + this.money + ", number of sold affordable meals: " + this.affordableMeals + ", number of sold hearty meals: " + this.heartyMeals;
    }
}
