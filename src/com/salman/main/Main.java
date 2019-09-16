package com.salman.main;


public class Main {

    public static void main(String[] args) {


        //little change
        boolean result;
        int input1;
        int input2;

        Player1 player1 = new Player1();
        Player2 player2 = new Player2();

        do {
                input1 = player1.play();
                input2 = player2.play();
                result = Play.rules(input1, input2);
            } while (result);
        }


    }
