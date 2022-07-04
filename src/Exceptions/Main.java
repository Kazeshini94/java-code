package Exceptions;


import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        String again;
        Timer timer = new Timer(0, 0);


        try {
            timer.run();
        } catch (InterruptedException e) {
            System.out.println("Timer Interrupted! Use go to keep going !");
            again = sc.nextLine();
            try {
                if (again.equalsIgnoreCase("GO")) {
                    timer.run();
                }
            } catch (InterruptedException e1) {
                System.out.println("Timer Interrupted! Use go to keep going !");
                again = sc.nextLine();
                try {
                    if (again.equalsIgnoreCase("GO")) {
                        timer.run();
                    }
                } catch (InterruptedException e2) {
                    System.out.println("Timer Interrupted! Use go to keep going !");
                    again = sc.nextLine();
                    try {
                        if (again.equalsIgnoreCase("GO")) {
                            timer.run();
                        }
                    } catch (InterruptedException e3){
                    } finally {
                        timer.run();
                    }
                }

            }
        }
    }
}
