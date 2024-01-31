package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable,Huntable{
    Double discount;
    public Cat() {
        super();
        this.discount=10D;
    }

    public Cat(String nickname, Owner owner, LocalDate birthdate, Illness illness,Double discount) {
        super(nickname, owner, birthdate, illness);
        this.discount=discount;
    }
    public void go(){
        System.out.println("Умею ходить");
    }
    public void Hunt(){
        System.out.println("Иногда охочусь...");
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
}
