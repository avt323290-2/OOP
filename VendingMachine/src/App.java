import Products.Product;
import Products.BottleOfWater;
import VendingMachines.VendingMachine;
import Products.HotDrink;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));
        itemMachin.addProduct(new HotDrink("Чай", 50.0 , 80, 250));
        itemMachin.addProduct(new HotDrink("Зеленый чай", 60.0, 75, 250));
        itemMachin.addProduct(new HotDrink("Кофе Американо маленький", 90.0, 90, 150));
        itemMachin.addProduct(new HotDrink("Кофе Американо большой", 90.0, 90, 300));
        itemMachin.addProduct(new HotDrink("Кофе Капучино маленький", 120.0, 85, 150));
        itemMachin.addProduct(new HotDrink("Кофе Капучино маленький", 120.0, 85, 300));
        itemMachin.addProduct(new HotDrink("Горячий шоколад", 80.0, 85, 250));
        
        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
        // Создаем экземпляр графического интерфейса и запускаем его
        VendingMachineGUI gui = new VendingMachineGUI(itemMachin);
        gui.setVisible(true);
    }
}