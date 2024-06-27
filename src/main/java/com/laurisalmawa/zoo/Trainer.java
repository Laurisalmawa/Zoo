package com.laurisalmawa.zoo;

import com.laurisalmawa.animals.Animal;

public class Trainer {

    public String call(Animal animal) {

        return animal.getName();
    }

    /**
     * Abstraction: Over here we are able to verify how the methods from the classes extended in animal could get
     * called in one through the Animal class. They get abstracted in the animal class.
     */
    public String command(Animal animal) {
        System.out.println("Trainer: move");

        return animal.getMovements();

    }

}
