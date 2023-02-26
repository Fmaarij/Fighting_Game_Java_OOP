package be.fai;

import java.util.Scanner;

public class MainApp {


    public static void main(String[] args) {

        Players player1 = new Players("James");
        Players player2 = new Players("Smit");
        System.out.println("******               ******");
        System.out.println("*     Fighting Game       *");
        System.out.println("******               ******");
        System.out.println(player1.getName() + " points = " + player1.getLifePoint() + ".");
        System.out.println(player2.getName() + " points = " + player2.getLifePoint() + ".");
        System.out.println();
        Scanner choicePlayerOne = new Scanner(System.in);

        Scanner choicePlayerTwo = new Scanner(System.in);
        //String player2Choice = choicePlayerTwo.nextLine();

        while (!((player1.getLifePoint() == 0) || (player2.getLifePoint() == 0))) {
            String player1Choice = "";
            String player2Choice = "";

            //player1
            while (!(player1Choice.equals("Punch") || player1Choice.equals("Kick")) && player1.getLifePoint() != 0) {
                System.out.println(player1.getName() + " your turn!");
                System.out.println("Type 'Punch' or 'Kick' ");
                player1Choice = choicePlayerOne.nextLine();

                if (player1Choice.equals("Punch")) {
                    if (!(player2.getLifePoint() == 0)) {
                        player2.setLifePoint((player2.getLifePoint()) - 20);
                        System.out.println(player2.getName() + " lost 20 points, left " + player2.getLifePoint());
                    } else if (player2.getLifePoint() <= 20) {
                        player2.setLifePoint(0);
                        System.out.println(player2.getName() + " lost, points left " + player2.getLifePoint());
                    } else {
                        System.out.println(player2.getName() + " lost,  points left " + player2.getLifePoint());

                    }

                } else if (player1Choice.equals("Kick")) {
                    if (!(player2.getLifePoint() - 30 <= 0)) {
                        player2.setLifePoint((player2.getLifePoint()) - 30);
                        System.out.println(player2.getName() + " lost 30 points, left " + player2.getLifePoint());
                    } else if (player2.getLifePoint() <= 30) {
                        player2.setLifePoint(0);
                        System.out.println(player2.getName() + " lost, points left " + player2.getLifePoint());
                    } else {
                        System.out.println(player2.getName() + " lost,  points left " + player2.getLifePoint());

                    }
                } else {
                    System.out.println("Wrong input !!!");
                }

            }

            while (!(player2Choice.equals("Punch") || player2Choice.equals("Kick")) && player2.getLifePoint() != 0) {

                //Player 2
                System.out.println(player2.getName() + " your turn!");
                System.out.println("Type 'Punch' or 'Kick' ");
                player2Choice = choicePlayerTwo.nextLine();
                if (player2Choice.equals("Punch")) {
                    if (!(player1.getLifePoint() == 0)) {
                        player1.setLifePoint((player1.getLifePoint()) - 20);
                        System.out.println(player1.getName() + " lost 20 points, left " + player1.getLifePoint());
                    } else if (player1.getLifePoint() <= 20) {
                        player1.setLifePoint(0);
                        System.out.println(player1.getName() + " lost, points left " + player1.getLifePoint());
                    } else {
                        System.out.println(player1.getName() + " lost, points left " + player1.getLifePoint());
                    }

                } else if (player2Choice.equals("Kick")) {
                    if (!(player1.getLifePoint() - 30 <= 0)) {
                        player1.setLifePoint((player1.getLifePoint()) - 30);
                        System.out.println(player1.getName() + " lost 30 points, left " + player1.getLifePoint());
                    } else if (player1.getLifePoint() <= 30) {
                        player1.setLifePoint(0);
                        System.out.println(player1.getName() + " lost, points left " + player1.getLifePoint());
                    } else {
                        System.out.println(player1.getName() + " lost, points left " + player1.getLifePoint());
                    }
                } else {
                    System.out.println("Wrong input !!!");
                }
            }

        }

        //faisal.fight("faisal", "james");
        System.out.println("******** Results ********");
        if (player1.getLifePoint() == 0) {
            System.out.println(player2.getName() + " is the Winner.");
        } else {
            System.out.println(player1.getName() + " is the Winner.");
        }

    }
}
