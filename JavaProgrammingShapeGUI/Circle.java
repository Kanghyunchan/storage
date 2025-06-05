public class Circle extends Shape {
    private int r;
    public Circle(int x, int y, int dx, int dy, int boundX, int boundY, int r) {
        super(x, y, dx, dy, boundX, boundY);
        this.r = r;
        setGroup("Circle");
    }

    @Override
    public void update(){
        x = x + dx;
        y = y + dy;
        if(x < 0 || (x + 2 * r) > boundX) dx = -dx;
        if(y < 0 || (y + 2 * r) > boundY) dy = -dy;

    }

    public int getRadius(){return r;}
    public void setRadius(int r){this.r = r;}
}
