package com.laurisalmawa.zoo;

public class Animal {
    //Properties
    /**
     * Encapsulation: We have the properties from Animal class, these properties are private, in that way the only option to be able
     * to use the property is by having access through the methods. We use the encapsulation to protect the properties
     * from changes that could be done for security purpose like getting the full information or get access directly
     * to the properties.
     */
    private String name;

    private String movement;

    private String trick;

    private String specie;

    //Constructor
    public Animal(String name, String movement, String specie){
        this.name = name;
        this.movement = movement;
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovements() {
        return movement;
    }

    public void setMovements(String movements) {
        this.movement = movements;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
