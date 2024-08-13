public class Market {

    public void sellProducts(Inventory inventory) {
        int totalEarnings = 0;

        for (Item item : inventory.getItems()) {
            totalEarnings += item.getQuantity() * item.getPrice();
            item.setQuantity(0); // Vende todos os itens, esvaziando o estoque
        }

        System.out.println("Você vendeu todos os produtos por $" + totalEarnings);
    }
}
