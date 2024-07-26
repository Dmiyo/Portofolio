import java.util.Scanner;

public class Kota {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Nama kota: ");
            String kota = userInput.nextLine();

            for (int i = 0; i < kota.length();i++) {
                System.out.println(kota.substring(i));
            }
    }
}