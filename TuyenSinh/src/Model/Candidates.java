package Model;

import java.util.Scanner;

public class Candidates {
    private int id;
    private String name;
    private String address;
    private int priority;
    private int block;

    public Candidates() {
    }

    public Candidates(int id, String name, String address, int priority, int block) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.block = block;
    }

    public String getBlock() {
        switch (block) {
            case 1:
                return "Block A";
            case 2:
                return "Block B";
            case 3:
                return "Block C";
        }
        return "";
    }

    public void setBlock(int block) {
        this.block = block;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void inputCandidate() {
        System.out.println("Candidate's Name: ");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        do {
            try {
                System.out.println("Candidate's ID: ");
                this.id = Integer.parseInt(scanner.nextLine());
                if (this.id < 0) {
                    System.out.println("Input Must Be Bigger Than 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please Re-enter ID!");
            }
        } while (this.id < 0);
        System.out.println("Candidate's Address: ");
        Scanner scanner1 = new Scanner(System.in);
        this.address = scanner1.nextLine();
        System.out.println("Candidate's Priority: ");
        Scanner scanner2 = new Scanner(System.in);
        this.priority = scanner2.nextInt();
        System.out.println("Candidate's Block: ");
        Scanner scanner3 = new Scanner(System.in);
        this.block = scanner3.nextInt();
    }

    @Override
    public String toString() {
        return "Thí Sinh{" +
                "Số Báo Danh: " + id +
                ", Họ Tên: '" + name + '\'' +
                ", Địa Chỉ: '" + address + '\'' +
                ", Mức  Ưu Tiên: '" + priority + '\'' +
                ", Khối: '" + block + '\'' +
                '}';
    }
}