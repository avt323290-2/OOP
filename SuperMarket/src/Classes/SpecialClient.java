/**
* Класс SpecialClient представляет объект покупателя с особым статусом (VIP).
* Наследуется от класса Actor и добавляет поле idVIP для идентификации покупателя.
* Класс может принимать заказы и выполнять заказы.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

/** Класс VIP клент, наследуется от родительского класса Actor */
public class SpecialClient extends Actor{
    /** персональный номер VIP клиента. Приватный(инкапсуляция) */
    private int idVIP;

    /**
     * базовый конструктор класса VIP клиент
     * @param name Имя
     * @param idVIP персональный номер VIP клиента
     */
    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Геттер. метод для получение персонального номера
     * @return персональный номер VIP клиента
     */
    public int getIdVIP() {
        return idVIP;
    }

    /** переопределение метода: сделан ли заказ */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** переопределение метода: получен ли заказ */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /** Сеттер. переопределение метода: сделан заказ */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /** Сеттер. переопределение метода: заказ получен */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /** переопределение метода: получить Клиента */
    @Override
    public Actor getActor() {
        return this;
    }

    /** переопределение метода:  есть ли заявка на возврат товара */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода забрал ли деньги */
    @Override
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода сделал заявку на возврат */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода забрать деньги */
    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }
    
}