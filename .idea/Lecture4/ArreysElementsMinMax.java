package Lecture4;

public class ArreysElementsMinMax {
    public static void main(String[] args) {

        int[] elements = {2, 54, 588, -52, 0, 5485};
        int min = elements[0];

        for (int i = 0; i < elements.length; i++) {
            if (min > elements[i]) {
                min = elements[i];
            }
        }
        System.out.println("Minimal number is " + min);
    }
}

//    int[] elements2 = {5, 67,4654, -548, 45, 0, 45, 5854};
//    int max = elements2[0];
//        for (int i = 0; i > elements2.length; i++) {
//        if (max < elements2[i]) {
//            max = elements2[i];
//        }
//    }
//        System.out.println("Maximal number is " + max);
//}
