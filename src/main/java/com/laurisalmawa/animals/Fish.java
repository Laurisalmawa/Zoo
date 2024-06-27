package com.laurisalmawa.animals;

import javax.xml.namespace.QName;

public class Fish extends Animal{
    public Fish(String name, String movement, String specie) {
        super(name, movement, specie);
    }

    @Override
    public String getMovements() {
        System.out.println("Animal: Fish, " + getSpecie());
        return super.getMovements();
    }
}
