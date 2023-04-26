/**
Класс PromotionalClient представляет объект покупателя, участвующего в акции.
* Наследуется от класса Actor и добавляет поля название акции и номер покупателя, участвующего в акции.
* Класс может принимать заказы и выполнять заказы.
* @author [Смирнов Михаил]
* @version 1.0
*/

package Classes;

/** Класс промо покупатель, наследуется от родительского класса Actor */
public class PromotionalClient extends Actor{
    /** персональный номер промо покупателя. Приватный(инкапсуляция) */
    private int idPromo;

    /**
     * базовый конструктор класса промо покупатель
     * @param name Имя
     * @param idPromo персональный номер Ptomo покупателя
     */
    public PromotionalClient(String name, int idPromo){
        super(name);
        this.idPromo = idPromo;
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Getter метод для получение персонального номера
     * @return персональный номер Promo покупателя
     */
    public int getIdPtomo() {
        return idPromo;
    }

    /** переопределение метода: сделан ли заказ покупателем*/
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** переопределение метода: получен ли заказ покупателем*/
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /** Setter. переопределение метода: сделан заказ покупателем*/
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /** Setter. переопределение метода: заказ получен покупателем*/
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /** переопределение метода: получить покупателя */
    @Override
    public Actor getActor() {
        return this;
    }

    /** переопределение метода: есть ли заявка на возврат товара */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода: забрал ли покупатель деньги */
    @Override
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода: сделал ли покупатель заявку на возврат */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода: покупатель забирает деньги */
    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }
}