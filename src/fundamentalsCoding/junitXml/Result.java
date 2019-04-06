package fundamentalsCoding.junitXml;

import java.util.List;

public class Result {

    private Info resultInfo;

    private String processCount;
    private String failedProcessesCount;

    private List<ProcessResult> processesResults;

    public Result(Info resultInfo,
                  String processCount,
                  String failedProcessesCount,
                  List<ProcessResult> processesResults) {

        this.resultInfo = resultInfo;
        this.processCount = processCount;
        this.failedProcessesCount = failedProcessesCount;
        this.processesResults = processesResults;
    }

    public Info getResultInfo() {
        return resultInfo;
    }

    public String getProcessCount() {
        return processCount;
    }

    public String getFailedProcessesCount() {
        return failedProcessesCount;
    }

    public List<ProcessResult> getProcessesResults() {
        return processesResults;
    }


}
