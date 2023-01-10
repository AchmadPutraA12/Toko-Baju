package view;
import controller.DetailTransaksiController;

import java.util.Scanner;

public class MenuTransaksi {
    Scanner input = new Scanner(System.in);
    DetailTransaksiController dataTransaksiController = new DetailTransaksiController();

    public void menuData(){
        String pilih;
        do {
            System.out.println("""
                1. Display Baju
                2. Beli
                3. Struct Pembeli
                4. Keluar
                """);
            System.out.print("Masukkan Pilihan = ");
            pilih = input.nextLine();
            
            switch (pilih) {
                case "1" -> dataTransaksiController.displayTtoMenu();
                case "2" -> dataTransaksiController.inputToMenu();
                case "3" -> dataTransaksiController.displayDtoMenu();
                case "4" -> System.out.println();
                default -> System.err.println("inputan tidak ada");
            }
        }while (!pilih.equals("4"));
    }
}