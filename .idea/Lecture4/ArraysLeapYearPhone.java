package Lecture4;

import java.util.Arrays;

public class ArraysLeapYearPhone {
    public static void main(String[] args) {
        int[] leapYears1 = new int[3];
        leapYears1[0] = 2016;
        leapYears1[1] = 2017;
        leapYears1[2] = 2018;
        System.out.println(Arrays.toString(leapYears1));

        int[] leapYears2 = {2020, 2021, 2022};
        System.out.println(Arrays.toString(leapYears2));


        String[] nameOfPhone = new String[5];

        nameOfPhone[0] = "3100";
        nameOfPhone[1] = "4100";
        nameOfPhone[2] = "5100";
        nameOfPhone[3] = "6100";
        nameOfPhone[4] = "7100";

        for (int i = 0; i < nameOfPhone.length; i++){
            if (nameOfPhone[i].equals("6100")) {
                System.out.println("Best Phone");
                break;
            } else {
                System.out.println("Name of phone for element " + i + " is equal to " + nameOfPhone[i]);
            }
        }
        for (String element: nameOfPhone) {
            if (element.equals("5100")) {
                System.out.println("Best phone!");
                break;
            } else {
                System.out.println("Name of phone for element " + element);
            }
        }
    }
}
