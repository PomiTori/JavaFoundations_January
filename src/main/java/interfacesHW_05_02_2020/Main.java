package interfacesHW_05_02_2020;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SuperCat catPux = new SuperCat();
        SuperCat catMax = new SuperCat("Max", 5);
        SuperCat catRex = new SuperCat("Rex", 10);
        SuperCat catTom = new SuperCat("Tom",7);

        catPux.setAge(12);
        catPux.setName("Pux");
        System.out.println(catPux.toString());
        catPux.clone();
        catPux.setName("clone Pux");
        catPux.setAge(4);
        System.out.println(catPux.toString());

        SuperCat[] superCats = new SuperCat[]{ catMax,catPux, catRex, catTom};
        System.out.println("Arrays.toString(superCats) = " + Arrays.toString(superCats));
        Arrays.sort(superCats);
        System.out.println("Arrays.toString(superCats) = " + Arrays.toString(superCats));
        System.out.println("catMax.compareTo(catPux) = " + catMax.compareTo(catPux));


        String string = "Сейчас поиграемся с методами! Посмотрим, что из этого всего получится у нас!";
        System.out.println("string = " + string);
        System.out.println("string.substring(5) = " + string.substring(5));
        System.out.println("string.substring(2,5) = " + string.substring(2, 5));
        System.out.println("string.equals(string) = " + string.equals(string));
        System.out.println("string.split(\"Ух ты!\") = " + string.split("Ух ты!"));
        System.out.println("string.contains(\"blabla\") = " + string.contains("blabla"));
        System.out.println("string.codePointBefore(9) = " + string.codePointBefore(9));


    }
}
