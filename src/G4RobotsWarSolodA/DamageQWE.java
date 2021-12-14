package G4RobotsWarSolodA;

import java.util.Random;

public class DamageQWE {
    String alphabet = "QWEASDZXC";
    char getRandomKey(){
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }
}
