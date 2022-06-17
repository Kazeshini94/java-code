import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Random rng = new Random(3);
        ArrayList<Integer> usedNumber = new ArrayList<>();

        int[] input = new int[10000];
        int len = input.length;
        int roll;

        for (int i = 0; i < len; i++) {                                               // Declare Variables in the Array!
            do {
                roll = rng.nextInt(0, input.length * 10);
            }
            while (usedNumber.contains(roll));
            usedNumber.add(roll);
            input[i] = roll;
        }

        long startTime = System.currentTimeMillis();
        for (int i = 1; i < len; ++i) {    // Since input[0] gets sorted into an array with itself as the only variable,
            int flow = input[i];                             // we start our loop at input[i] which begins at input[1] !
            int check = i - 1;                                           // Variable to compare input[i] to input[check]

            while (check >= 0 && input[check] > flow) {                 // Compares input[i] with all variables before !
                input[check + 1] = input[check];                                // as long as there a lower Variables !!
                check -= 1;
            }
            input[check + 1] = flow;                                         // If no Variables are Lower than Input[i],
        }                                                                              // Set input[i] at that position!
        System.out.println(Arrays.toString(input));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
/*
        Be Careful to remember the whole input-array is the unsorted Base,
        from which the first Variable gets taken and put into a sorted Array.
        Then the Loop starts to take input [i], check the value with every input-value before input[i]
        and set it at the right Place in the sorted Array ( it checks the array from input[i] to left! )
        The unsorted Array gets pushed to the right and the first Loop is finished.
        This Continues until all Variables in the sorted Array are at the right place!
        !! Careful ! After one iteration of the loop the new Base Array is the sorted Array to the left
        and the unsorted to the right combining both into the so-called new Base Array for the next loop !!
        Example:      int [] arr = {4,7,1,8,3};
                      for(i=2; 2<5; i++)  {   int c=i-1, f=arr[i];
                                              while(c>=0 && arr[c]>f) {  arr[c+1] = arr[i]; c-=1;  }
                                              arr[c+1] = arr[i];   This Line here SETS the Position in the sorted Array!
                                  The While-loop above checks arr[i] until there is no lower number in the sorted Array!
 */
