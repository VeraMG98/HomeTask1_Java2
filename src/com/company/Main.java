package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Pets Home", "Bishkek");
        String[] commands = new String[]{"sit", "voice"};

        Dog dogSecond = new Dog("Dino", "shepherd", Color.BLACK, shelter);
        Dog dogThird = new Dog("Evil", "pitbull", Color.BROWN, shelter, commands);
        Dog dogFirst = new Dog();
        dogFirst.setName("Fido");
        dogFirst.setBreed("shepherd");
        dogFirst.setCommands(commands);
        dogFirst.setColor(Color.WHITE);
        dogFirst.setShelter(shelter);
        
        System.out.println(dogFirst.getInfo());
        System.out.println(dogSecond.getInfo());
        System.out.println(dogThird.getInfo());

        dogFirst.makeVoice("Woof");
        dogSecond.makeVoice(2, "Woof");
        dogThird.makeVoice("tyaf", 3);
    }
}
