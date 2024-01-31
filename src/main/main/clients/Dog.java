package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable{
    public Dog(String nickname, Owner owner, LocalDate birthdate, Illness illness) {
        super(nickname, owner, birthdate, illness);
    }
    public void go(){
        System.out.println("Я умею ходить");
    }

    public Dog() {
     super();
    }

    @Override
    public void eat() {
        System.out.println("Собака нашла сахарную косточку и грызёт её...");
    }
    public void swim(int distance) {

    }
}
