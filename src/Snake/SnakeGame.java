import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeGame extends JPanel {

    private static int refreshRate = 250;
    private Snake snake;
    private static final int GRID_SIZE = 25;
    private static final int TILES = 10;
    private Segment newSegment = new Segment(TILES - 2, TILES - 2);
    private static final int WINDOW_SIZE = GRID_SIZE * TILES + GRID_SIZE / 2;
    private static boolean isRunning = true;
    private static final Random random = new Random(1);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.CYAN);
        for (Segment segment : snake.segments) {
            g2d.fillRect(segment.xPos * GRID_SIZE, segment.yPos * GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }
        g2d.setColor(Color.BLUE);
        g2d.fillRect(newSegment.xPos * GRID_SIZE, newSegment.yPos * GRID_SIZE, GRID_SIZE, GRID_SIZE);
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("Snake Demo");

        SnakeGame snakeGame = new SnakeGame();
        snakeGame.snake = new Snake();
        List<Segment> segments = new ArrayList<>();
        segments.add(new Segment(0, 0));
        segments.add(new Segment(1, 0));
        segments.add(new Segment(2, 0));
        snakeGame.snake.segments = segments;
        snakeGame.createNewSegment();

        frame.add(snakeGame);
        frame.setSize(WINDOW_SIZE, WINDOW_SIZE + GRID_SIZE);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                snakeGame.updateMovemenet(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });

        // GameLoop
        while (isRunning) {
            snakeGame.moveSnake();
            snakeGame.checkCollision();
            snakeGame.repaint();
            Thread.sleep(refreshRate);
        }

        JOptionPane.showMessageDialog(frame, "You lost. The only way to win is to never play");
        isRunning = true;
        frame.dispose();
        // Restarts the Game!
        main(args);
    }

    // FIXME - 1
    // Implementiere die Methode, mit der sich die Schlange sich immer fortbewegt
    // Hierzu muss jedes Segment in die Position des Nachfolgers und das aller erste Segment muss in die
    // aktuelle Bewegungsrichtung der Schlange
    private void moveSnake() {
        // Create a New Segment
        // Which removes the first Segment in the List and adds Itself as new Segment to the end of the List!
        Segment segment = snake.segments.remove(0);
        segment.xPos = snake.xMov + snake.segments.get(snake.segments.size() - 1).xPos;
        if (segment.xPos >= TILES) {
            segment.xPos %= TILES;
        }
        if (segment.xPos <= -1) {
            segment.xPos = TILES;
        }
        segment.yPos = snake.yMov + snake.segments.get(snake.segments.size() - 1).yPos;
        if (segment.yPos >= TILES) {
            segment.yPos %= TILES;
        }
        if (segment.yPos <= -1) {
            segment.yPos = TILES;
        }
        snake.segments.add(segment);

    }

    private void updateMovemenet(int key) {
        switch (key) {
            case KeyEvent.VK_W -> {
                if(snake.yMov == 0) {
                    snake.xMov = 0;
                    snake.yMov = -1;
                }
            }
            case KeyEvent.VK_A -> {
                if (snake.xMov == 0) {
                    snake.xMov = -1;
                    snake.yMov = 0;
                }
            }
            case KeyEvent.VK_S -> {
                if(snake.yMov == 0) {
                    snake.xMov = 0;
                    snake.yMov = 1;
                }
            }
            case KeyEvent.VK_D -> {
               if(snake.xMov == 0) {
                   snake.xMov = 1;
                   snake.yMov = 0;
               }
            }
        }
    }

    private void createNewSegment() {
        newSegment = new Segment(random.nextInt(TILES - 1), random.nextInt(TILES - 1));
    }

    private void checkCollision() {
        Segment head = snake.segments.get(snake.segments.size() - 1);
        if (head.xPos == newSegment.xPos && head.yPos == newSegment.yPos) {
            snake.segments.add(newSegment);
            newSegment = null;
            createNewSegment();
            while (refreshRate > 175) refreshRate -= 15;
            while (refreshRate > 100) refreshRate -= 5;
        }

        for (int i = 0; i < snake.segments.size() - 2; i++) {
            if (head.xPos == snake.segments.get(i).xPos && head.yPos == snake.segments.get(i).yPos) {
                isRunning = false;
                break;
            }
        }
    }
}