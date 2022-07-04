package Exceptions;

public class Timer {

    static int day = 0;
    int hour;
    int min;

    public Timer(){
        this.hour = 0;
        this.min = 0;
    };

    public Timer(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }


    public void run() throws InterruptedException {
        if (day == 1)
            return;

        // One Tick of the Timer = 1 Min!
        Thread.sleep(1);
        min++;
        // Increasing the Hour Timer!
        if (min == 60) {
            hour++;
            min -= 60;
        }
        if (hour == 7 && min == 30) {
            System.out.println("7:30 !WAKE UP! 7:30");
            throw new InterruptedException("Alarm Clock");
        }

        if (hour == 8 && min == 30) {
            System.out.println("8:30 !CodersBay Start Learning! 8:30");
            throw new InterruptedException("Work");
        }

        if (hour == 12 && min == 30) {
            System.out.println("12:30 !! Lunch Break !! 12:30");
            throw new InterruptedException("Lunch");
        }

        if (hour == 24) {
            System.out.println("!!! End of the Day !!!");
            day++;
            hour -= 24;
        }
        run();
    }

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
}
