package Recursion;

import java.util.*;


public class Quicksort {
    public static void main(String[] args) {

        Random rng = new Random(9);
        ArrayList<Integer> list = new ArrayList<>();
        int roll,len = 10;

        for(int i = 0; i < len; i++) {
            do {
                roll = rng.nextInt(0, len * 10);
            }
            while (list.contains(roll));
            list.add(roll);
        }
    }
}
