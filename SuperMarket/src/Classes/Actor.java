/**
/ Абстрактный класс для представления покупателя.
/Реализует интерфейс iActorBehaviour.
*/
package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name; // Имя покупателя
    protected boolean isTakeOrder; // Флаг, указывающий, получил ли покупатель свой заказ
    protected boolean isMakeOrder; // Флаг, указывающий, сделал ли покупатель заказ
/**
* Конструктор класса Actor.
* @param name Имя покупателя.
*/
    public Actor(String name) {
        this.name = name;
    }
/**
* Абстрактный метод для получения имени актера.
* @return Имя актера.
*/
    public abstract String getName(); 
}
