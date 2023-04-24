/**
Этот интерфейс определяет поведение очереди в супермаркете.
*/
package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
/**
* Добавление покупателя в очередь.
* @param actor объект поведения покупателя, который будет добавлен в очередь
*/
    void takeInQueue(iActorBehaviour actor);
/**
* Удаление первого покупателя из очереди.
*/
    void releaseFromQueue();
/**
* Система принимает заказ от первого покупателя в очереди.
*/
    void takeOrder();
/**
* Заказ первого покупателя в очереди.
*/
    void giveOrder();
}
