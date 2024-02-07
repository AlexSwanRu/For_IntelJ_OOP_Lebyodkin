package main.grugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Component> {
    private List<Component>components=new ArrayList<>();
    private int index=0;
    private int badEffect;
    private List<PharmacyTwo> pharmacies=new ArrayList<>();

    public void addPharmacys(PharmacyTwo...pharmacyTwos) {
        for (PharmacyTwo s : pharmacyTwos) {
            this.pharmacies.add(s);
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return null;
    }
}

//        public void addComponents (Component...components){
//            for (Component c : components) {
//                this.components.add(c);
//            }
//                }




//            @Override
//            public boolean hasNext() {
//                return index<components.size();
//            }
//
//            @Override
//            public Component next() {
//                return components.get(index++);
//            }
//        };
//    }

//    @Override
//    public boolean hasNext() {
//
//        return index<components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

