package training.day5;

public class Triangle implements Shape{
    double a;
    double b;
    double c;
    double hb;

    public Triangle(double a, double b, double c, double hb){
        this.a = a;
        this.b = b;
        this.c = c;
        this.hb = hb;
    }
    @Override
    public double calculateArea() {
        double result = (hb + b) / 2 ;
        return result;
    }

    @Override
    public double calculatePerimeter() {
        double result = a + b + c ;
        return result;
    }
}
