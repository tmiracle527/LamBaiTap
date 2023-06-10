package Bai4_3;

public class StopWatch {
    private long startTime, endTime;

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }
    public long elapsedTime(){
        return this.endTime- this.startTime;
    }


}
