package training.day5;

public class Rectangle implements Shape{
    double w;
    double l;
    public Rectangle(double w, double l){
        this.w = w;
        this.l = l;
    }
    @Override
    public double calculateArea() {
    double result = w * l;
    return result;
    }

    @Override
    public double calculatePerimeter() {
    double result = 2 * (l + w);
    return result;
    }
}
