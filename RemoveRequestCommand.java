package work7;

/**
 * Command for removing an HTTP request from the queue.
 */
public class RemoveRequestCommand implements Command {
    private QueueReceiver receiver;
    private HttpRequest request;

    /**
     * Constructs a command to remove an HTTP request from the queue.
     *
     * @param receiver the receiver (queue) from which the request will be removed
     * @param request  the HTTP request to remove
     */
    public RemoveRequestCommand(QueueReceiver receiver, HttpRequest request) {
        this.receiver = receiver;
        this.request = request;
    }

    /**
     * Executes the command to remove the request from the queue.
     */
    @Override
    public void execute() {
        receiver.removeRequest(request);
    }
}
