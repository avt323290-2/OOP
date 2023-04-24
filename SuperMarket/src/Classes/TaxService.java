/**
* Класс TaxService реализует интерфейс iActorBehaviour и представляет объект налоговой службы.
* Он может принимать заказы и выполнять заказы.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour {
    private String name;
    /**
    * Указание на то, что объект налоговой службы может выполнить заказ.
    */
    private boolean isTakeOrder;
    /**
    * Указание на то, что объект налоговой службы может принять заказ.
    */
    private boolean isMakeOrder;
    /**
    * Создание нового объекта TaxService с именем "Tax audit".
    */
    public TaxService() {
        this.name = "Tax audit";
    }

    /**
    * Возвращает имя объекта налоговой службы.
    * @return имя объекта налоговой службы
    */
    public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}
