package work7;

import java.util.*;

/**
 * Manages a queue of HTTP requests and provides methods for adding, removing, updating priority,
 * and processing requests.
 */
public class QueueReceiver {
    private PriorityQueue<HttpRequest> queue;

    /**
     * Initializes a QueueReceiver with an empty priority queue.
     * The queue will prioritize requests based on the lowest priority number.
     */
    public QueueReceiver() {
        queue = new PriorityQueue<>(Comparator.comparingInt(HttpRequest::getPriority));
    }

    /**
     * Adds an HTTP request to the queue.
     *
     * @param request the HTTP request to be added
     */
    public void addRequest(HttpRequest request) {
        queue.add(request);
        System.out.println("Added: " + request);
    }

    /**
     * Removes an HTTP request from the queue.
     *
     * @param request the HTTP request to be removed
     */
    public void removeRequest(HttpRequest request) {
        if (queue.remove(request)) {
            System.out.println("Removed: " + request);
        } else {
            System.out.println("Request not found for removal.");
        }
    }

    /**
     * Processes (removes) the highest priority request from the queue.
     */
    public void processRequest() {
        HttpRequest request = queue.poll();
        if (request != null) {
            System.out.println("Processing: " + request);
        } else {
            System.out.println("No requests to process.");
        }
    }

    /**
     * Updates the priority of a given HTTP request and reorders the queue.
     *
     * @param request    the HTTP request whose priority needs to be updated
     * @param newPriority the new priority to set for the request
     */
    public void updatePriority(HttpRequest request, int newPriority) {
        if (queue.remove(request)) {
            request.setPriority(newPriority);
            queue.add(request);
            System.out.println("Priority updated: " + request);
        } else {
            System.out.println("Request not found for priority update.");
        }
    }
}
