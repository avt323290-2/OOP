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

public class Market implements iMarketBehaviour,iQueueBehaviour{
/**
* Список клиентов, находящихся в очереди.
*/
    private List<iActorBehaviour> queue;
/**
* Конструктор класса Market, создает пустой список очереди.
*/
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
/**
* Реализация метода интерфейса iMarketBehaviour для добавления клиента в магазин.
* 
* @param actor Клиент, пытающийся зайти в магазин.
*/
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }
/**
* Реализация метода интерфейса iQueueBehaviour для добавления клиента в очередь.
* 
* @param actor Клиент, добавляемый в очередь.
*/
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }
/**
* Реализация метода интерфейса iMarketBehaviour для удаления клиента из магазина.
* 
* @param actors Список клиентов, которые покидают магазин.
*/
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }
/**
* Реализация метода интерфейса iMarketBehaviour для выполнения операций, которые необходимо
* выполнять каждый цикл моделирования.
*/
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
/**
* Реализация метода интерфейса iQueueBehaviour для выдачи заказа клиенту.
*/
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
/**
* Реализация метода интерфейса iQueueBehaviour для удаления клиентов из очереди.
*/
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }

/**
* Реализация метода интерфейса iQueueBehaviour для проверки каждого клиента в очереди, 
* и если у клиента установлен флаг isMakeOrder в false, то ему предлагается сделать заказ
*/

    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
}