package objectPractice_27_01_2020;

import java.util.Objects;

public class Man {
    private String name;
    private double age;
    private double height;
    private double weight;
    private String telephone;

    public Man(String name, double age, double height, double weight, String telephone) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", telephone='" + telephone + '\'' +
                '}';
    }
// изначально man1.equals(man2): false, при переопределении методов equals и hashCode man1.equals(man2): true
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Man man = (Man) o;          //cast - явное привидение
//        return Double.compare(man.age, age) == 0 &&
//                Double.compare(man.height, height) == 0 &&
//                Double.compare(man.weight, weight) == 0 &&
//                Objects.equals(name, man.name) &&
//                Objects.equals(telephone, man.telephone);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, height, weight, telephone);
//    }
}
