package DataStructures;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {

        Random rng = new Random();
        List<Integer> usedNumber = new ArrayList<>();
        int[] arr = new int[10000];
        long startTime;
        int roll,len = arr.length;
        // Declaring random values to the Array!
        for (int i = 0; i < len; i++) {
            do {
                roll = rng.nextInt(0, len * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
            arr[i] = roll;
        }
        startTime = System.currentTimeMillis();
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Completed in: " + (System.currentTimeMillis() - startTime) + "ms!");
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int counter=0;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                left[i] = arr[i];
            } else {
                right[counter] = arr[i];
                counter++;
            }
        }
        // Recursion until both Arrays are divided to size 1 !
        mergeSort(left);
        mergeSort(right);
        // Merge Left and Right into arr in right order!
        merge(arr, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        // Integers to Pick the right Value from each Array!
        int checkIndex = 0, checkL = 0, checkR = 0;
        // Comparing Values in Both Sub-Arrays and placing it in the right position!
        while (checkL < left.length && checkR < right.length) {
            // Going from Low to High number!
            if (left[checkL] < right[checkR]) {
                array[checkIndex] =  left[checkL];
                checkL++;
            } else {
                array[checkIndex] = right[checkR];
                checkR++;
            }
            checkIndex++;
        }
        // If only Left Array is left append!
        while (checkL < left.length) {
            array[checkIndex] = left[checkL];
            checkIndex++;
            checkL++;
        }
        // Same for Right Array until nothing left!
        while (checkR < right.length) {
            array[checkIndex] = right[checkR];
            checkIndex++;
            checkR++;
        }
    }
}


