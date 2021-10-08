package stopwatch;
import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private StopWatch(){
        this.startTime= LocalDateTime.now();
    }

    private void start(){
        this.startTime=LocalDateTime.now();
    }

    private void stop(){
        this.endTime=LocalDateTime.now();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public int getElapsedTime(){
        return this.endTime.getSecond()-this.startTime.getSecond();
    }
}
