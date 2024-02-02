package main.clients.pets;

import main.clients.Illness;
import main.clients.Owner;
import main.clients.ability.Swimable;

import java.time.LocalDate;

public class Frog extends Animal implements Swimable {
    public Frog(String nickname, Owner owner, LocalDate birthdate, Illness illness) {
        super(nickname, owner, birthdate, illness);
    }

    public Frog() {
    }

    @Override
    public void swim(int distance) {

    }

    @Override
    public void eat() {
        System.out.println("Лягушка наелась комаров и довольно квакает!");
    }
//    public void swim(int distance) {
//
//    }

    public void jumping() {
         System.out.println("Разбегайся, лягушка прыгает...");
           }

    @Override
    public double swim() {
        return Swimable.super.swim();
    }

//    @Override
//    public int swim() {
//
//        return 0;
//    }
}
