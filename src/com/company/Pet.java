package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet() {}

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(15);
    }

    public String getInfo() {
        return "Pet: age: " + age
                + " color: " + color
                + " shelter: " + shelter.getName()
                + " " + shelter.getAddress();
    }
}
