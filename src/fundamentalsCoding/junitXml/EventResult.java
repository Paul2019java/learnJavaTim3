package fundamentalsCoding.junitXml;

import java.util.List;

public class EventResult {

    private Info eventResultInfo;

    private List<Failure> failures;

    public EventResult(Info eventResultInfo, List<Failure> failures) {
        this.eventResultInfo = eventResultInfo;
        this.failures = failures;
    }

    public Info getEventResultInfo() {
        return eventResultInfo;
    }

    public List<Failure> getFailures() {
        return failures;
    }

    @Override
    public String toString() {
        return "\n\n    EventResult{" +
                "\n    eventResultInfo=" + eventResultInfo +
                ", \n    failures=" + failures +
                '}';
    }
}
