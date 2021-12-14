package warRobotExSolod;

public class Main extends  Menu{

    public static void main(String[] args) {

        MenuRobot.printMenuRobor();
        String nameRobot=getNameFromConsole();
        //String nameRobot2=getNameFromConsole();
//
//        System.out.println(" Name first Robot " + nameRobot);
//        System.out.println(" Name second Robot " + nameRobot2);
        Robot robot=new Robot();
        Robot robot1=new Robot();
        System.out.println(String.format(" Name first Robot %s , heals ",nameRobot,robot.getHealsRobot()));
//        System.out.println(robot.getHealsRobot() + nameRobot);
//        System.out.println(robot1.getHealsRobot()+ nameRobot2 );







    }
}
