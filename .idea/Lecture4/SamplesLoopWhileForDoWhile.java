package Lecture4;

public class SamplesLoopWhileForDoWhile {
    public static void main(String[] args) {
        int n = 0;

        while (n < 5) {
            System.out.println(" While Element: " + n + " value: " + n);
            n++;
            if (n == 3) {
                break;
            }
        }
        {
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(" For Element: " + i + " value: " + i);
        }
        {
            System.out.println();
        }
        int m = 0;
        do {

            System.out.println(" Do while Element: " + m + " value: " + m);
            if (m == 3) {
                break;
            }
            m++;
        } while (m < 5);
    }
}

