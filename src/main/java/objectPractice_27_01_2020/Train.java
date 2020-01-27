package objectPractice_27_01_2020;

public class Train {
    public static void main(String[] args) {
        Man man1 = new Man ("Bob", 32, 180, 180, "+1802513");
        Man man2 = new Man ("Bob", 32, 180, 180, "+1802513");


        System.out.println(man1 == man2);

        Man man3 = man1;
        System.out.println(man1 == man3);

        System.out.println("man1.equals(man2): " + man1.equals(man2));  //указывает на тот же объект?(без переопределения метода, по методу суперкласса)
        System.out.println("man1.equals(man3): " + man1.equals(man3));


    }
}
