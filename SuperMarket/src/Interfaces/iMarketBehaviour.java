/**
* Этот интерфейс определяет поведение рынка, на котором актеры могут принимать участие.
*/
package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarketBehaviour {
/**
* Регистрирует покупателя в супермаркете.
* @param actor объект поведения покупателя, который будет зарегистрирован в супермаркете
*/
    void acceptToMarket(iActorBehaviour actor);
/**
 * Удаляет покупателя из супермаркета.
 * @param actors список покупателей, которые будут удалены из супермаркета
 */
    void releaseFromMarket(List<Actor> actors);
 /**
 * Обновляет состояние супермаркета.
 */ 
    void update();    
}
