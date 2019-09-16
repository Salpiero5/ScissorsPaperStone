package com.salman.main;

import java.util.Scanner;

class Player1 {

    int play() {

        System.out.println("Player 1 please choose: 0=Scissor, 1=paper, 2=stone  ");

        int input = -1;
        int i = -1;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                if (input == 0 || input == 1 || input == 2) {
                    return input;
                } else {
                    throw (new Exception());
                }
            } catch (Exception e) {
                System.out.println("Pls choose 0/1/2");
            }
        } while (i == -1);

        return input;
    }
}
