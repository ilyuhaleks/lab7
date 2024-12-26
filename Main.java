package work7;

/**
 * Main class to demonstrate the Command pattern for managing HTTP requests.
 */
public class Main {
    public static void main(String[] args) {
        QueueReceiver receiver = new QueueReceiver();
        Invoker invoker = new Invoker();

        HttpRequest request1 = new HttpRequest("http://zrazok.com", "GET", 5);
        HttpRequest request2 = new HttpRequest("http://zrazok.com/post", "POST", 10);
        HttpRequest request6 = new HttpRequest("http://zrazok.com/patch", "PATCH", 16);

        invoker.executeCommand(new AddRequestCommand(receiver, request1));
        invoker.executeCommand(new AddRequestCommand(receiver, request2));
        invoker.executeCommand(new AddRequestCommand(receiver, request6));

        invoker.executeCommand(new UpdatePriorityCommand(receiver, request1, 15));
        invoker.executeCommand(new UpdatePriorityCommand(receiver, request6, 1));

        invoker.executeCommand(new RemoveRequestCommand(receiver, request2));

        invoker.executeCommand(new ProcessRequestCommand(receiver));
        invoker.executeCommand(new ProcessRequestCommand(receiver));
    }
}
