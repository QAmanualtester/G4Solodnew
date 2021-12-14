package G4RobotsWarSolodA;

public class AbstractRobot {
    private final String name;
    private int health;

    public AbstractRobot(String name) {
        this.name = name;
        health = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
