package com.company;

public class Shelter {
    private final String name;
    private final String address;

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
