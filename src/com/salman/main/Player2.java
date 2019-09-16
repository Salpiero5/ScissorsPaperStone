package com.salman.main;

import java.util.Random;


class Player2 {

    int play() {

        System.out.println("Player 2 randomly will choose...");

        int input;

        //Select a turn randomly
        Random rd = new Random();
        input = rd.nextInt(3);
        if (input == 0) {
            System.out.println("Player 2 chose " + Tools.SCISSOR + "\n");
        }
        if (input == 1) {
            System.out.println("Player 2 chose " + Tools.PAPER + "\n");
        }
        if (input == 2) {
            System.out.println("Player 2 chose " + Tools.STONE + "\n");
        }

        return input;
    }
}

