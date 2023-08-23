
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        this.advance(1);
    }
    
    public void advance(int howManyDays){
        if(this.day + howManyDays > 30){
            howManyDays -= (30 - this.day);
            this.month++;
            
            if((int)(Math.floor(howManyDays / 30)) + this.month > 12){
                for(int i = howManyDays; i > 0;){
                    if(this.month + 1 > 12){
                        this.month = 1;
                        this.year++;
                    } else{
                        this.month++;
                    }
                    i -= 30;
                }
                if(howManyDays % 30 == 0){
                    this.day = 30;
                } else{
                    this.day = howManyDays % 30;
                }                
            } else{
                this.month += (int)Math.floor(howManyDays / 30);
                this.day = howManyDays % 30;
            }
        } else{
            this.day += howManyDays;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);

        return newDate;
    }

}
