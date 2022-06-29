package OPP1.Static;

public class Lens {

    private int minFocalLength;
    private int maxFocalLength;

    public static int lensCounter;

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
            }
            else {
                throw new NumberFormatException("Max Focal length can`t be lower than mins!");
            }

        lensCounter++;
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
