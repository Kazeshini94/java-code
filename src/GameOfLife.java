public class GameOfLife {
    public static void main(String[] args) {
        int length = 10;
        boolean[][] map = new boolean[length][length];

        baseBoard(map);

    }

    public static void baseBoard(boolean[][] map) {
        boolean[][] compare = new boolean[map.length][map.length];

        int[] diagonal = {-1, -1, 1, 0, 1, 1, -1, 0};
        int[] vertical = {0, -1, -1, -1, 0, 1, 1, 1};


        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map.length; x++) {
                int count = 0;
                for (int c = 0; c < 8; c++) {
                    int by = y + diagonal[c];
                    int bx = x + vertical[c];
                    if (bx >= 0 && bx <= map.length || by >= 0 && by <= map.length && map[y][x] == true) {
                        count++;
                    }
                    if (count == 3 || count == 2) {
                        map[y][x] = true;
                    } else {
                        map[y][x] = false;
                    }
                }
                if (y == 4 && x == 4 || y == 5 && x == 4 || y == 6 && x == 4) {
                    map[y][x] = true;
                }
                compare[y][x] = map[y][x];
                System.out.print(map[y][x] ? "#" : "_");
            }
            System.out.println();
        }
        baseBoard(compare);
    }
}






