public class Triangle extends Shape {
    private Point[] points = new Point[3];
    public Triangle(int dx, int dy, int boundX, int boundY, Point[] points) {
        super(0, 0, dx, dy, boundX, boundY);
        this.points = points;
        setGroup("Triangle");
    }

    @Override
    public void update() {
        points[0].pX += dx;
        points[0].pY += dy;
        points[1].pX += dx;
        points[1].pY += dy;
        points[2].pX += dx;
        points[2].pY += dy;
//        x = x + dx;
//        y = y + dy;
        int maxX = 0, minX = 0, maxY = 0, minY = 0;
        for(Point p : points){
            if (p.pX > maxX) maxX = p.pX;
            if (p.pX < minX) minX = p.pX;
            if (p.pY > maxY) maxY = p.pY;
            if (p.pY < minY) minY = p.pY;
        }
        if(minX < 0 || (maxX + minX) > boundX) dx = -dx;
        if(minY < 0 || (maxY + minY) > boundY) dy = -dy;
    }

    @Override
    public Point[] getPoints(){return points;}

    static class Point{
        int pX, pY;
        Point(int x, int y){
            this.pX = x;
            this.pY = y;
        }
    }
}
