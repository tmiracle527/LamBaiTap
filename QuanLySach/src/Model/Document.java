package Model;

import java.util.Scanner;

public class Document {
    public static int nextId = 1;
    private int id;
    private String name;
    private String publisher;
    private int releaseNumber;

    public Document() {
        this.id = nextId++;
    }

    public Document(String name, String publisher, int releaseNumber) {
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Document.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public void InputDocument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên Tài Liệu: ");
        this.name = scanner.nextLine();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Nhà Phát Hành: ");
        this.publisher= scanner1.nextLine();

        do {
            try {
                System.out.println("Số Bản Phát Hành: ");
                this.releaseNumber = Integer.parseInt(scanner.nextLine());
                if (this.releaseNumber <= 0) {
                    System.out.println("\n" + "Số Bản Phát Hành Phải Lớn Hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Số Bản Phát Hành Phải Ở Dạng Số");
            }
        }
        while (this.releaseNumber <= 0);
    }

    @Override
    public String toString() {
        return "Tài Liệu{" +
                "Mã Tài Liệu =" + id +
                ", Tên Tài Liệu ='" + name + '\'' +
                ", Nhà Phát Hành ='" + publisher + '\'' +
                ", Số Bản Phát Hành =" + releaseNumber +
                '}';
    }
}
