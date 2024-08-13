import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Farm farm = new Farm();
            Inventory inventory = new Inventory();
            Market market = new Market();
            Player player = new Player(500); // Jogador começa com $500

            new FarmGameGUI(farm, inventory, market, player);
        });
    }
}
