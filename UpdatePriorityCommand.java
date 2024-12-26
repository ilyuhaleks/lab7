package work7;

/**
 * Command to update the priority of an HTTP request.
 */
public class UpdatePriorityCommand implements Command {
    private QueueReceiver receiver;
    private HttpRequest request;
    private int newPriority;

    /**
     * Constructs a command to update the priority of an HTTP request.
     *
     * @param receiver    the receiver (queue) to update the request in
     * @param request     the HTTP request to update
     * @param newPriority the new priority to assign to the request
     */
    public UpdatePriorityCommand(QueueReceiver receiver, HttpRequest request, int newPriority) {
        this.receiver = receiver;
        this.request = request;
        this.newPriority = newPriority;
    }

    /**
     * Executes the command to update the priority of the request.
     */
    @Override
    public void execute() {
        receiver.updatePriority(request, newPriority);
    }
}
