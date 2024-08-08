import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FarmGameGUI extends JFrame {
    private Farm farm;
    private Inventory inventory;
    private Market market;
    private Player player;

    private JLabel farmLabel;
    private JLabel moneyLabel;

    private int plantStage = 0;
    private ImageIcon[] plantImages;

    public FarmGameGUI(Farm farm, Inventory inventory, Market market, Player player) {
        this.farm = farm;
        this.inventory = inventory;
        this.market = market;
        this.player = player;

        setTitle("Farm Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        plantImages = new ImageIcon[] {
            new ImageIcon("Harvest & Haul/milho 1.png"),
            new ImageIcon("Harvest & Haul/milho 2.png"),
            new ImageIcon("Harvest & Haul/milho 3.png"),
            new ImageIcon("Harvest & Haul/milho 4.png")
        };

        farmLabel = new JLabel();
        farmLabel.setBounds(100, 100, 600, 400);
        add(farmLabel);

        moneyLabel = new JLabel("Dinheiro: $" + player.getMoney());
        moneyLabel.setBounds(10, 10, 200, 30);
        add(moneyLabel);

        JButton plantButton = new JButton("Plant");
        plantButton.setBounds(10, 50, 100, 30);
        plantButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (plantStage == 0) {
                    farmLabel.setIcon(plantImages[0]);
                    plantStage++;
                }
            }
        });
        add(plantButton);

        JButton waterButton = new JButton("Water Plants");
        waterButton.setBounds(120, 50, 120, 30);
        waterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (plantStage > 0 && plantStage < plantImages.length) {
                    farmLabel.setIcon(plantImages[plantStage]);
                    plantStage++;
                }
            }
        });
        add(waterButton);

        JButton harvestButton = new JButton("Harvest");
        harvestButton.setBounds(250, 50, 100, 30);
        harvestButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (plantStage == plantImages.length) {
                    player.addMoney(100);
                    moneyLabel.setText("Dinheiro: $" + player.getMoney());
                    plantStage = 0;
                    farmLabel.setIcon(null);
                }
            }
        });
        add(harvestButton);

        JButton goToCityButton = new JButton("Go to City");
        goToCityButton.setBounds(360, 50, 100, 30);
        goToCityButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DriveToCityGUI(FarmGameGUI.this);
            }
        });
        add(goToCityButton);

        setVisible(true);
    }

    public Market getMarket() {
        return market;
    }

    public void updateStatus() {
        moneyLabel.setText("Dinheiro: $" + player.getMoney());
    }
}
