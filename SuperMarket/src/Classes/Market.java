/**
Класс Market представляет собой модель рынка, реализующую интерфейсы iMarketBehaviour и iQueueBehaviour.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
/** класс магазин. Имплементирует интерфейсы */
public class Market implements iMarketBehaviour,iQueueBehaviour{
   /** список покупателей в магазине. Приватный(инкапсуляция) */
    private List<iActorBehaviour> queue;

    /** конструктор класса */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /** переопределение метода: Покупатель зашел в магазин */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" покупатель пришел в магазин ");
        takeInQueue(actor);
    }

    /** переопределение метода: Покупатель занял очередь */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" покупатель добавлен в очередь ");
    }

    /** переопределение метода: покупатель покинул магазин */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" покупатель ушел из магазина ");
            queue.remove(actor);
        }
        
    }
    /** переопределение метода: обновление данных. */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }

    /** переопределение метода: заказ получен */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" покупатель получил свой заказ ");
            }
        }
        
    }
    /** переопределение метода: покупатель покинул очередь */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" покупатель покинул очередь ");
        }

       }
    releaseFromMarket(releaseActors);
    }


    /** переопределение метода: покупатель сделвл заказ */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" покупатель сделал заказ ");

            }
        }
        
    }
}