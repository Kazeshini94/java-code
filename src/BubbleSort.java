import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random rng = new Random();
        ArrayList<Integer> usedNumber = new ArrayList<>();
        int[] input = new int[100000];
        int roll, len = input.length;

        for (int i = 0; i < len; i++) {
            do {
                roll = rng.nextInt(0, input.length * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
            input[i] = roll;
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < len - 1; i++) {                                                       // Sorting starts here
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
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
