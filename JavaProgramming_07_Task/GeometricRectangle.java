public class GeometricRectangle implements GeometricObject {
    private double sides;

    public GeometricRectangle(double sides){
        this.sides = sides;
    }
    @Override
    public void draw() {
        for(int i = 0; i < sides; i++){
            for(int j = 0; j < sides*2-1; j++){
                if(i == 0 || i == sides-1){
                    System.out.print("*");
                }else if(j == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }

    @Override
    public double getArea() {
        return Math.pow(sides, 2);
    }

    @Override
    public String toString() {
        return "정사각형[변=" + sides + "]";
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(this.getArea() < o.getArea()) return -1;
        else if(this.getArea() == o.getArea()) return 0;
        else return 1;
    }

    public double getSides(){return sides;}
    public void setSides(double sides){this.sides = sides;}
}
