public class Rectangle extends Shape {
    private int height, width;
    public Rectangle(int x, int y, int dx, int dy, int boundX, int boundY,int height, int width) {
        super(x, y, dx, dy, boundX, boundY);
        this.height = height;
        this.width = width;
        setGroup("Rectangle");
    }

    @Override
    public void update() {
            x = x + dx;
            y = y + dy;

            if(x < 0 || (x + width) > boundX) dx = -dx;
            if(y < 0 || (y + height) > boundY) dy = -dy;
    }

    public int getHeight(){return height;}
    public int getWidth(){return width;}
    public void setHeight(int height){this.height = height;}
    public void setWidth(int width){this.width = width;}
}