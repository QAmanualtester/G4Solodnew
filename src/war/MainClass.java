package war;

public class MainClass {
    public static void main(String[] args) {
        Robot robot=new Robot("qwe",20,100);
        System.out.println(robot.getHeals());
        System.out.println(robot.getName());

        System.out.println(robot.getHeals());

        System.out.println(robot.balanceOfHeal(20));




    }
}
