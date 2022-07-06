package Exceptions;

public class Timer {

    int day = 0;
    int hour;
    int min;

    public Timer() {
        this.hour = 0;
        this.min = 0;
    }

    public Timer(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }


    public Timer run(Timer timer) throws TimerInterruptedException {
        if (timer.day == 1)
            return timer;

        // Increasing the Hour Timer!
        if (timer.min == 60) {
            timer.hour++;
            timer.min -= 60;
        }

        if (timer.hour == 7 && timer.min == 30) {
            throw new TimerInterruptedException("7:30 !WAKE UP! 7:30");
        }

        if (timer.hour == 8 && timer.min == 30) {
            throw new TimerInterruptedException("8:30 !CodersBay Start Learning! 8:30");
        }

        if (timer.hour == 12 && timer.min == 30) {
            throw new TimerInterruptedException("12:30 !! Lunch Break !! 12:30");
        }

        if (timer.hour == 15 && timer.min == 30) {
            throw new TimerInterruptedException("15:30 !! Sweet Home !! 15:30");
        }

        if (timer.hour == 24) {
            System.out.println("!!! End of the Day !!!");
            timer.day++;
            timer.hour -= 24;
        }
        return timer;
    }

    @Override
    public String toString() {
        return "Time \n" + hour + ":" + min;
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
