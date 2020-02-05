package interfacesHW_05_02_2020;

public class SuperCat implements Cloneable, Comparable<SuperCat> {
//        HW
//        supercat, реализовать  compareTo и clone, создать объекты и отсортировать, часть создаем, часть через clone
//        поиграться с методами класса String (создаем строку, выводим на экран, даллее используем метод, выводим на экран и т.д.)
//        аудио про методы equals, hashCode, compareTo
    String name;
    double age;

    public SuperCat() {
    }

    public SuperCat(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public int compareTo(SuperCat o) {
        return (int) (age - o.age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SuperCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
