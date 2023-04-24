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
/**
*  Метод, который устанавливает значение логической переменной isMakeOrder, которая указывает, делает ли клиент заказ.
*/
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
/**
* Метод, который возвращает значение логической переменной isTakeOrder, которая указывает, получил ли клиент заказ.
*/
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
/**
* Метод, который устанавливает значение логической переменной isMakeOrder, которая указывает, делает ли клиент заказ. 
*/
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }
/**
* Метод, который устанавливает значение логической переменной isTakeOrder, которая указывает, получил ли клиент заказ. 
*/
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }
/*
*  Метод, который возвращает объект Actor, используемый для идентификации клиента.
*/
    @Override
    public Actor getActor() {
        return this;
    }

    
}
