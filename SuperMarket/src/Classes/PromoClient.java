/**
Этот класс представляет собой промо-клиента, который расширяет класс OrdinaryClient.
Он содержит идентификатор промо-клиента, название промо-акции и методы для получения и установки названия промо-акции.
* @author [Смирнов Михаил]
* @version 1.0
*/
package Classes;

/**
 * Класс PromoClient описывает акционного клиента.
 */
public class PromoClient extends OrdinaryClient {
    private static int promoClientId = 0;
    private String promoName;

    /**
     * Конструктор класса PromoClient.
     * @param name Имя клиента.
     * @param promoName Название акции.
     */
    public PromoClient(String name, String promoName) {
        super(name);
        this.promoName = promoName;
        promoClientId++;
    }

    /**
     * Метод для получения номера клиента в акции.
     * @return Номер клиента в акции.
     */
    public static int getPromoClientId() {
        return promoClientId;
    }

    /**
     * Метод для получения названия акции.
     * @return Название акции.
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * Метод для установки названия акции.
     * @param promoName Название акции.
     */
    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }
}