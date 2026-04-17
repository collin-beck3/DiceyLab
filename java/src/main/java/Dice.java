import java.util.Random;

public class Dice {

    private int sides;
    private int numberOfDice;           // stores the number of dice to be rolled
    private Random random;

    public Dice(int sides, int numberOfDice) {
        this.sides = sides;
        this.numberOfDice = numberOfDice;
        this.random = new Random();
    }

    public int roll() {
        int total = 0;
        for (int i = 0; i < numberOfDice; i++) {            // loop to roll each die one by one 
            total += random.nextInt(sides) + 1;             // adds each roll to the running total
        }
        return total;
    }
}
