import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class SwingTankPanel extends JPanel {

    private JTextArea name;
    private JTextArea totalCapacity;
    private JTextArea reorderPoint;
    private JTextArea orderPlacd;
    private JTextArea orderQty;


    public SwingTankPanel(String tankName){
        super();
        name = new JTextArea(tankName, 10, 10);
        name.setEditable(false);

        totalCapacity = new JTextArea("Total Capacity: none", 1, 20);
        totalCapacity.setEditable(false);
        reorderPoint = new JTextArea("Reorder Point: none", 1, 20);
        reorderPoint.setEditable(false);
        orderPlacd = new JTextArea("Order Placed: none", 1, 20);
        orderPlacd.setEditable(false);
        orderQty = new JTextArea("Order Quantity: none", 1, 20);
        orderQty.setEditable(false);

        //Header Panel
        var tankTitle = new JPanel();
        tankTitle.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));
        tankTitle.add(name);

        //Stats Panel

        var statsPanel = new JPanel();
        statsPanel.setLayout(new GridBagLayout());
        var c = new GridBagConstraints();

        c.gridx=0;
        c.gridy=0;
        statsPanel.add(totalCapacity, c);
        c.gridy=1;
        statsPanel.add(reorderPoint, c);
        c.gridy = 2;
        statsPanel.add(orderPlacd,c);
        c.gridy = 3;
        statsPanel.add(orderQty,c );



        //Main Panel
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;

        add(tankTitle, c);

        c.gridy=1;
        add(statsPanel, c);
    }
}
