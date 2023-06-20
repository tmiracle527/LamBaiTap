package Manager;

import Model.Candidates;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCandidate {
    Candidates candidates = new Candidates();
 static ArrayList<Candidates> listCandidates = new ArrayList<>();
 int idSearch;
    public ManageCandidate() {
    }

    public void showCandidates() {
        if (listCandidates.isEmpty())
            System.out.println("There's No Candidate Yet!");
        for (int i = 0; i < listCandidates.size(); i++) {
            System.out.println(listCandidates.get(i));
        }
    }

    public void findById() {
        Scanner scanner= new Scanner(System.in);
          idSearch= scanner.nextInt();
        if (listCandidates.isEmpty()) {
            System.out.println("List is empty");
        }
        Scanner scanner1= new Scanner(System.in);
        idSearch= scanner1.nextInt();
        for (int i = 0; i < listCandidates.size(); i++) {
            if (listCandidates.get(i).getId()==idSearch){
                System.out.println(listCandidates.get(i));
            }else System.out.println("Can't Find This ID");
        }
    }

    public static boolean isCandidates(Integer idCheck) {
        for (int i = 0; i < listCandidates.size(); i++) {
            if (listCandidates.get(i).getId() == idCheck) {
                return true;
            }
        }
        return false;
    }

    public static void addCandidate(Candidates candidates) {
        if (isCandidates(candidates.getId())) {
            System.out.println("That's Used ID!");
        } else {
            candidates.inputCandidate();
        }
    }
}

