package machine;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int disposableCups;
    private int money;


    public CoffeeMachine(int water, int milk, int beans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getMoney() {
        return money;
    }

}
