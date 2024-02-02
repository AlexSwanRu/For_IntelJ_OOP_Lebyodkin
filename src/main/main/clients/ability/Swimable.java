package main.clients.ability;

public interface Swimable {
    default double swim() {
        return 5;
    }
}

//    default double swim() {
//    return 10;
//    }
//    public void swin() {
//        System.out.println("");
//    }
//}
