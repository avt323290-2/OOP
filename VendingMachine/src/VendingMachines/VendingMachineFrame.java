import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VendingMachineFrame extends JFrame {
    private final JList<Product> productList;
    private final JTextField cashField;

    public VendingMachineFrame() {
        super("Vending Machine");

        List<Product> products = new ArrayList<>();
        products.add(new Product("Cola", 88.0));
        products.add(new BottleOfWater("Water", 50.0, 500));
        products.add(new HotDrink("Tea", 40.0, 80, 200));

        productList = new JList<>(products.toArray(new Product[0]));
        JScrollPane scrollPane = new JScrollPane(productList);
        scrollPane.setPreferredSize(new Dimension(200, 100));
        add(scrollPane, BorderLayout.CENTER);

        JLabel cashLabel = new JLabel("Наличные:");
        add(cashLabel, BorderLayout.WEST);

        cashField = new JTextField();
        add(cashField, BorderLayout.EAST);

        JButton buyButton = new JButton("Оплатить");
        add(buyButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VendingMachineFrame::new);
    }
}