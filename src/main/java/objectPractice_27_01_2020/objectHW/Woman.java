package objectPractice_27_01_2020.objectHW;

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

    @Override
    public boolean equals(Object obj) {
       if (this == obj) return true;
       return false;
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
