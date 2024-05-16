public class Human extends Actor {

    // Конструктор
    public Human(String name) {
        super(name);
    }
    // Перегруженый конструктор
    public Human() {
        this("Неизвестный");
    }

    // Переопределение наследуемых методов
    @Override
    String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean boolValue) {
        super.isMakeOrder = boolValue;
    }

    @Override
    public void setTakeOrder(boolean boolValue) {
        super.isTakeOrder = boolValue;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

}
