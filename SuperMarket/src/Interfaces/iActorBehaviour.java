/**
Этот интерфейс определяет поведение покупателя в супермаркете.
*/
package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
/**
* Устанавливает состояние покупателя, указывающее, будет ли он делать заказ.
* @param makeOrder true, если покупатель будет делать заказ, false в противном случае
*/
    void setMakeOrder(boolean makeOrder);
/**
* Устанавливает состояние покупателя, указывающее, будет ли он брать заказ.
* @param pickUpOrder true, если покупатель будет брать заказ, false в противном случае
*/
    void setTakeOrder(boolean pickUpOrder);
/**
* Возвращает текущее состояние покупателя относительно того, будет ли он делать заказ.
* @return true, если покупатель будет делать заказ, false в противном случае
*/
    boolean isMakeOrder();
/**
* Возвращает текущее состояние покупателя относительно того, будет ли он брать заказ.
* @return true, если покупатель будет брать заказ, false в противном случае
*/
    boolean isTakeOrder();
/**
* Получает объект покупателя, связанный с этим поведением.
* @return объект покупателя
*/
    Actor getActor();
}