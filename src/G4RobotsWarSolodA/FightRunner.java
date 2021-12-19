package G4RobotsWarSolodA;

import java.util.Scanner;

public class FightRunner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите имя 1-го робота: ");
        String robotName = scanner.nextLine();
        Robot robot1 = new Robot(robotName);

        System.out.print("Введите имя 2-го робота: ");
        robotName = scanner.nextLine();
        Robot robot2 = new Robot(robotName);

        robot1.setEnemyRobot(robot2);
        robot2.setEnemyRobot(robot1);

        System.out.println("Для выхода из боя нажмите L");
        System.out.println("Бой начинается!>");

        while (true) {
            robotAttack(robot1, robot1.getName());
            robotAttack(robot2, robot2.getName());

            System.out.println("Результат перестрелки: ");
            System.out.println("==============================================================");
            System.out.printf("Здоровье робота %s: %s%n", robot1.getName(), robot1.getHealth());
            System.out.printf("Здоровье робота %s: %s%n", robot2.getName(), robot2.getHealth());
            System.out.println("==============================================================");

            if (robot1.getHealth() <= 0) {
                System.out.println(robot1.getName() + " потерпел поражение...");
                break;
            } else if (robot2.getHealth() <= 0) {
                System.out.println(robot2.getName() + " потерпел поражение...");
                break;
            }
        }
    }

    private static void robotAttack(WarriorRobot robot, String name) {
        System.out.println("Стреляет робот " + name);
        System.out.println("Введите букву выстрела QWEASDZXC: ");
        char shootChar = scanner.next().charAt(0);
        if (shootChar == 'L') {
            System.out.println("Конец игры до окончания боя! Нет победителя!");
            System.exit(0);
       } else if (shootChar == 'l') {
           System.out.println("Конец игры до окончания боя! Нет победителя!");
           System.exit(0);
       }
        robot.shootEnemy(String.valueOf(shootChar).toLowerCase().charAt(0));
    }
}


