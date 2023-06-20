package Model;

import java.util.Scanner;

public class Book extends Document {
    private String author;
    private int pageNum;

    public Book(String name, String publisher, int releaseNumber, String author, int pageNum) {
        super(name, publisher, releaseNumber);
        this.author = author;
        this.pageNum = pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void inputBook() {
        Scanner scanner = new Scanner(System.in);
        super.InputDocument();
        System.out.println("Tên Tác Giả: ");
        this.author = scanner.nextLine();

        do {
            try {
                System.out.println("Số Trang: ");
                this.pageNum = Integer.parseInt(scanner.nextLine());
                if (this.pageNum <= 0) {
                    System.out.println("\n" + "Số Trang Phải Lớn Hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Số Liệu Phải Ở Dạng Số");
            }
        }while (this.pageNum<=0);
    }

    @Override
    public String toString() {
        return "Sách{" +
                "Mã Tài Liệu =" + getId() + '\'' +
                ", Tên Tài Liệu ='" + getName() + '\'' +
                ", Nhà Phát Hành ='" + getPublisher() + '\'' +
                ", Số Phát Hành =" + getReleaseNumber() +
                "Tác Giả ='" + author + '\'' +
                ", Số Trang =" + pageNum + '\'' +
                '}';
    }
}