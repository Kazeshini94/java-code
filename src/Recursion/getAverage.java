package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class getAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wieviele Noten gibt es zu Bewerten?");
        int result = 0, length = scanner.nextInt();

        int[] array =  new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Note: ");
            array[i] = scanner.nextInt();
            result += array[i];
        }
        System.out.printf("%s %.2f","Notendurchschnitt: ", (double) result / array.length);
    }
}
