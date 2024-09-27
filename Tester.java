import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih 1. CD atau 2.DVD");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            System.out.println("Number: ");
            int number = input.nextInt();
            System.out.println("Nama: ");
            String name = input.nextLine();
            System.out.println("Quantity: ");
            int quantity = input.nextInt();
            System.out.println("Price: ");
            int price = input.nextInt();
            System.out.println("Artist: ");
            String artist = input.nextLine();
            System.out.println("Number of Song");
            int numSong = input.nextInt();
            System.out.println("Label: ");
            String label = input.nextLine();
            CD c= new CD();
            c.print();
            
        }else if (pilihan == 2) {
            System.out.println("Number: ");
           int number = input.nextInt();
           System.out.println("Nama: ");
           String name = input.nextLine();
           System.out.println("Quantity: ");
           int quantity = input.nextInt();
           System.out.println("Price: ");
           int price = input.nextInt();
           System.out.println("Length: ");
           int length = input.nextInt();
           System.out.println("Rating: ");
           int rating = input.nextInt();
           System.out.println("Studio: ");
           String studio =input.nextLine();
            DVD dvd1 = new DVD(number, name, price, quantity, length, rating, studio);
            dvd1.print(); 
        }else {
            System.out.println("Input Salah");
        }
    }
}
