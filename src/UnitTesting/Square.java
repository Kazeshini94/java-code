package UnitTesting;

public class Square {

    public int calculate(int length) throws IllegalArgumentException {
        if (length < 0) {
            throw new IllegalArgumentException("Length can`t be negative!");
        }

        return length*length;
    }
}