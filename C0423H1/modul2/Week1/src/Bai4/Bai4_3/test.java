package Bai4_3;

public class test {
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        stopWatch.setStartTime();
        for (int i=0;i<100000;i++){
            for (int j=0;j<100000;j++){
                for (int k=0;k<100000;k++){

                }
            }
        }
        stopWatch.setEndTime();
        System.out.printf("thoi gian thuc thi %d ms", stopWatch.elapsedTime());
    }
}
