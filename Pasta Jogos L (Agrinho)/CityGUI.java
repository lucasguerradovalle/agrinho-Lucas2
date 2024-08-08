import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CityGUI extends JFrame {

    public CityGUI(Market market, FarmGameGUI farmGameGUI) {
        setTitle("City Market");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel cityLabel = new JLabel(new ImageIcon("Harvest & Haul/city.png"));
        cityLabel.setBounds(0, 0, 800, 600);
        add(cityLabel);

        JButton sellButton = new JButton("Sell Products");
        sellButton.setBounds(100, 500, 150, 30);
        sellButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                market.sellProducts(); // Método para vender os produtos
                farmGameGUI.updateStatus(); // Atualiza o status de dinheiro na fazenda
                dispose(); // Fecha a tela da cidade
            }
        });
        add(sellButton);

        setVisible(true);
    }
}
