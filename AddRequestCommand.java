package work7;

/**
 * Command for adding an HTTP request to the queue.
 */
public class AddRequestCommand implements Command {
    private QueueReceiver receiver;
    private HttpRequest request;

    /**
     * Constructs a command to add an HTTP request to the queue.
     *
     * @param receiver the receiver (queue) to which the request will be added
     * @param request  the HTTP request to add
     */
    public AddRequestCommand(QueueReceiver receiver, HttpRequest request) {
        this.receiver = receiver;
        this.request = request;
    }

    /**
     * Executes the command to add the request to the queue.
     */
    @Override
    public void execute() {
        receiver.addRequest(request);
    }
}
