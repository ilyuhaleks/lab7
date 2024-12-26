package work7;

/**
 * Command for processing (removing) the highest priority HTTP request from the queue.
 */
public class ProcessRequestCommand implements Command {
    private QueueReceiver receiver;

    /**
     * Constructs a command to process an HTTP request from the queue.
     *
     * @param receiver the receiver (queue) that will process the request
     */
    public ProcessRequestCommand(QueueReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Executes the command to process the next highest priority request.
     */
    @Override
    public void execute() {
        receiver.processRequest();
    }
}
