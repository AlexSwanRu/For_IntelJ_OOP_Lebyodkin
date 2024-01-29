package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Солнышко", new Owner("Александр Владимирович"),
                LocalDate.of(2022, 11, 9), new Illness("Лишай")) {
            @Override
            public void swim(int distance) {
                
            }
        };

        Animal testAnimal = new Animal() {
            @Override
            public void swim(int distance) {

            }
        };
        Frog frog=new Frog("Попрыгушка",new Owner("Иван Царевич"),LocalDate.of(1901,1,1),new Illness("Француз отгрыз лапку"));
        BirdFrigate birdFrigate=new BirdFrigate("Морской охотник",new Owner("Капитан Джек"),LocalDate.of(1501,1,3),
                new Illness("Во время абордажа повредио крыло!"));

        System.out.println(testAnimal.getNickname());

        System.out.println(testAnimal.getBirthdate());
        cat.lifeCircle();
        Cat catty = new Cat();
        Dog doggy = new Dog();
        Frog froggy=new Frog();
        System.out.println((doggy.getType()));
        System.out.println(catty.getType());

        System.out.println((catty));
        System.out.println(froggy.getType());
        frog.jumping();
        birdFrigate.swim(10);
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(catty);
        animals.add(doggy);
        animals.add(froggy);
        int i=0;
        for (Animal animal:animals){
            System.out.println(i+" "+animal);
            i++;
        }

    }
}
