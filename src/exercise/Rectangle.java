package exercise;

public class Rectangle {
    private double vertical;
    private double horizontal;

    public Rectangle(double vertical, double horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public double area(){
        return vertical * horizontal;
    }
}
