package oop_20_01_2020.first;

import java.util.Scanner;

public class HistoricalBook {
    private String name;
    private int countOfPage;
    private int century;
    private String author;
    public static int price = 250;


    public HistoricalBook(String name, int countOfPage, int century, String author) {
        this.name = name;
        this.countOfPage = countOfPage;
        this.century = century;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public int getCentury() {
        return century;
    }

    public String getAuthor() {
        return author;
    }
    //        методы  1) вырвать страницу
//            2) приклеить страницу
//            3) переписать книгу
//            4) поменять автора

    public void deletePage(int countOfDeletePage) {
        countOfPage = countOfPage - countOfDeletePage;
    }

    public void addPage(int countOfAddPage) {
        countOfPage = countOfPage - countOfAddPage;
    }

    public void reWriteBook(int century) {
        this.century = century;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
      return name + "," + countOfPage + "," + century + "," + author;
    }
}
