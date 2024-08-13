import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CityGUI extends JFrame {

    public CityGUI(Market market, FarmGameGUI farmGameGUI) {
        setTitle("City Market");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton sellButton = new JButton("Sell Products");
        sellButton.setBounds(350, 250, 150, 50);
        sellButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                market.sellProducts(farmGameGUI.getInventory());
                farmGameGUI.updateStatus();
                dispose(); // Fecha a tela da cidade
            }
        });
        add(sellButton);

        setVisible(true);
    }
}
