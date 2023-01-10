package model;
import entity.AdminEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminModel {
    static ArrayList<AdminEntity> arrayAdmin = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void dataAdmin(){
        arrayAdmin.add(new AdminEntity(90,"achmad", "kiki"));
        arrayAdmin.add(new AdminEntity(98,"putra",  "jojo"));
    }

    public static ArrayList<AdminEntity> all(){
        return arrayAdmin;
    }

    public static AdminEntity cari(int id,String password){
        for(AdminEntity objectAdmin : arrayAdmin){
            if(objectAdmin.getId()==id&&objectAdmin.getPassword().equals(password)){
                return objectAdmin;
            }
        }
        return null;
    }
}
