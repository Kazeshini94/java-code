package DataStructures;

import java.util.*;

public class BubbleSortList {
    public static void main(String[] args) {

        Random rng = new Random();
        ArrayList<Integer> usedNumber = new ArrayList<>();
        int roll, len = 10000;

        for (int i = 0; i < len; i++) {
            do {
                roll = rng.nextInt(0, len * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
        }
        // Actual Time in Milli-seconds!
        long startTime = System.currentTimeMillis();
        // Sorting starts here
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                int flow = usedNumber.get(j);
                int check = j - 1;

                if (usedNumber.get(check) > flow) {
                    usedNumber.set(j, usedNumber.get(check));
                    usedNumber.set(check, flow);
                }
            }
        }
        System.out.println(usedNumber);
        // Actual Time - StartTime  = Time the program took to Sort the Array!
        System.out.println("Sorted in: " + (System.currentTimeMillis() - startTime) + "ms!");
    }
}