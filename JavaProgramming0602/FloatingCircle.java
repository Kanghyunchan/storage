public class FloatingCircle {
    private int x, y, radius;
    private int dx, dy;
    private int boundX, boundY;

    public FloatingCircle(int x, int y, int radius, int dx, int dy, int boundX, int boundY){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.dx = dx;
        this.dy = dy;
        this.boundX = boundX;
        this.boundY = boundY;
    }

    public void update(){
        x = x + dx;
        y = y + dy;

        if(x < 0 || (x + 2 * radius) > boundX ){
            dx = -dx;
        }
        if(y < 0 || (y + 2 * radius) > boundY ){
            dy = -dy;
        }
    }


    public int getX(){return x;}
    public int getY(){return y;}
    public int getRadius(){return radius;}
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    public void setRadius(int radius){this.radius = radius;}
}
