import java.util.*;

public class MergeSortList {

    public static void main(String[] args) {
        Random rng = new Random();
        long startTime;
        ArrayList<Integer> list = new ArrayList<>();
        int roll, len = 100000;

        // Declaring Random numbers for the Array! !!No double numbers!!
        for (int i = 0; i < len; i++) {
            do {
                roll = rng.nextInt(0, len * 10);
            }
            while (list.contains(roll));
            list.add(roll);
        }

        startTime = System.currentTimeMillis();
        mergeSort(list);
        System.out.println(list);
        System.out.println("Sorting completed in: " + (System.currentTimeMillis() - startTime) + "ms!");
    }

    public static void mergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;

        ArrayList<Integer> left = new ArrayList<>(mid);
        ArrayList<Integer> right = new ArrayList<>(list.size()-mid);
        for (int i = 0; i < list.size(); i++) {
            if (i < mid) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        // Recursion until both Arrays are divided to size 1 !
        mergeSort(left);
        mergeSort(right);
        // Merge Left and Right into list in right order!
        merge(list, left, right);
    }
    public static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        // Integers to Pick the right Value from each Array!
        int checkIndex = 0, checkL = 0, checkR = 0;
        // Comparing Values in Both Sub-Arrays and placing it in the right position!
        while (checkL < left.size() && checkR < right.size()) {
            // Going from Low to High number!
            if (left.get(checkL) < right.get(checkR)) {
                arr.set(checkIndex, left.get(checkL));
                checkL++;
            } else {
                arr.set(checkIndex, right.get(checkR));
                checkR++;
            }
            checkIndex++;
        }
        // If only Left Array is left append!
        while (checkL < left.size()) {
            arr.set(checkIndex, left.get(checkL));
            checkIndex++;
            checkL++;
        }
        // Same for Right Array until nothing left!
        while (checkR < right.size()) {
            arr.set(checkIndex, right.get(checkR));
            checkIndex++;
            checkR++;
        }
    }
}