public class ShapeText extends Shape {
    private int height, width;
    private String word;
    public ShapeText(int x, int y, int dx, int dy, int boundX, int boundY, int height, int width, String word) {
        super(x, y, dx, dy, boundX, boundY);
        this.height = height;
        this.width = width;
        this.word = word;
        setGroup("Text");
    }

    @Override
    public void update(){
        x = x + dx;
        y = y + dy;
        if(x < 0 || (x + width) > boundX) dx = -dx;
        if(y < 0 || (y + height) > boundY) dy = -dy;
    }
    @Override
    public int getHeight(){return height;}
    @Override
    public int getWidth(){return width;}
    @Override
    public String getWord(){return word;}
    public void setHeight(int height){this.height = height;}
    public void setWidth(int width){this.width = width;}
}
