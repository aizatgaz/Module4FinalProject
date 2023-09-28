package com.aizatgaz.domain;

public enum Continent {

    ASIA(0),
    EUROPE(1),
    NORTH_AMERICA(2),
    AFRICA(3),
    OCEANIA(4),
    ANTARCTICA(5),
    SOUTH_AMERICA(6);

    private int id;

    Continent(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
