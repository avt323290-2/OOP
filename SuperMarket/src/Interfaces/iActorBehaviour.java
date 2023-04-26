/**
Этот интерфейс определяет поведение покупателя в супермаркете.
*/
package Interfaces;

import Classes.Actor;
/** интерфейс Очереди клиентов */
public interface iActorBehaviour {
    /** сделан заказ */
    void setMakeOrder(boolean makeOrder);

    /** Получен заказ */
    void setTakeOrder(boolean pickUpOrder);

    /** сделан ли заказ */
    boolean isMakeOrder();

    /** получен ли заказ */
    boolean isTakeOrder();

    /** покупатель */
    Actor getActor();
}