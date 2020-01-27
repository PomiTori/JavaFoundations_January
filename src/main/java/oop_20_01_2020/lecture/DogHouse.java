package oop_20_01_2020.lecture;

import oop_20_01_2020.lecture.Dog;

public class DogHouse {

    public static void main(String[] args) {
        Dog grand = new Dog ("Grand");

        System.out.println(grand.getName());
        grand.setName("Victor");                // поменяли имя
        System.out.println(grand.getName());

        System.out.println("Math.sqrt(4.0)): " + Math.sqrt(4.0));

    }
}
