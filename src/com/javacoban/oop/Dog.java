package com.javacoban.oop;

public class Dog extends Cattle {
    private String color;
    private String origin;

    public Dog(String name, int age, boolean gender, String color, String origin) {
        super(name, age, gender);
        this.color = color;
        this.origin = origin;
    }

    void goToTheToilet (){

    }
    void eatMeal(){

    }
    void takeAShower(){

    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
