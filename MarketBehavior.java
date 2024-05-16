import java.util.List;

// Интерфейс, описывающий поведение в магазине
public interface MarketBehavior {
    void acceptToMarket(Actor actor); // Впустить клиента в магазин
    void releaseFromMarket(List<Actor> actors);   // Выпустить клиента из магазина
    void update(); // Обновить состояние магазина
}
