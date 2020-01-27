package objectPractice_27_01_2020.objectHW;

import objectPractice_27_01_2020.Man;

import java.util.Arrays;

public class ManArray {

    public static void main(String[] args) {
        Man man1 = new Man("Sergey", 25, 195, 95,"123" );
        Man man2 = new Man("Andrey", 35, 165, 80,"256" );
        Man man3 = new Man("Sasha", 18, 180, 65,"257" );
        Man man4 = man3;
        Man man5 = new Man("Slava", 16, 177, 120,"346" );

//        Arrays[] manArray = new Arrays(){man1,man2,man3,man4,man5};
//        System.out.println("Arrays.toString(manArray) = " + Arrays.toString(manArray));
    }
}
