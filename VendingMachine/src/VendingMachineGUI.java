import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Products.Product;
import VendingMachines.VendingMachine;

public class VendingMachineGUI extends JFrame {
    private static final long serialVersionUID = 1L;
private VendingMachine vendingMachine;
private JList<Product> productList;
private JTextField cashField;

public VendingMachineGUI(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
    setTitle("Vending Machine");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 300);
    setLocationRelativeTo(null);
    initUI();
}

private void initUI() {
    // Создаем панель для списка продуктов
    JPanel productPanel = new JPanel(new BorderLayout());
    productPanel.add(new JLabel("Продукты:"), BorderLayout.NORTH);
    productList = new JList<Product>(vendingMachine.getProdAll().toArray(new Product[0]));
    productPanel.add(productList, BorderLayout.CENTER);

    // Создаем панель для ввода наличности
    JPanel cashPanel = new JPanel(new BorderLayout());
    cashPanel.add(new JLabel("Наличные:"), BorderLayout.WEST);
    cashField = new JTextField();
    cashPanel.add(cashField, BorderLayout.CENTER);

    // Создаем кнопку "Оплатить"
    JButton buyButton = new JButton("Оплатить");
    buyButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Получаем выбранный продукт и введенную наличность
            Product selectedProduct = productList.getSelectedValue();
            int cash = Integer.parseInt(cashField.getText());
    
            // Выполняем покупку и выводим результат
            String result;
            if (cash < selectedProduct.getPrice()) {
                result = "Недостаточно средств";
            } else {
                double change = cash - selectedProduct.getPrice();
                result = "Покупка совершена успешно! Ваша сдача: " + change;
                vendingMachine.buy(selectedProduct, cash);
            }
            
            JLabel resultLabel = new JLabel(result);
            JPanel resultPanel = new JPanel();
            resultPanel.add(resultLabel);
            getContentPane().add(resultPanel, BorderLayout.SOUTH);
            pack();
        }
    });

    // Добавляем все элементы на главную панель
    JPanel mainPanel = new JPanel(new BorderLayout());
    mainPanel.add(productPanel, BorderLayout.CENTER);
    mainPanel.add(cashPanel, BorderLayout.SOUTH);
    mainPanel.add(buyButton, BorderLayout.EAST);
    getContentPane().add(mainPanel);

    // Отображаем окно
    setVisible(true);
}
}