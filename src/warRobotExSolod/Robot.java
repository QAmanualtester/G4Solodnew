package warRobotExSolod;

public class Robot {
    private String nameRobot;

    public String getNameRobot() {
        return Main.getNameFromConsole();
    }

    public void setNameRobot(String nameRobot) {
        this.nameRobot = nameRobot;
    }

    public double getHealsRobot() {
        double healsRobot = 100;
        return healsRobot;
    }


}
