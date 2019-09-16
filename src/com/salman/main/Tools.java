package com.salman.main;

public enum Tools {

    SCISSOR("Scissor"), PAPER("Paper"), STONE("Stone");


    String name;

    Tools(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
