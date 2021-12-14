package war;

public class Specifications {
    private String name;
    private int shot;
    private int heals;


    public Specifications(String name, int shot, int heals) {
        this.name = name;
        this.shot = shot;
        this.heals = heals;
    }


    //private  int damage;// тут сказали что ми от ХП отнимаем 20 ХР


    public int damage() {
        return heals - shot;
    }

//    public int getShot() {
//        return shot;
//    }

//    public void setShot(int shot) {
//        this.shot = shot;
//    }



    public String getName() {
        return name;
    }

//    public void setName(String name) {//?
//        this.name = name;
//    }

    public int getHeals() {
        return heals;
    }

//    public void setHeals(int heals) {
//        this.heals = heals;
//    }


    //    public int getDamage() {
//        return damage;
//    }
//тут ниже говорим что мы отнимаем ХП у какого то робота "-20 ХП"
    public int balanceOfHeal(int shot) {
        int tempResult =damage();
        System.out.println(String.format("У робота %s, осталось %s едениц здоровья! ", name, tempResult));

        return tempResult;
    }


}
