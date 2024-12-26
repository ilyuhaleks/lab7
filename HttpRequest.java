package work7;

/**
 * Represents an HTTP request with URL, method, and priority.
 */
public class HttpRequest {
    private String url;
    private String method;
    private int priority;

    /**
     * Constructs an HttpRequest object with specified URL, method, and priority.
     *
     * @param url      the URL of the request
     * @param method   the HTTP method (e.g., GET, POST)
     * @param priority the priority of the request (higher number = lower priority)
     */
    public HttpRequest(String url, String method, int priority) {
        this.url = url;
        this.method = method;
        this.priority = priority;
    }

    /**
     * Gets the URL of the HTTP request.
     *
     * @return the URL of the request
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets the HTTP method of the request.
     *
     * @return the HTTP method (GET, POST, etc.)
     */
    public String getMethod() {
        return method;
    }

    /**
     * Gets the priority of the HTTP request.
     *
     * @return the priority of the request
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the priority of the HTTP request.
     *
     * @param priority the new priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return method + " " + url + " (Priority: " + priority + ")";
    }
}
