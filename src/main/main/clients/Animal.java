package main.clients;

import java.time.LocalDate;

public abstract class Animal {
    protected final String nickname;
    protected Owner owner;
    protected LocalDate birthdate;
    protected Illness illness;

    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCircle (){
        wakeup("4:00");
        eat();
        hunt();
        sleep();
        toGo();
        fly();
        swim();
           }

    private void wakeup () {
        System.out.println("Животное проснулось! Атас!");
    }
    private void wakeup (String time) {
        System.out.println("Чудовище " +nickname+ " проснулось в " +time);
    }

    private void hunt () {
        System.out.println("Животное решило поохотится");
    }
    public abstract void eat ();

    private void sleep () {
        System.out.println("Наконец-то,это чудовище уснуло!");
            }
    public String getType(){
        return getClass().getSimpleName();
    }

    private void toGo () {
        System.out.println("Осторожно, животное активно передвигается!");
    }

    private void fly () {
        System.out.println("Осторожно, животное решило полетать!");
    }

    private void swim() {
        System.out.println(":Животное, удивительнщо, но плавает!");
    }

    public Animal(String nickname, Owner owner, LocalDate birthdate, Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthdate = birthdate;
        this.illness = illness;
    }

    public Animal() {
            this("Кличка", new Owner("Хозяин"),LocalDate.now(),new Illness("Болеет"));
            }

    @Override
    public String toString() {
        return String.format("nickname=%s, bd=%s, owner=%s, illness=%s", nickname,birthdate,owner,illness);
    }

    public abstract void swim(int distance);
}
