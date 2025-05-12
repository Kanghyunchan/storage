public class GeometricCircle implements GeometricObject{
    private double radius;
    public GeometricCircle(double radius){
        this.radius = radius;
    }
    @Override
    public void draw() { //콘솔에 도형을 *을 사용하여 출력
    }

    @Override
    public double getArea() { //도형의 넓이를 계산하여 반환 파이*r제곱
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() { //도형의 문자열 표현을 반환하며, 핵심 차원을 포함.(형식: "원[반경=5.0]"
        return "원[반경="+ radius + "]";           //, 직각삼각형[밑변=2.0,높이=1.5])
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(this.getArea() < o.getArea()) return -1;
        else if(this.getArea() == o.getArea()) return 0;
        else return 1;
    }

    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius = radius;}
}
