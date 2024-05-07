package com.laurisalmawa.zoo;

/**
 * Inheritance: Here we can see the inheritance, we have the Bird class who extends from Animal class, in that way,
 * this class inherits the properties and methods from the root class.
 */
public class Bird extends Animal {

    public Bird(String name, String movement, String specie) {
        super(name, movement, specie);
    }

    /**
     * Polymorphism: Over here we can see an override of the method getMovements. From here the polymorphism could be
     * seen since the body of this class's method from be different from the classes that extend the same root class,
     * they as well use the same method.
     */
    @Override
    public String getMovements() {
        System.out.println("Animal: Bird, Specie: " + getSpecie());
        return super.getMovements();
    }

}
