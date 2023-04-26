/**
/ Абстрактный класс для представления покупателя.
/Реализует интерфейс iActorBehaviour.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;
/** базовый (родительский) класс */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /** имя */
    protected String name;
    /** статус выполнения заказа */
    protected boolean isTakeOrder;
    /** статус получения заказа  */
    protected boolean isMakeOrder;
    /** статус оплаты  */
    protected boolean isTakeCash;
    /** статус возврата заказа */
    protected boolean isMakeReturnOrder;
    
    /**
     * конструктор класса
     * @param name имя
     */
    public Actor(String name) {
        this.name = name;
    }
    /**
     * гет метод для получения имени
     * @return имя
     */
    public  String getName(){
        return name;
    } 

}