package Static;

public class Camera {

    private String brand;
    private int megaPixels;
    private int displaySize;
    private boolean flag;
    private Lens lens;

    private static int CameraCounter;

    // Constructor
    public Camera() {
        this.brand = "Xiaomi";
        this.megaPixels = 1040;
        this.displaySize = 360;
        this.flag = true;
        this.lens = new Lens();

        CameraCounter++;
    }
    public Camera(String brand,int megaPixels,int displaySize,boolean flag,Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.flag = flag;
        this.lens = lens;

        CameraCounter++;
    }

    @Override
    public String toString() {
        return "Camera:  Brand: " + brand +
                "\n\t\t MegaPixels: " + megaPixels +
                "\n\t\t DisplaySize: " + displaySize +
                "\n\t\t Colored: " + (flag? "Yes" : "No") +
                "\n" + getLens().toString();
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
