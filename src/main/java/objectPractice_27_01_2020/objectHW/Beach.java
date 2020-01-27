package objectPractice_27_01_2020.objectHW;

public class Beach {

    public static void main(String[] args) {

        Woman woman1 = new Woman("Suzy", 25, true);
        Woman woman2 = new Woman("Margo", 21, false);
        Woman woman3 = new Woman("Page", 18, true);

        System.out.println("woman1.equals(woman2) = " + woman1.equals(woman2));
        System.out.println("woman3.toString() = " + woman3.toString());
        System.out.println("woman2.getClass() = " + woman2.getClass());
        System.out.println("woman1.hashCode() = " + woman1.hashCode());



    }
}
