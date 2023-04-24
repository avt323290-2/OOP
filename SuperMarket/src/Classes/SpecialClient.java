/**
* Класс SpecialClient представляет объект клиента с особым статусом (VIP).
* Наследуется от класса Actor и добавляет поле idVIP для идентификации клиента.
* Класс может принимать заказы и выполнять заказы.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

public class SpecialClient extends Actor{
/**
* Уникальный идентификатор VIP-клиента.
*/
    private int idVIP;
/**
* Создает новый объект SpecialClient с указанным именем и идентификатором VIP-клиента.
* @param name имя клиента
* @param idVIP уникальный идентификатор VIP-клиента
*/
    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }
/**
* Возвращает имя объекта SpecialClient.
* @return имя объекта SpecialClient
*/
    @Override
    public String getName() {
        return super.name;
    }
/**
* Возвращает уникальный идентификатор VIP-клиента.
* @return уникальный идентификатор VIP-клиента
*/
    public int getIdVIP() {
        return idVIP;
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
