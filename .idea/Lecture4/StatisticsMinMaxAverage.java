package Lecture4;

public class StatisticsMinMaxAverage {
    public static void main(String[] args) {
        int[] elements = {5, 568, -2111, 5118, 0, 154, 1};
        int min = minValue(elements);
        int max = maxValue(elements);
        int averageNumber = averageValue(elements);

        System.out.println("Min value " + min);
        System.out.println("Max value " + max);
        System.out.println("Average value " + averageNumber);
    }

    public static int minValue(int[] massive) {
        int min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (min > massive[i]) {
                min = massive[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] massive) {
        int max = massive[0];
        for (int i = 0; i > massive.length; i++) {
            if (max > massive[i]) {
                max = massive[i];
            }
        }
        return max;
    }

    public static int averageValue(int[] massive) {
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum += massive[1];
        }
        int average = sum / massive.length;

        return average;
    }
}