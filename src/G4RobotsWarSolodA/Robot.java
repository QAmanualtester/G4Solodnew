package G4RobotsWarSolodA;

import java.util.ArrayList;
import java.util.List;

public class Robot extends AbstractRobot implements WarriorRobot {
    private Robot enemyRobot;
    private final List<Character> weakPlaces;

    public Robot(String name) {
        super(name);
        DamageQWE damageQWE = new DamageQWE();
        weakPlaces = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            char randomKey = damageQWE.getRandomKey();
            weakPlaces.add(randomKey);
        }
    }

    public void setEnemyRobot(Robot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void shootEnemy(Character shootChar) {
        if (enemyRobot.weakPlaces.contains(shootChar)) {
            enemyRobot.setHealth(enemyRobot.getHealth() - 20);
            enemyRobot.weakPlaces.remove(shootChar);
            System.out.println("Ай! Больно! Попал зараза!");
        } else {
            System.out.println("Ха-ха! Мимо!");
        }
    }

}
