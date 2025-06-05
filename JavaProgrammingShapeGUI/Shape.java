public class Shape {
    protected int x, y;
    protected int dx, dy;
    protected int boundX, boundY;
    protected String group;
    public Shape(int x, int y, int dx, int dy, int boundX, int boundY){
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.boundX = boundX;
        this.boundY = boundY;
    }

    public void update(){};
    public int getRadius(){return 0;}
    public int getHeight(){return 0;}
    public int getWidth(){return 0;}
    public String getWord(){return null;}
    public Triangle.Point[] getPoints(){return null;}

    public int getX(){return x;}
    public int getY(){return y;}
    public String getGroup(){return group;}
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    public void setGroup(String group){this.group = group;}
}
