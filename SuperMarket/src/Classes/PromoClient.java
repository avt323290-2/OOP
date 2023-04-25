/**
Этот класс представляет собой промо-клиента, который расширяет класс OrdinaryClient.
Он содержит идентификатор промо-клиента, название промо-акции и методы для получения и установки названия промо-акции.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

public class PromoClient extends OrdinaryClient {
    private static int promoClientId = 0;
    private String promoName;
    /**
     * Конструктор класса PromoClient.
     * @param name Имя промо-клиента.
     * @param promoName Название промо-акции.
     */
    public PromoClient(String name, String promoName) {
        super(name);
        this.promoName = promoName;
        promoClientId++;
    }
    /**
     * Метод-геттер для идентификатора промо-клиента.
     * @return Идентификатор промо-клиента.
     */
    public static int getPromoClientId() {
        return promoClientId;
    }
    /**
     * Метод-геттер для названия промо-акции.
     * @return Название промо-кампании.
     */
    public String getPromoName() {
        return promoName;
    }
    /**
     * Метод-сеттер для названия промо-кампании.
     * @param promoName Новое название промо-кампании.
     */
    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }
}
