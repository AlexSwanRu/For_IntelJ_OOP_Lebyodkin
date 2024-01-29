package main;

import java.time.LocalDate;

public class Animal {
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
        wakeup("12:00");
        eat();
        hunt();
        sleep();
    }

    private void wakeup () {
        System.out.println("Животное проснулось");
    }
    private void wakeup (String time) {
        System.out.println("Животное " +nickname+ " проснулось в " +time);
    }

    private void hunt () {
        System.out.println("Животное охотится");
    }
    private void eat () {
        System.out.println("Животное ест");
            }

    private void sleep () {
        System.out.println("Животное спит...");
            }
    public String getType(){
        return getClass().getSimpleName();
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
}
