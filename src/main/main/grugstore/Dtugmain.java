package main.grugstore;

import main.grugstore.companents.Azitronite;
import main.grugstore.companents.Penitillin;
import main.grugstore.companents.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dtugmain {
    public static void main(String[] args) {
        Component water=new Water("Water",10D,1,0);
        Component azitronite=new Azitronite("Azitronite",2D,14);
        Component penitillin=new Penitillin("Penitillin",1.6D,6);
        PharmacyTwo ph1=new PharmacyTwo();
        PharmacyTwo ph2=new PharmacyTwo();
        PharmacyTwo ph3=new PharmacyTwo();
        List<PharmacyTwo> pharmacyTwos=new ArrayList<>();
        ph1.addPharmacys();
        pharmacyTwos.add(ph1);
        System.out.println(pharmacyTwos);


        //PharmacyTwo ph1=new PharmacyTwo();
//        ph1.addPharmacys();
        //p1.addComponents(water, azitronite);
//        PharmacyTwo p1=new PharmacyTwo();
//        p2.addComponents(water, penitillin);
//        PharmacyTwo p3=new PharmacyTwo();
//        p3.addComponents(penitillin,azitronite);
//
//        List<Component> components=new ArrayList<>();
//        List<PharmacyTwo> pharmacyTwos=new ArrayList<>();
//        components.add(penitillin);
//        components.add(azitronite);
//        components.add(water);
//        pharmacyTwos.add(p1);
//        pharmacyTwos.add(p2);
//        pharmacyTwos.add(p3);


//        System.out.println(pharmacyTwos);

//        Collections.sort(components);
//        System.out.println(components);


//        Iterator<Component> iterator=p1;
//        while (iterator.hasNext()){
//            System.out.println(p1.next().toString());
//        }
//        for(Component c:p2){
//            System.out.println(c);
//
//        }
    }
}
