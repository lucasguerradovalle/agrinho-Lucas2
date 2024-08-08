import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Player player = new Player(); // Certifique-se de que Player é inicializado corretamente
            Inventory inventory = new Inventory(player);
            Market market = new Market(inventory);
            Farm farm = new Farm(); // Se necessário, inicialize a fazenda corretamente
            new FarmGameGUI(farm, inventory, market, player);
        });
    }
}
