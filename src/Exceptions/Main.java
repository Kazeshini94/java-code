package Exceptions;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String again;
        Timer timer = new Timer(0, 0);

        while (timer.day != 1) {
            try {
                Thread.sleep(10);
                timer.min++;
                //   System.out.println(timer);
                timer.run(timer);
            } catch (InterruptedException | TimerInterruptedException e) {
//                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("Timer Interrupted! Use go to keep going !");
                
            }
        }
    }
}