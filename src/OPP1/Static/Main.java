package OPP1.Static;

public class Main {
    public static void main(String[] args) {

        Camera first = new Camera();
        Camera second = new Camera("Apple",8,42,false,new Lens(10,40));
        Camera third = new Camera("Samsung",420,240,true,new Lens(80,340));


        first.setLens(new Lens());
        first.setBrand("Nokia");
        System.out.println(first.getCameraCounter());
    }
}
