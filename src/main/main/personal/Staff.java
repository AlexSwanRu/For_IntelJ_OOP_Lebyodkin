package main.personal;

import java.util.Locale;

public class Staff {
    protected String surname;
    protected String specialization;
    public Category category;

    public Category category(){
        return category;
    }

    public void workOn (){
        System.out.println("Сотрудник на работе");
    }
    public void workOff (){
        System.out.println("Сотрудник выходной");
            }
    public void working (){
        System.out.println("Сотрудник занят с пациентом");
    }
}
