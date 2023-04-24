/**
* Класс OrdinaryClient представляет объект обычного клиента.
* Наследуется от класса Actor и используется для идентификации клиента.
* Класс может принимать заказы и выполнять заказы.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

public class OrdinaryClient extends Actor {
/**
 * Создает новый объект OrdinaryClient с указанным именем.
 * @param name имя клиента
 */
    public OrdinaryClient(String name)
    {
        super(name);
    }
/**
 * Возвращает имя объекта OrdinaryClient.
 * @return имя объекта OrdinaryClient
 */
    @Override
    public String getName() {        
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return this;
    }

    
}
