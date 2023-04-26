/**
 * Интерфейс iReturnOrder описывает поведение клиентов при возврате товаров.
 * Классы, реализующие этот интерфейс, должны реализовать методы makeReturnOrder и takeCash.
 * @author [автор]
 * @version 1.0
 */
package Interfaces;

import Classes.Actor;
/** интерфейс возврата заказа */
public interface iReturnOrder {
    /** клиент сделал заявку на возврат */
    void setMakeReturnOrder(boolean makeReturnOrder);

    /** клиент забрал деньги */
    void setTakeCash(boolean takeCash);

    /** сделал ли клиент заявку на возврат */
    boolean isMakeReturnOrder();

    /** забрал ли клиент деньги */
    boolean isTakeCash();

    /** получить клиента */
    Actor getActor();
}
