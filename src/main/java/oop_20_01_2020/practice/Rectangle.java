package oop_20_01_2020.practice;

import oop_20_01_2020.practice.Figure;

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcSquare() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (length + width);
    }

//    public String getName() {
//        return "I'am rectangle!";
//    }
}
