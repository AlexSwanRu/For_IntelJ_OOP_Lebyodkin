package main.clients;

import java.time.LocalDate;

public class Cat extends Animal{
    Double discount;
    public Cat() {
        super();
        this.discount=10D;
    }

    public Cat(String nickname, Owner owner, LocalDate birthdate, Illness illness,Double discount) {
        super(nickname, owner, birthdate, illness);
        this.discount=discount;
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

    @Override
    public void swim(int distance) {

    }
}
