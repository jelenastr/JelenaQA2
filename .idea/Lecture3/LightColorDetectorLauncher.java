package Lecture3;

public class LightColorDetectorLauncher {
    public static void main(String[] args) {

        LightColorDetector lightColorDetector = new LightColorDetector();

        System.out.println(lightColorDetector.detect(780));

        System.out.println(lightColorDetector.detect(381));

        System.out.println(lightColorDetector.detect(450));

        System.out.println(lightColorDetector.detect(495));

        System.out.println(lightColorDetector.detect(590));

        System.out.println(lightColorDetector.detect(570));

        System.out.println(lightColorDetector.detect(620));

    }
}
