package Products;
/** 
 * Класс для горячих напитков
*/
public class HotDrink extends Product {
    /** температура напитка */
    private int temperature;
    private int volume;

    public HotDrink(String name, double price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", coste=" + getPrice() +
                ", temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}