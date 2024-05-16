// Интерфейс, описывающий поведение посетителя
public interface ActorBehavior {
    boolean isMakeOrder();    // Клиент сделал заказ
    boolean isTakeOrder();    // Клиент забрал заказ
    // Сетеры
    void setMakeOrder(boolean boolValue);
    void setTakeOrder(boolean boolValue);
}
