package com.laurisalmawa.zoo;
/**
 * Inheritance: Here we can see the inheritance, we have the Fish class who extends from Animal class, in that way,
 * this class inherits the properties and methods from the root class.
 */

public class Fish extends Animal {

    public Fish(String name, String movement, String specie) {
        super(name, movement, specie);
    }

    @Override
    public String getMovements() {
        System.out.println("Animal: Fish, " + getSpecie());
        return super.getMovements();
    }
}

