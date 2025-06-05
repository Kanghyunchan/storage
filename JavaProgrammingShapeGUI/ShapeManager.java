import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeManager extends Canvas {
    private List<Shape> shapeList;
    private boolean isDelete;
    public ShapeManager(){
        shapeList = new ArrayList<>();
        isDelete = false;
    }

    public void addObject(){
        int dx = (int) (Math.random() * 4 + 1);
        int dy = (int) (Math.random() * 4 + 1);
        switch ((int)(Math.random() * 4)){
            case 0: //원 생성
                int r = (int) (Math.random() * 100 + 100);
                int x = (int) (Math.random() * (getWidth() - 2 * r));
                int y = (int) (Math.random() * (getHeight() - 2 * r));
                Circle c = new Circle(
                        x, y, dx, dy, getWidth(), getHeight(), r);
                System.out.println("add circle");
                shapeList.add(c);

                break;
            case 1: //사각형 생성
                int widthC = (int) (Math.random() * 50 + 51);
                int heightC = (int) (Math.random() * 100 + 51);
                int xR = (int) (Math.random() * (getWidth() - widthC));
                int yR = (int) (Math.random() * (getHeight() - heightC));
                Rectangle rect = new Rectangle(
                        xR, yR, dx, dy, getWidth(), getHeight(), heightC, widthC
                );
                System.out.println("add rectangle");
                shapeList.add(rect);
                break;
            case 2: //삼각형 생성
                Triangle.Point[] points = new Triangle.Point[3];
                points[0] = new Triangle.Point((int) (Math.random() * getWidth()), (int) (Math.random() * getHeight()));
                points[1] = new Triangle.Point((int) (Math.random() * getWidth()), (int) (Math.random() * getHeight()));
                points[2] = new Triangle.Point((int) (Math.random() * getWidth()), (int) (Math.random() * getHeight()));
                Triangle triangle = new Triangle(dx, dy, getWidth(), getHeight(), points);

                System.out.println("add triangle");
                shapeList.add(triangle);
                break;
            case 3: //텍스트 생성
                int xT = (int) (Math.random() * (getWidth() - 100));
                int yT = (int) (Math.random() * (getHeight() - 50));
                String[] wordList = new String[5];
                wordList[0] = "으아아악";
                wordList[1] = "JAVAPROGRAMMING";
                wordList[2] = "이게되네이게되네";
                wordList[3] = "왜 안되지 \n왜안되지";
                wordList[4] = "끝났다 끝났다";
                ShapeText text = new ShapeText(xT, yT, dx, dy, getWidth(), getHeight(), 50, 100, wordList[(int) (Math.random() * 5)]);
                System.out.println("add text");
                shapeList.add(text);
                break;
        }
        repaint();
    }
    public void rendering(){
        for(Shape s : shapeList){
            s.update();
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if(isDelete){
            g.clearRect(0, 0, getWidth(), getHeight());
            isDelete = false;
        } else {
            g.setColor(Color.BLACK);
            for(Shape s : shapeList){
                switch (s.getGroup()){
                    case "Circle":
                        g.drawOval(s.getX(), s.getY(), s.getRadius() * 2, s.getRadius() * 2);
                        break;
                    case "Rectangle":
                        g.drawRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
                        break;
                    case "Triangle":
                        Triangle.Point p1 = s.getPoints()[0];
                        Triangle.Point p2 = s.getPoints()[1];
                        Triangle.Point p3 = s.getPoints()[2];
                        g.drawLine(p1.pX, p1.pY, p2.pX, p2.pY);
                        g.drawLine(p2.pX, p2.pY, p3.pX, p3.pY);
                        g.drawLine(p3.pX, p3.pY, p1.pX, p1.pY);
                        break;
                    case "Text":


                        g.drawString(s.getWord(), s.getX(), s.getY());
                        break;
                }
            }
        }
    }

    public void deleteShape(){
        isDelete = true;
        repaint();
        shapeList.clear();
    }
}
