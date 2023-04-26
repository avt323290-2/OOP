/**
Этот интерфейс определяет поведение очереди в супермаркете.
*/
package Interfaces;

/** интерфейс Очереди */
public interface iQueueBehaviour {
    /** клиент  попал в очередь */
    void takeInQueue(iActorBehaviour actor);

    /** клиент покинул очередь */
    void releaseFromQueue();

    /** клиент сделал заказ */
    void giveOrder();

    /** клиент получил заказ */
    void takeOrder();
    
}