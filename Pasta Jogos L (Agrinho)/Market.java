public class Market {
    private Inventory inventory;

    public Market(Inventory inventory) {
        this.inventory = inventory;
    }

    public void sellProducts() {
        int totalValue = 0;
        for (Item item : inventory.getItems()) {
            totalValue += item.getValue();
        }

        inventory.getPlayer().addMoney(totalValue);
        inventory.clear();
    }
}
