package com.salman.main;

class Play {

    private static int totalWins1 = 0;
    private static int totalWins2 = 0;


    //0 is Scissor, 2 is Paper, 3 is Stone
    static boolean rules(int input1, int input2) {


        if (input1 == 0 && input2 == 0) {
            System.out.println("Player1 > " + Tools.SCISSOR + " Player2 > " + Tools.SCISSOR);
            System.out.println("Draw!");
            return checkFlag(); //0 means draw
        }

        if (input1 == 1 && input2 == 1) {
            System.out.println("Player1 > " + Tools.PAPER + " Player2 > " + Tools.PAPER);
            System.out.println("Draw!");
            return checkFlag(); //0 means draw
        }

        if (input1 == 2 && input2 == 2) {
            System.out.println("Player1 > " + Tools.STONE + " Player2 > " + Tools.STONE);
            System.out.println("Draw!");
            return checkFlag(); //0 means draw
        }

        if (input1 == 0 && input2 == 1) {
            System.out.println("Player1 > " + Tools.SCISSOR + " Player2 > " + Tools.PAPER);
            totalWins1 += 1;
            return checkFlag(); //1 means player1 winning
        }

        if (input1 == 1 && input2 == 2) {
            System.out.println("Player1 > " + Tools.PAPER + " Player2 > " + Tools.STONE);
            totalWins1 += 1;
            return checkFlag(); //Checking for result 3
        }

        if (input1 == 2 && input2 == 0) {
            System.out.println("Player1 > " + Tools.STONE + " Player2 > " + Tools.SCISSOR);
            totalWins1 += 1;
            return checkFlag();
        }

        if (input1 == 0 && input2 == 2) {
            System.out.println("Player1 > " + Tools.SCISSOR + " Player2 > " + Tools.STONE);
            totalWins2 += 1;
            return checkFlag();
        }

        if (input1 == 2 && input2 == 1) {
            System.out.println("Player1 > " + Tools.STONE + " Player2 > " + Tools.PAPER);
            totalWins2 += 1;
            return checkFlag();
        }

        if (input1 == 1 && input2 == 0) {
            System.out.println("Player1 > " + Tools.PAPER + " Player2 > " + Tools.SCISSOR);
            totalWins2 += 1;
            return checkFlag();
        }
        return true;
    }

    private static boolean checkFlag() {

        System.out.println("Total wins Player1: " + totalWins1 + " \n Total wins Player2: " +
                totalWins2 + "\n");
        if (totalWins1 == 3 || totalWins2 == 3) {
            return false;
        } else return true;
    }
}
