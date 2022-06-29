package OPP1.Static;

public class Camera {

    private String brand;
    private int megaPixels;
    private int displaySize;
    private boolean flag;
    private Lens lens;

    public static int CameraCounter;

    // Constructor
    public Camera() {
        this.brand = "";
        this.megaPixels = 0;
        this.displaySize = 0;
        this.flag = true;
        this.lens = new Lens(20,110);

        CameraCounter++;
    }

    // Setter & Getter
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }
    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySize() {
        return displaySize;
    }
    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Lens getLens() {
        return lens;
    }
    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public int getCameraCounter() {
        return CameraCounter;
    }

    public int getLensCounter() {
        return  lens.getLensCounter();
    }
}
