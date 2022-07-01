package Static;

public class Lens {

    private int minFocalLength;
    private int maxFocalLength;

    private static int lensCounter;

    // Constructors
    public Lens() {
        this.minFocalLength = 60;
        this.maxFocalLength = 240;

        lensCounter++;
    }
    public Lens(int min, int max) throws  NumberFormatException {
            if (min < max) {
                minFocalLength = min;
                maxFocalLength = max;
                lensCounter++;
            }
            else {
                throw new NumberFormatException("Max Focal length can`t be lower than mins!");
            }
    }

    @Override
    public String toString() {
        return  " Lens:\t MinFocal: " + minFocalLength +
                "\n\t\t MaxFocal: " + maxFocalLength;
    }

    // Setters & Getters
    public int getMinFocalLength() {
        return minFocalLength;
    }
    public void setMinFocalLength(int minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }
    public void setMaxFocalLength(int maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    public int getLensCounter() {
        return lensCounter;
    }
}
