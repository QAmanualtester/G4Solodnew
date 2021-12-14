package war;

import java.util.Scanner;

public class WritenName {
    public static int getNameFromConsole() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }
}
