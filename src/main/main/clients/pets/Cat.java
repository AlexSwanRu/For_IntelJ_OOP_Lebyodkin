package main.clients.pets;

import main.clients.*;
import main.clients.ability.Goable;
import main.clients.ability.Huntable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable {
    Double discount;
       public Cat() {
        super();
        this.discount=10D;
    }

    public Cat(String nickname, Owner owner, LocalDate birthdate, Illness illness, Double discount) {
        super(nickname, owner, birthdate, illness);
        this.discount=discount;
    }

//    }
    public void hunt(){
        System.out.println("Не отвлекать! Сейчас кошка охотится..");
    }

    public Double getDiscount() {
        return discount;
            }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString()+"discount(" + discount +
                '}';
    }



    public void eat() {
        System.out.println("Кошка добралась до сметаны и пирует!");
    }
    public void swim(int distance) {

    }

    @Override
    public void go() {

    }

    @Override
    public double run() {
        return Goable.super.run();
    }
}
