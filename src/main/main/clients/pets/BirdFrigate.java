package main.clients.pets;

import main.clients.Illness;
import main.clients.Owner;

import java.time.LocalDate;

public class BirdFrigate extends Animal {
    public BirdFrigate(String nickname, Owner owner, LocalDate birthdate, Illness illness) {
        super(nickname, owner, birthdate, illness);
    }

    public BirdFrigate() {
    }

    @Override
    public void eat() {
        System.out.println("Птица фрегат поймала рыбу и наслаждается!");
    }
    public void swim(int distance) {
          System.out.println("Птицы Фрегаты не плавают, для них это смертельно!!!");;
    }
}

