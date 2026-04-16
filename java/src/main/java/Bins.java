
public class Bins {
    private int[] counts; // Array to store the count of each possible outcome

    // Constructor to initialize the bins based on the number of dice and sides
    public Bins(int size) {
        this.counts = new int[size];
    }
    // Method to increment the count for a specific outcome
    public void increment(int value) { 
        counts[value]++; 
    }

    // Method to get the count for a specific outcome
    public int getCount(int value) { 
        return counts[value];
    }

    public int getSize() {
        return counts.length;
    }
}
