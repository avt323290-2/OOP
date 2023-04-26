/**
* Класс OrdinaryClient представляет объект обычного клиента.
* Наследуется от класса Actor и используется для идентификации клиента.
* Класс может принимать заказы и выполнять заказы.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

/** класс Обычный клиент */
public class OrdinaryClient extends Actor {

    /**
     * Базовый конструктор класса
     * @param name Имя
     */
    public OrdinaryClient(String name)
    {
        super(name);
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {        
        return super.name;
    }

    /** переопределение метода: покупатель сделал ли заказ */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** переопределение метода:  забрал ли заказ покупатель*/
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    
    /** Сеттер. переопределение метода : покупатель сделал заказ  */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /** Сеттер.перопределение метода: покупатель получил заказ */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /** переопределение метода: получить */
    @Override
    public Actor getActor() {
        return this;
    }

    /** переопределение метода: есть ли заявка от покупателя на возврат товара */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода забрал ли деньги покупатель*/
    @Override
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода: покупатель сделал заявку на возврат */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода: покупатель забрад деньги */
    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }
    
}
