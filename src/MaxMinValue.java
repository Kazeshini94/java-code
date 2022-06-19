import java.util.*;

public class MaxMinValue {
    public static void main(String[] args) {

        Random rng = new Random();
        ArrayList<Integer> usedNumber = new ArrayList<>();

        int max, min,roll;
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            do {
                roll = rng.nextInt(0, array.length * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
            array[i] = roll;
        }

        max = maxValue(array, 0);
        min = minValue(array, 0);

        System.out.println(Arrays.toString(array));
        System.out.println("Highest Number: " + max + "\nLowest Number: " + min);
    }

    public static int maxValue(int[] arr, int index) {
        // Divide
        if (index >= arr.length - 2) {
            return Math.max(arr[index], arr[index + 1]);
        }
        int max;
        max = maxValue(arr, index + 1);
        // Conquer
        return Math.max(arr[index], max);
        }

        public static int minValue (int[] arr, int index){
        // Divide
        if (index >= arr.length - 2) {
            return Math.min(arr[index], arr[index + 1]);
        }
        int min;
        min = minValue(arr, index + 1);
        // Conquer
        return Math.min(arr[index], min);
    }
}