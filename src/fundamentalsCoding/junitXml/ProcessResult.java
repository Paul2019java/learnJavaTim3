package fundamentalsCoding.junitXml;

import java.util.List;

public class ProcessResult {

    private Info processResultInfo;

    private String eventCount;
    private String failedEventsCount;

    private List<EventResult> eventsResults;

    public ProcessResult(Info processResultInfo,
                         String eventCount,
                         String failedEventsCount,
                         List<EventResult> eventsResults) {
        this.processResultInfo = processResultInfo;
        this.eventCount = eventCount;
        this.failedEventsCount = failedEventsCount;
        this.eventsResults = eventsResults;
    }

    public Info getProcessResultInfo() {
        return processResultInfo;
    }

    public String getEventCount() {
        return eventCount;
    }

    public String getFailedEventsCount() {
        return failedEventsCount;
    }

    public List<EventResult> getEventsResults() {
        return eventsResults;
    }

    @Override
    public String toString() {
        return "\n\n  ProcessResult{" +
                "\n   processResultInfo=" + processResultInfo +
                ", \n   eventCount='" + eventCount + '\'' +
                ", \n   failedEventsCount='" + failedEventsCount + '\'' +
                ", \n   eventsResults=" + eventsResults +
                '}';
    }
}
