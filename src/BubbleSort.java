import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] input = {4,7,1,8,3};
        int len = input.length;


            for(int j=0; j < len-1 ; j++) {
                int flow = input[j];
                int check = j+1;

                while (check <= 5 && input[check-1] > flow) {                 // Compares input[i] with all variables before !
                    input[check] = input[j];                                // as long as there a lower Variables !!
                    check +=1;
                }
                input[check] = input[j];
                System.out.println(Arrays.toString(input));
            }

    }
}
