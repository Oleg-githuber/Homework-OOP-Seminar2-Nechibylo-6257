import java.util.ArrayList;
import java.util.List;

// Класс магазин
public class Market implements QueueBehavior, MarketBehavior {
    private List<Actor> actors;     // Список клиентов в очереди
    Actor outActor;
    // Конструктор
    public Market() {
        this.actors = new ArrayList<>();
    }

    // Впустить клиента в магазин
    @Override
    public void acceptToMarket(Actor actor) {
        //actor = new Human();
        System.out.printf("%s вошёл в магазин\n", actor.getName());
        takeInQueue(actor);     // Поставить клиента в очередь

    }

    // Выпустить клиента из магазина
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        //this.actors = actors;
        System.out.printf("%s вышел из магазина\n", outActor.getName());
        outActor = null;
    }

    // Метод обслуживания клиента (обновление состояния магазина)
    @Override
    public void update() {
        if (!this.actors.isEmpty()) takeOrders();   // Если в очереди кто-то есть, принимаем заказ
        else System.out.println("В очереди никого нет!");
    }

    // Поставить клиента в очередь
    @Override
    public void takeInQueue(Actor actor) {
        this.actors.add(actor);
        System.out.printf("%s встал в очередь\n", actor.getName());
    }

    // Принять заказ у клиента
    @Override
    public void takeOrders() {
        if (!this.actors.get(0).isMakeOrder()) {        // Если клиент не сделал заказ, принимаем его заказ
            this.actors.get(0).setMakeOrder(true);
            System.out.printf("%s сделал заказ\n", this.actors.get(0).getName());
        }
        if (this.actors.get(0).isMakeOrder && !this.actors.get(0).isTakeOrder()) {      // Если клиент сделал заказ, но ещё не получил его, выдать ему заказ
            giveOrders();
        }
    }

    // Выдать заказ клиенту
    @Override
    public void giveOrders() {
        this.actors.get(0).setTakeOrder(true);
        System.out.printf("%s забрал свой заказ\n", this.actors.get(0).getName());
        releaseFromQueue();         // Отпустить клиента из очереди
    }

    @Override
    public void releaseFromQueue() {
        this.actors.get(0).setMakeOrder(false);     // У клиента нет активных заказов
        this.actors.get(0).setTakeOrder(false);     // И нет неоплаченых товаров
        outActor = actors.get(0);                   // Запоминаем уходящего клиента
        this.actors.remove(0);              // Клиент вышел из очереди
        System.out.printf("%s вышел из очереди\n", outActor.getName());
        releaseFromMarket(this.actors);         // Елиент выходит из магазина
    }
}
