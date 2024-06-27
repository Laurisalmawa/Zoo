package com.laurisalmawa.animals;

public class Quadruped extends Animal{

    public Quadruped(String name, String movement, String specie) {
        super(name, movement,specie);
    }

    public String getMovements() {
        System.out.println("Animal: Quadruped, " + getSpecie());
        return super.getMovements();
    }
}
