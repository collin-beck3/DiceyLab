public class Simulation {

public static void main(String[] args) {
    Dice dice = new Dice(6, 2);     // Create a dice object with 6 sides and n dice to roll
    Bins bins = new Bins(13); // Create bins to store the counts of each possible outcome
    int numrolls = 1000000; // Number of rolls to simulate

    System.out.println(); 
    System.out.println("Rolling the dice...");
    for (int i = 0; i < numrolls; i++) {                      // loop to roll the dice n times
        int result = dice.roll();
        bins.increment(result); // Increment the count for the rolled result
        System.out.println("Roll " + (i + 1) + ": " + " Total: " + result);         //print result 
    }

    System.out.println("\nResults:");
    for (int i = 2; i<= 12; i++) { 
        double percentage = (bins.getCount(i) * 100.0) / numrolls; 
        System.out.printf("Total %d: %5d times (%.2f%%)%n", i, bins.getCount(i), percentage); 
    }
}
}

