package com.laurisalmawa.animals;

public class Animal {
    //Properties
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
