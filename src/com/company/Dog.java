package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(voice + " ");
        }
        System.out.println();
    }

    public void makeVoice(int num, String voice) {
        for (int i = 0; i < num; i++) {
            System.out.print(voice + " ");
        }
        System.out.println();
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public final String getInfo() {
        return super.getInfo()
                + " name: " + name
                + " breed: " + breed
                + " commands: " + Arrays.toString(commands);
    }
}
