package fundamentalsCoding.junitXml;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;

public class ResultTest {

    // Create a Result for 4 processes,
    // each having at least one event, and at least one failure.
    public static void main(String[] args) {

        // EVENTS
        // PROCESS1
        List<EventResult> events1 = List.of(
                new EventResult(
                        new Info("LightEvent", "1/1", "100"),
                        emptyList())
        );

        // PROCESS2
        List<EventResult> events2 = List.of(
                new EventResult(
                        new Info("SoftEvent", "2/1", "100"),
                        emptyList())
        );

        // PROCESS3
        List<EventResult> events3 = List.of(
                new EventResult(
                        new Info("LightEvent", "3/1", "25"),
                        emptyList()),

                new EventResult(
                        new Info("StressEvent", "3/2", "25"),
                        List.of(new Failure(
                                "too much stress!",
                                Severity.WARNING,
                                "event failed at 15:40 with a shutdown")))
        );
        // PROCESS4
        List<EventResult> events4 = List.of(
                new EventResult(
                        new Info("LightEvent", "4/1", "25"),
                        emptyList()),

                new EventResult(
                        new Info("LightEvent", "4/2", "20"),
                        emptyList()),

                new EventResult(
                        new Info("DisasterEvent", "4/3", "5"),
                        List.of(new Failure(
                                "explosion",
                                Severity.ERROR,
                                "EXPLOSION !!!")))
        );

        // PROCESSES
        List<ProcessResult> processesResults = List.of(

                new ProcessResult(
                        new Info("LightStressProcess", "1", "100"),
                        "1",
                        "0",
                        events1),

                new ProcessResult(
                        new Info("SoftStressProcess", "2", "100"),
                        "1",
                        "0",
                        events2),

                new ProcessResult(
                        new Info("StressProcess", "3", "50"),
                        "2",
                        "1",
                        events3),

                new ProcessResult(
                        new Info("DisasterStressProcess", "4", "50"),                        "3",
                        "1",
                        events4)
        );

        Result result = new Result(
                new Info("StressResult", "100", "300"),
                "4",
                "2",
                processesResults);

        System.out.println(result);

    }


}
