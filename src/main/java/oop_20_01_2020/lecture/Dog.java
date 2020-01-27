package oop_20_01_2020.lecture;

public class Dog {
    private String name;
    private String breed;
    private boolean isBark;

    public Dog(String name) {          //для создания объектов
        this.name = name;
    }

    public String getName() {            //чтобы вернуть имя
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getIsBark() {
        return isBark;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setIsBark(boolean isBark) {
        this.isBark = isBark;
    }


}
