package Exceptions;

public class Timer {

    static int day = 0;
    private int hour;
    private int min;

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

        Thread.sleep(10);
        setMin(min++);;
        if (getMin() == 60) {
            setHour(hour++);
            setMin(min -= 60);
        }
        if (getHour() == 24) {
            System.out.println("A New Day");
            day++;
            setHour(hour -= 24);
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
