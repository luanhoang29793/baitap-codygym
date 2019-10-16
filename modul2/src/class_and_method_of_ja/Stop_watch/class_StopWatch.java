package class_and_method_of_ja.Stop_watch;

import java.util.Scanner;

public class class_StopWatch {
    private long StartTime;
    private long endTime;


    public long getStartTime() {
        return StartTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void Start() {
        this.StartTime = System.currentTimeMillis();
    }

    public void Stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.StartTime;
    }


}

