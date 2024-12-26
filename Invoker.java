package work7;

import java.util.*;

/**
 * Invoker class that invokes commands to be executed.
 */
public class Invoker {
    private List<Command> history = new LinkedList<>();

    /**
     * Executes a given command.
     *
     * @param command the command to execute
     */
    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }
}
