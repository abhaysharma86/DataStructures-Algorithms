package java8Features.exception;

public class ValidationException extends RuntimeException{

    private String message;
    private StackTraceElement[] traceMessage;

    public ValidationException(String message, StackTraceElement[] traceMessage) {
        super(message);
        this.message = message;
        this.traceMessage = traceMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StackTraceElement[] getTraceMessage() {
        return traceMessage;
    }

    public void setTraceMessage(StackTraceElement[] traceMessage) {
        this.traceMessage = traceMessage;
    }
}
