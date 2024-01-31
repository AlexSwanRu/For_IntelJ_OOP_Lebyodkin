package main.clients;

import java.time.LocalDate;

public class Frog extends Animal{
    public Frog(String nickname, Owner owner, LocalDate birthdate, Illness illness) {
        super(nickname, owner, birthdate, illness);
    }

    public Frog() {
    }

    @Override
    public void eat() {
        System.out.println("Лягушка наелась комаров и довольно квакает!");
    }
    public void swim(int distance) {

    }

    public void jumping() {
         System.out.println("Разбегайся, лягушка прыгает...");
           }
}
