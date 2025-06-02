import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyCanvas extends Canvas {

    private List<FloatingCircle> shapeList;
    private int width, height;

    public MyCanvas(int width, int height) {
        shapeList = new ArrayList<>();
        this.width = width;
        this.height = height;
    }

    public void addCircle() {
        int r = (int) (Math.random() * 100 + 100);
        int x = (int) (Math.random() * (width - 2 * r));
        int y = (int) (Math.random() * (height - 2 * r));
        int dx = (int) (Math.random() * 4);
        int dy = (int) (Math.random() * 4);

        FloatingCircle c = new FloatingCircle(
                x, y, r, dx, dy, width, height
        );
        System.out.println("add");
        shapeList.add(c);
        repaint();
    }

    public void rendering() {
        for (FloatingCircle c : shapeList) {
            c.update();
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.clearRect(0, 0, width, height);
        for (FloatingCircle c : shapeList) {
            g.drawOval(c.getX(), c.getY(), c.getRadius() * 2, c.getRadius() * 2);
        }
    }
}
