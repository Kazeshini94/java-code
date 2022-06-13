public class GameOfLife {
    public static void main(String[] args) {

        int length = 10;
        String cell;
        String alive= "#";
        String dead = " ";



        for(int column = 0; column < length; column++) {
            for(int row = 0; row < length; row++) {

                if
                    cell=alive;
                }else {
                    cell=dead;
                }

                System.out.printf("%2s",cell);
            }
            System.out.println();
        }

    }
}
