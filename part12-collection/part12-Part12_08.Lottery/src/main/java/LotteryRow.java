import java.util.ArrayList;
import java.util.Random;

    public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        }
        return false;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random rand = new Random();
        while(this.numbers.size() < 7){
            int temp = rand.nextInt(40) + 1;
            if(this.containsNumber(temp)){
                continue;
            }
            this.numbers.add(temp);
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}

