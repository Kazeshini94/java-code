package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {

        Random rng = new Random();
        ArrayList<Integer> usedNumber = new ArrayList<>();
        int[] input = new int[10000];
        int roll, len = input.length;

        // Declare Variables in the Array
        for (int i = 0; i < len; i++) {
            do {
                roll = rng.nextInt(0, input.length * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
            input[i] = roll;
        }
        // Actual Time
        long startTime = System.currentTimeMillis();
        
        // Sorting starts here
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (input[i] > input[j]) {
                    int check = input[i];
                    input[i] = input[j];
                    input[j] = check;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        // Actual Time - StartTime  = Time the program took to Sort the Array!
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
