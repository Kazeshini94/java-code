import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random rng = new Random();
        ArrayList<Integer> usedNumber = new ArrayList<>();
        int[] input = new int[10000];
        int roll, len = input.length;

        for (int i = 0; i < len; i++) {
            do {
                roll = rng.nextInt(0, input.length * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
            input[i] = roll;
        }
        // Actual Time in Milli-seconds!
        long startTime = System.currentTimeMillis();
        // Sorting starts here
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                int flow = input[j];
                int check = j - 1;

                if (input[check] > flow) {
                    input[j] = input[check];
                    input[check] = flow;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        // Actual Time - StartTime  = Time the program took to Sort the Array!
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
