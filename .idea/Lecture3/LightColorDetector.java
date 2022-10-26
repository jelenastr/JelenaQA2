package Lecture3;

public class LightColorDetector {
    public String detect(int waveLength) {

        String result = "Invisible Light";

        if ((waveLength >= 380) && (waveLength <= 449)) {
           result = "Violet";
        } else if ((waveLength >= 450) && (waveLength <= 494)) {
            result = "Blue";
        } else if ((waveLength >= 495) && (waveLength <= 569)) {
            result = "Green";
        } else if ((waveLength >= 470) && (waveLength <= 589)) {
            result = "Yellow";
        } else if ((waveLength >= 590) && (waveLength <= 619)) {
            result = "Orange";
        } else if ((waveLength >= 620) && (waveLength <= 750)) {
           result = "Red";
        }
        return result;
    }
}


