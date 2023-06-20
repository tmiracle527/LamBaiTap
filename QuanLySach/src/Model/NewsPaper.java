package Model;

import java.util.Scanner;

public class NewsPaper extends Document {
    private String releaseDay;


    public NewsPaper(String name, String publisher, int releaseNumber, String releaseDay) {
        super(name, publisher, releaseNumber);
        this.releaseDay = releaseDay;
    }

    public String getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(String releaseDay) {
        this.releaseDay = releaseDay;
    }

    public void inputNewsPaper() {
        Scanner scanner = new Scanner(System.in);
        super.InputDocument();
        System.out.println("Ngày Phát Hành: ");
        this.releaseDay = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                "Mã Tài Liệu =" + getId() + '\'' +
                ", Tên Tài Liệu ='" + getName() + '\'' +
                ", Nhà Phát Hành ='" + getPublisher() + '\'' +
                ", Số Phát Hành =" + getReleaseNumber() +
                "releaseDay='" + releaseDay + '\'' +
                '}';
    }
}