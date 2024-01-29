package main.clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String nickname, Owner owner, LocalDate birthdate, Illness illness) {
        super(nickname, owner, birthdate, illness);
    }

    public Dog() {
     super();
    }

    @Override
    public void swim(int distance) {

    }
}
