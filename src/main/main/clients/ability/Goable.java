package main.clients.ability;

public interface Goable {
    void go();

    public default double run() {
        return 10;
    }

    }

