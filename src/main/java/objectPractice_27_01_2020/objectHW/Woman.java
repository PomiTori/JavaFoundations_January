package objectPractice_27_01_2020.objectHW;

import java.util.Objects;

public class Woman {

    private String name;
    private int age;
    private boolean isCanSwim;

    public Woman(String name, int age, boolean isCanSwim) {
        this.name = name;
        this.age = age;
        this.isCanSwim = isCanSwim;
    }

    @Override
    public int hashCode() {
        return age;
    }

//    @Override
//    public boolean equals(Object obj) {
//       if (this == obj) return true;
//       return false;
//    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woman woman = (Woman) o;
//        if ((age - woman.age) == 0) {
//            return true;}
//            else return false;

        return Math.abs(woman.age - age) < 0.000001 &&
                (woman.name == name) &&
                (woman.isCanSwim == isCanSwim);
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCanSwim=" + isCanSwim +
                '}';
    }
}
