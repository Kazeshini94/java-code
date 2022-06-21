import java.util.ArrayList;
import java.util.Random;

public class BingoCard {
    public static void main(String[] args) {

        Random rng = new Random();

        int roll, magic = 15;
        ArrayList<Integer> usedNumber = new ArrayList<>();

        String[] name = {"B", "I", "N", "G", "O"};
        int[][] number = new int[5][5];

        // Declare Variables for the Array!
        for (int card = 0; card < 5; card++) {
            for (int column = 0; column < 5; column++) {
                int lowerBound = card * magic + 1;
                int upperBound = lowerBound + magic;
                do {
                    roll = rng.nextInt(lowerBound, upperBound);
                }
                while (usedNumber.contains(roll));
                usedNumber.add(roll);
                number[card][column] = roll;
            }
        }
        // Output of BINGO
        for (int i = 0; i < 5; i++) {
            System.out.printf("%3s", name[i]);
        }
        System.out.println("\n");

        // Output of the Card
        for (int card = 0; card < 5; card++) {
            for (int column = 0; column < 5; column++) {
                if (number[card][column] == number[2][2]) {
                    System.out.printf("%3s", "");
                } else {
                    System.out.printf("%3d", number[column][card]);
                }
            }
            System.out.println();
        }
    }
}