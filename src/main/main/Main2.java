package main;


import main.clients.pets.Cat;
import main.clients.pets.Dog;
import main.clients.ability.Goable;
import main.clients.pets.Fish;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>();
        Cat cat=new Cat();
        Dog dog=new Dog();
        Fish fish=new Fish();
        list.add(cat);
        list.add(dog);
        cat.hunt();
        dog.hunt();
        fish.swim();

        System.out.println(list);

    }
}
