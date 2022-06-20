import java.util.*;

public class MaxMinValue {
    public static void main(String[] args) {

        Random rng = new Random();

        int max, min, roll;
        int[] array = new int[695000];
        for (int i = 0; i < array.length; i++) {
            roll = rng.nextInt(0, array.length * 10);
            array[i] = roll;
        }

        max = mergeMax(array, 0);
        min = mergeMin(array, 0);

        System.out.println(Arrays.toString(array));
        System.out.println("Highest Number: " + max + "\nLowest Number: " + min);
    }

    static int mergeMax(int[] array, int index) {
        if (index >= array.length - 1) {
            return 0;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        int indexR = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < mid) {
                left[i] = array[i];
            } else {
                right[indexR] = array[i];
                indexR++;
            }
        }
        mergeMax(left, index + 1);
        mergeMax(right, index + 1);

        int max = 0, checkL = 0, checkR = 0;

        while (checkL < left.length) {
            max = Math.max(max, left[checkL++]);
        }
        while (checkR < right.length) {
            max = Math.max(max, right[checkR++]);
        }
        return max;
    }

    static int mergeMin(int[] array, int index) {
        if (index >= array.length - 1) {
            return 0;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        int indexR = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < mid) {
                left[i] = array[i];
            } else {
                right[indexR] = array[i];
                indexR++;
            }
        }
        mergeMin(left, index + 1);
        mergeMin(right, index + 1);

        int min = 0, checkL = left.length - 1, checkR = right.length - 1;

        while (checkL >= 1) {
            min = Math.min(left[checkL], left[--checkL]);
        }
        while (checkR >= 0) {
            min = Math.min(min, right[checkR--]);
        }
        return min;
    }
}
//  Unhappy Solution its fast but Stack Overflow happens if the input gets too big :)
//    public static int maxValue(int[] arr, int index) {
//        if (index >= arr.length - 2) {
//            return Math.max(arr[index], arr[index + 1]);
//        }
//        int max;
//        max = maxValue(arr, index + 1);
//
//        return Math.max(arr[index], max);
//        }
//        public static int minValue (int[] arr, int index){
//
//        if (index >= arr.length - 2) {
//            return Math.min(arr[index], arr[index + 1]);
//        }
//        int min;
//        min = minValue(arr, index + 1);
//
//        return Math.min(arr[index], min);
