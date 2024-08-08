import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DriveToCityGUI extends JFrame {

    public DriveToCityGUI(FarmGameGUI farmGameGUI) { 
        setTitle("Driving to City");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel loadingLabel = new JLabel(new ImageIcon("Harvest & Haul/tela-loading.png"));
        loadingLabel.setBounds(0, 0, 800, 600);
        add(loadingLabel);

        Timer timer = new Timer(4000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Certifique-se que o construtor abaixo exista em CityGUI.java
                new CityGUI(farmGameGUI.getMarket(), farmGameGUI); 
                dispose(); // Fecha a tela de carregamento
            }
        });
        timer.setRepeats(false);
        timer.start();

        setVisible(true);
    }
}
