package fundamentalsCoding.junitXml;

public class Failure {

    private String message;
    private Severity severity;
    private String failureInfo;

    public Failure(String message, Severity severity, String failureInfo) {
        this.message = message;
        this.severity = severity;
        this.failureInfo = failureInfo;
    }

    public String getMessage() {
        return message;
    }

    public Severity getSeverity() {
        return severity;
    }

    public String getFailureInfo() {
        return failureInfo;
    }

    @Override
    public String toString() {
        return "Failure{" +
                "message='" + message + '\'' +
                ", severity=" + severity +
                ", failureInfo='" + failureInfo + '\'' +
                '}';
    }
}
