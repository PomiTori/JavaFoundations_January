package objectPractice_27_01_2020;

public class Cake {
    private String name;
    private double weight;
    private boolean isSweet;

    public Cake() {
    }

    public Cake(String name, double weight, boolean isSweet) {
        this.name = name;
        this.weight = weight;
        this.isSweet = isSweet;
    }

    @Override
    public String toString() {
        return "Торт '" + name + "' весом " + weight + " килограмм сладкий? Ответ: " + isSweet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
