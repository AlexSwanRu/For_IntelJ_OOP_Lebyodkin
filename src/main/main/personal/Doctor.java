package main.personal;

import java.util.List;

public class Doctor extends Staff{
    @Override
    public void working() {
        System.out.println("Доктор слущает пациента фонендоскопом, не отвлекать!");;
    }
}
