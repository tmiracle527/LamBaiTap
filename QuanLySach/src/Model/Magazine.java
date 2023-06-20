package Model;

import java.util.Scanner;

public class Magazine extends Document{
    private String releaseCode;
    private int releaseMonth;


    public Magazine(String name, String publisher, int releaseNumber, String releaseCode, int releaseMonth) {
        super(name, publisher, releaseNumber);
        this.releaseCode = releaseCode;
        this.releaseMonth = releaseMonth;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public void setReleaseCode(String releaseCode) {
        this.releaseCode = releaseCode;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
    public void inputMagazine(){
        Scanner scanner = new Scanner(System.in);
        super.InputDocument();
        System.out.println("Số Phát Hành: ");
        this.releaseCode = scanner.nextLine();


        do {
            try {
                System.out.println("Tháng Phát Hành: ");
                this.releaseMonth = Integer.parseInt(scanner.nextLine());
                if (this.releaseMonth <= 0|| this.releaseMonth>12) {
                    System.out.println("\n" + "Tháng Phát Hành Phải Lớn Hơn 0 Và Nhỏ Hơn 12");
                }
            } catch (NumberFormatException e) {
                System.out.println("Tháng Phát Hành Phải Phải Ở Dạng Số");
            }
        }
        while (this.releaseMonth <= 0|| this.releaseMonth>12);
    }

    @Override
    public String toString() {
        return "Tạp Chí{" +
                "Mã Tài Liệu =" + getId() + '\'' +
                ", Tên Tài Liệu ='" + getName() + '\'' +
                ", Nhà Phát Hành ='" + getPublisher() + '\'' +
                ", Số Phát Hành =" + getReleaseNumber() +
                "Số Phát Hành='" + releaseCode + '\'' +
                ", Tháng Phát Hành=" + releaseMonth + '\'' +
                '}';
    }
}