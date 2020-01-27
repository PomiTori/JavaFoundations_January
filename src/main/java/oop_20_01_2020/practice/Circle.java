package oop_20_01_2020.practice;

public class Circle extends Figure {
    public final static double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * radius;
    }
}
