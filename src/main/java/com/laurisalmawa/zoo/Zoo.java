package com.laurisalmawa.zoo;

import com.laurisalmawa.animals.Animal;
import com.laurisalmawa.animals.Bird;
import com.laurisalmawa.animals.Fish;
import com.laurisalmawa.animals.Quadruped;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

        Trainer trainer = new Trainer();
        Animal animal;
        Scanner input = new Scanner(System.in);
        String selection;
        System.out.println("Welcome to the zoo, we have different kinds of animals, like raven, eagle, wolf, tiger,"
                + "whale and shark, the trainer will tell the animals what to do.");
        System.out.println("Which animal was your favourite?: ");
        selection = input.next();

        if (selection.equalsIgnoreCase("Wolf")) {
            animal = new Quadruped("Phineas", "The wolf walks around his habitat and roars when "
                    + "someone is close", "Wolf");
        } else if (selection.equalsIgnoreCase("Raven")) {
            animal = new Bird("Pepe", "The raven flies close to the river.", "Raven");
        } else if (selection.equalsIgnoreCase("eagle")) {
            animal = new Bird("Liberty", "The eagle flies close to the sky and stays on a tree", "Eagle");
        } else if (selection.equalsIgnoreCase("Tiger")) {
            animal = new Quadruped(
                    "Zucaritas", "The tiger goes over his habitat and sits to clean himself with the tongue",
                    "Tiger");
        } else if (selection.equalsIgnoreCase("Whale")) {
            animal = new Fish("MobyDick", "The whale swims on her habitat and it throws air through the hole it "
                    + "has on the head.", "Whale");
        } else if (selection.equalsIgnoreCase("Shark")) {
            animal = new Fish("Nemo", "The shark swims over the lake", "Shark");
        } else {
            System.out.println("You didn't write a valid option.");
            animal = new Animal("other", "moves", "other");
        }

        System.out.println(trainer.call(animal) + " " + trainer.command(animal));
    }
}
