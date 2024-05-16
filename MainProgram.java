public class MainProgram {
    public static void main(String[] args) {
        // Каждый из клиентов по очереди входят в магазин
        Market market = new Market();
        Human human1 = new Human("Первый посетитель");
        market.acceptToMarket(human1);
        Human human2 = new Human("Второй посетитель");
        market.acceptToMarket(human2);
        Human human3 = new Human();
        market.acceptToMarket(human3);
        // Стоя в очереди, клиенты обслуживаются по очереди
        market.update();
        market.update();
        market.update();
        // Когда очередь опустела, обслуживать больше некого
        market.update();
    }
}
