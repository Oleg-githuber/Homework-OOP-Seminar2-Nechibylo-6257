// Абстрактный класс, имплементирующий поведение из ActorBehavior
public abstract class Actor implements ActorBehavior {
    protected String name;      // Имя клиента. Инициализируется в конструкторе

    protected boolean isMakeOrder = false; // Клиент сделал заказ
    protected boolean isTakeOrder = false;  // Клиент забрал заказ

    // Конструктор
    public Actor(String name) {
        this.name = name;
    }

    // Гетер для имени
    abstract String getName();
}
