import java.util.Random;
import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        int gen, length;
        System.out.println("How big shall the field be?");
        length = sc.nextInt();
        System.out.println("How many Generations do you wanna see?");
        gen = sc.nextInt();

        boolean[][] map = new boolean[length][length];
        // Base Map !
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map.length; x++) {
                // Random Layout centered to 1/3 of the map !
                if ( (y > map.length/3 && y < map.length-(map.length/3))
                        && (x > map.length/3 && x < map.length-(map.length/3)) ) {
                    map[y][x] = rng.nextBoolean();
                }
                /*  Base Layout to Check Functionality !
                if (y == 4 && x == 3 || y == 4 && x == 4 || y == 4 && x == 5 || y == 3 && x == 5 || y == 2 && x == 4) {
                    map[y][x] = true;
                }
                */
                System.out.printf("%2s",map[y][x] ? "#" : " ");
            }
            System.out.println();
        }
        System.out.println();

        // Call to Recursive Function nextGeneration
        nextGeneration(neighborCheck(map), gen, map);
    }

    public static int[][] neighborCheck(boolean[][] map) {

        int[] vertical = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] diagonal = {0, -1, -1, -1, 0, 1, 1, 1};
        int[][] aliveNeighbors = new int[map.length][map.length];

        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map.length; x++) {
                // Counter for living neighbors
                int count = 0;
                for (int c = 0; c < 8; c++) {
                    int neighborY = y + vertical[c];
                    int neighborX = x + diagonal[c];
                    // Out of Bounds Correction
                    if (neighborY < 0) {
                        neighborY += map.length;
                    }
                    if (neighborX < 0) {
                        neighborX += map.length;
                    }
                    if (neighborY >= map.length) {
                        neighborY -= map.length;
                    }
                    if (neighborX >= map.length) {
                        neighborX -= map.length;
                    }
                    // Count living Neighbors
                    if (map[neighborY][neighborX]) {
                        count++;
                    }
                }
                aliveNeighbors[y][x] = count;
            }
        }
        return aliveNeighbors;
    }
    public static void nextGeneration (int[][] neighbor, int gen, boolean[][] map) throws InterruptedException {
        if (gen <= 0) {
            return;
        }
        boolean[][] alive = new boolean[map.length][map.length];

        for(int y = 0; y < neighbor.length; y++) {
            for(int x = 0; x < neighbor.length; x++) {
                if (map[y][x] && (neighbor[y][x] == 3 || neighbor[y][x] == 2)) {
                    alive[y][x] = true;
                }
                if ( !map[y][x] && neighbor[y][x] == 3 ) {
                    alive[y][x] = true;
                }
                if (neighbor[y][x] > 3 || neighbor[y][x] < 2) {
                    alive[y][x] = false;
                }
                System.out.printf("%2s",alive[y][x] ? "#" : " ");
            }
            System.out.println();
        }
        // Waiting Time before printing the next map!
        Thread.sleep(1000);
        // Important to not Load map into the last slot ! alive is the needed array for the next check!
        nextGeneration(neighborCheck(alive),gen -1, alive);
    }
}
  /*
               // First Solving attempt ! in nextGeneration this was the condition!
                    (neighbor[y][x] == 2 && (neighbor[y][x-1]== 3 && neighbor[y][x+1] == 3
                    || neighbor[y-1][x] == 3 && neighbor[y+1][x] == 3))

            // Problem lies here !
                if (map[y][x] && count == 3 || count == 2) {
                        map[y][x] = true;
                        }
                        if (!map[y][x] && count == 3 ) {
                        map[y][x] = true;
                        }
                        if (count > 3 || count < 2) {
                        map[y][x] = false;
                }
            // End of the problem !
*/


