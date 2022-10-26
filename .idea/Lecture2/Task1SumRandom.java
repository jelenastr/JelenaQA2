package Lecture2;

import java.util.Random;

public class Task1SumRandom {
    public static void main(String[] args) {

//        int number1 = 56;
//        int number2 = 99;
//        int sum = number1 + number2;
//        System.out.println("Two number sum is " + sum);

        Random randomGenerator = new Random();
        int randomNumber1 = randomGenerator.nextInt(4);
        int randomNumber2 = randomGenerator.nextInt(3);
        int sum = randomNumber1 + randomNumber2;
        System.out.println("Sum of numbers " + sum);

    }
}
