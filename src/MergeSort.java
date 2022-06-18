import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {

        Random rng = new Random();
        ArrayList<Integer> usedNumber = new ArrayList<>();

        long startTime;
        int[] array = new int[100000];
        int roll;
        // Declaring Random numbers for the Array! !!No double numbers!!
        for (int i = 0; i < array.length; i++) {
            do {
                roll = rng.nextInt(0, array.length * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
            array[i] = roll;
        }
        startTime = System.currentTimeMillis();
        mergeSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Completed in: " + (System.currentTimeMillis() - startTime) + "ms!");
    }

    public static void mergeSort(int[] array) {
        if (array.length == 1) {
            return;
        }

        int mid = array.length/2;
        int counter = 0;

        int[] left = new int[mid];
        int[] right = new int[array.length-mid];
        for (int i = 0; i < array.length; i++) {
            if ( i < mid) {
                left[i] = array[i];
            }
            else {
                right[counter] = array[i];
                counter++;
            }
        }
        // Recursion until both Arrays are divided to size 1 !
        mergeSort(left);
        mergeSort(right);
        // Merge Left and Right into array in right order!
        merge(array,left,right);
    }

    public static void merge(int[] arr,int[] left,int[] right) {
        // Integers to Pick the right Value from each Array!
        int checkIndex = 0,checkL = 0,checkR = 0;
            // Comparing Values in Both Sub-Arrays and placing it in the right position!
            while ( checkL < left.length && checkR < right.length ) {
                // Going from Low to High number!
                if (left[checkL] < right[checkR]) {
                    arr[checkIndex] = left[checkL];
                    checkIndex++;
                    checkL++;
                } else {
                    arr[checkIndex] = right[checkR];
                    checkIndex++;
                    checkR++;
                }
            }
            // If only Left Array is left append!
            while (checkL < left.length) {
                arr[checkIndex] = left[checkL];
                checkIndex++;
                checkL++;
            }
            // Same for Right Array until nothing left!
            while (checkR < right.length) {
                arr[checkIndex] = right[checkR];
                checkIndex++;
                checkR++;
            }
    }
}


