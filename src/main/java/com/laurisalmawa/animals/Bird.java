package com.laurisalmawa.animals;

public class Bird extends Animal{

    public Bird(String name, String movement, String specie) {
        super(name, movement, specie);
    }

    @Override
    public String getMovements() {
        System.out.println("Animal: Bird, Specie: " + getSpecie());
        return super.getMovements();
    }
}
