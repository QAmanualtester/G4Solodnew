package warRobotExSolod;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Menu {

    public static  String getNameFromConsole(){
        Scanner scanner = new Scanner(System.in);
    try{
        return  scanner.nextLine();
    }catch (Exception e){
        return " not String ";
    }


    }

}
