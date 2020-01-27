package objectPractice_27_01_2020;

public class Bakery {
    public static void main(String[] args) {
        Cake myCake = new Cake("Наполеон", 3.5,true);

        System.out.println("myCake = " + myCake);
        System.out.println(myCake.toString());

        myCake.setName("Северный мёд");
        myCake.setWeight(2.5);
        System.out.println(myCake.toString());





    }
}
