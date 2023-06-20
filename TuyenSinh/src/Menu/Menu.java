package Menu;

import Manager.ManageCandidate;
import Model.Candidates;

import java.util.Scanner;

public class Menu {
    ManageCandidate manageCandidate = new ManageCandidate();
    Scanner scanner = new Scanner(System.in);
    Candidates candidates;


    public Menu(ManageCandidate manageCandidate) {
    }

    public Menu() {
        candidates = new Candidates();
    }

    public void Run() {

        int choice = -1;
        do {
            System.out.println("======Main Menu======");
            System.out.println("1. Them hoc sinh");
            System.out.println("2. Hien thi tong tin hoc sinh");
            System.out.println("3. Tim theo SDB");
            System.out.println("0. Thoat");
            System.out.println("Nhap Lua Chon:");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 0 || choice > 3)
                System.out.println("Your Choice Must Be More Than 0 And Less Than 3!");
            switch (choice) {
                case 1:
                    manageCandidate.addCandidate(candidates);
                case 2:
                    manageCandidate.showCandidates();
                case 3:
                    manageCandidate.findById();
                case 4:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public void Menu1(){
        System.out.println("===Them hoc sinh===");
        System.out.println("chon khoi thi:");
        int block;
        do {
            System.out.println("1.Khoi A");
            System.out.println("2.Khoi B");
            System.out.println("3.Khoi C");
            block = Integer.parseInt(scanner.nextLine());
            if (block<1||block>3) System.out.println("vui long nhap lai");
        }while (block<1||block>3);
        System.out.println("Nhap so bao danh");
        String candidateNum = scanner.nextLine();
        System.out.println("Nhap ho va ten");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("Muc uu tien");
        int priorityLevel = Integer.parseInt(scanner.nextLine());
        Candidates candidates1 = new Candidates();
        ManageCandidate.addCandidates(candidates1);
    }
}
