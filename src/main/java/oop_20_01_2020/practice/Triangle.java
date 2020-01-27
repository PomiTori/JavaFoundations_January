package oop_20_01_2020.practice;

public class Triangle extends Figure {

    private double length;
    private double height;

    public Triangle (double length, double height){
        this.length = length;
        this.height = height;
    }

    @Override
    public double calcSquare() {
        return 0.5 * length * height;
    }

    @Override
    public double calcPerimeter() {
        return length + height + 0.5*((length*length) + (height*height));
    }
}
