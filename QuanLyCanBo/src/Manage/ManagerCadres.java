package Manage;

import ImplementInterface.InterfaceCares;
import Model.Cadres;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCadres implements InterfaceCares {
    ArrayList<Cadres> listCadres = new ArrayList<>();
 String searchName;

    @Override
    public boolean isCadres(Integer idCheck) {
        for (int i = 0; i < listCadres.size(); i++) {
            if (listCadres.get(i).getId() == idCheck) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addCadres(Cadres cadres) {
        if (isCadres(cadres.getId())) {
            System.out.println("ID is exist");
        } else {
            listCadres.add(cadres);
        }
    }

    @Override
    public void showCadres() {
        if (listCadres.isEmpty()) {
            System.out.println("List is empty");
        }
        for (int i = 0; i < listCadres.size(); i++) {
            System.out.println(listCadres.get(i));
        }
    }

    @Override
    public void searchByCadres() {
        if (listCadres.isEmpty()) {
            System.out.println("List is empty");
        }
        for (int i = 0; i < listCadres.size(); i++) {
            if (listCadres.get(i).getName() == searchName) {
                System.out.println(listCadres.get(i));
            }else System.out.println("Can't find cadres");
        }
    }
}