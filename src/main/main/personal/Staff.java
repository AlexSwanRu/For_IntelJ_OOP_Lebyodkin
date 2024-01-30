package main.personal;

public class Staff {
    protected String surname;
    protected String specialization;

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
