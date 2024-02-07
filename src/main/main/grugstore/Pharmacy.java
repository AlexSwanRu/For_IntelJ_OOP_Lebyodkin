package main.grugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<PharmacyTwo> {
    private List<PharmacyTwo> components=new ArrayList<PharmacyTwo>();
    private int badEffect;
    private List<PharmacyTwo> pharmacies=new ArrayList<>();
    private int index=0;

public void addPharmacys(PharmacyTwo...pharmacyTwos){
    for (PharmacyTwo c:pharmacyTwos){
        this.pharmacies.add(c);
    }
}

//    public void addComponents(Component... components) {
//        for (Component c:components){
//            this.components.add(c);
//        }



    @Override
        public String toString(){
        return String.format("Drug=%s, BadEffect=%s", pharmacies, badEffect);
        }

    @Override

    public boolean hasNext() {

        return index<components.size();
    }

    @Override
    public PharmacyTwo next() {
        return components.get(index++);
    }
}
