package view;
import controller.AdminController;
import java.util.Scanner;

public class MenuView {
    Scanner input = new Scanner(System.in);
    AdminController adminController = new AdminController();

    public void menu(){
        String pilih;
        do {
            System.out.println("""
                    1. Masuk
                    2. Keluar
                    """);
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextLine();
            
            switch (pilih) {
                case "1" -> adminController.loginToMenu();
                case "2" -> System.out.println("Keluar");
                default -> System.err.println("inputan tidak ada");
            }
        }while (!pilih.equals("2"));
    }
}