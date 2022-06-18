import java.util.Arrays;
import java.util.Random;

public class MaxValue {
    public static void main(String[] args) {

        Random rng = new Random();

        int max;
        int[] array = new int[20];

        for(int i = 0 ; i < array.length; i++) {
            array[i] = rng.nextInt(101);
        }

        max = maxValue(array, 0, array.length);

        System.out.println(Arrays.toString(array));
        System.out.println("Highest Number: "+max);
    }

    static int maxValue (int[] a, int index, int length) {
        if (index >= length - 2) {
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        int max;
        max = maxValue(a, index + 1, length);

        if (a[index] > max)
            return a[index];
        else
            return max;
    }


}
 