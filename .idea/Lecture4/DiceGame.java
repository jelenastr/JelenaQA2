package Lecture4;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {

//        Random randomGenerator = new Random();
//        int randomNumber1 = randomGenerator.nextInt(6);
//        equal "Math.random() "

        int dice1, dice2, dice3;
        int counter = 0;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;

            System.out.println("Dice1: " + dice1 + ". Dice2: " + dice2 + ". Dice3: " + dice3);

            counter++;

            System.out.println("Try number: " + counter);

        } while (dice1 != dice2 || dice2 != dice3);
        System.out.println("You have won game! It took " + counter + " tries!");

        }
    }
