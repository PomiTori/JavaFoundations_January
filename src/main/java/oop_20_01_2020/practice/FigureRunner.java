package oop_20_01_2020.practice;

public class FigureRunner {

    public static void main(String[] args) {
        Figure figurerect = new Rectangle(2,5);
//        Rectangle realrect = new Rectangle(2,5);
//       при ссылке фигура нельзя обратиться к методу, реализованому в ректангл, только переопределенные методы


//        System.out.println(realrect.getName());
        System.out.println("figurerect.calcSquare() = " + figurerect.calcSquare());
        System.out.println("figurerect.calcPerimeter() = " + figurerect.calcPerimeter());

        Figure circle = new Circle(4);
        System.out.println("circle.calcSquare() = " + circle.calcSquare());
        System.out.println("circle.calcPerimeter() = " + circle.calcPerimeter());

        Figure triangle = new Triangle(4,2);
        System.out.println("triangle.calcSquare() = " + triangle.calcSquare());
        System.out.println("triangle.calcPerimeter() = " + triangle.calcPerimeter());


    }
}
