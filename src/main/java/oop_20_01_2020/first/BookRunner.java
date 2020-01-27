package oop_20_01_2020.first;

import java.util.Scanner;

public class BookRunner {
    public static void main(String[] args) {
        HistoricalBook warAndPeace = new HistoricalBook("Война и мир", 1225, 19, "Л.Н.Толстой");
        System.out.println("warAndPeace = " + warAndPeace);
        warAndPeace.reWriteBook(20);
        System.out.println("warAndPeace = " + warAndPeace);

        warAndPeace.changeAuthor("Пушкин");
        System.out.println("warAndPeace = " + warAndPeace);

        System.out.println(warAndPeace.getName());
        System.out.println(warAndPeace.getCountOfPage());
        System.out.println(warAndPeace.getCentury());
        System.out.println(warAndPeace.getAuthor());
        System.out.println(HistoricalBook.price);
        System.out.println(warAndPeace.toString());
    }
}

