// Интерфейс, описывающий поведение в очереди
public interface QueueBehavior {
    void takeInQueue(Actor actor);  // Помещение клиента в очередь
    void takeOrders();      // Принять заказ у клиента
    void giveOrders();  // Выдать заказ клиенту
    void releaseFromQueue();    // Освобождение клиента из очереди
}
