public class Simulation {

public static void main(String[] args) {
    Dice dice = new Dice(6, 2); // Create a dice object with 6 sides and n dice to roll

    System.out.println(); 
    System.out.println("Rolling the dice...");
    for (int i = 0; i < 10; i++) { 
        int result = dice.roll();
        System.out.println("Roll " + (i + 1) + ": " + " Total: " + result);
    }
}

}
