import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

       Market market = new Market();
       iActorBehaviour item1 = new OrdinaryClient("Селиванов Мван" + " -");
       iActorBehaviour item2 = new SpecialClient("Широкова Людмила" + " - Vip", 1101);
       iActorBehaviour item3 = new OrdinaryClient("Георгиев Михаил" + " -");
       iActorBehaviour item4 = new OrdinaryClient("Митин Дмитрий" + " -");
       iActorBehaviour item5 = new SpecialClient("Сергеев Алексей" + " - Vip", 1221);
       iActorBehaviour item6 = new OrdinaryClient("Корнилова Татьяна" + " -");
       iActorBehaviour item7 = new PromotionalClient("Турко Елена" + " - Promo", 1333);

       market.acceptToMarket(item1);
       market.acceptToMarket(item2);
       market.acceptToMarket(item3);
       market.acceptToMarket(item4);
       market.acceptToMarket(item5);
       market.acceptToMarket(item6);
       market.acceptToMarket(item7);
       market.update();
    }
}