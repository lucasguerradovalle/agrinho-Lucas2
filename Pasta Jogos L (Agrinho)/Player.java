public class Player {
    private String name;
    private int money;

    public Player() {
        this.name = "Player";
        this.money = 0;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int amount) {
        money += amount;
    }

    public void subtractMoney(int amount) {
        money -= amount;
    }
}