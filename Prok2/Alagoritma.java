import java.util.Scanner;

public class Alagoritma {
        public static void main(String[] args) {
            String Pilih;
            int umur, Pemasukan, a, b;
            Scanner input = new Scanner(System.in);
            Scanner baca = new Scanner(System.in);

            System.out.print("Tuliskan umur anda?    ");
            umur = input.nextByte();
            if (umur >= 18) {
                System.out.println("A. Sudah bekerja");
                System.out.println("B. Belum bekerja");
                System.out.print("Silahkan Pilih   ");
                Pilih = input.next();

                switch (Pilih){
                    case "a":
                    System.out.print("Berapa pemasukan anda  ");
                    a = baca.nextInt();
                    System.out.print("Berapa tanggungan hidup anda ");
                    b = baca.nextInt();
                    Pemasukan = a/b;
                    if (Pemasukan < 300000){
                        System.out.println("Anda termasuk manusia yang bercukupan");
                    } else {
                        System.out.println("Anda termasuk manusia miskin");
                    }
                    break;
                    case "b":
                    System.out.println("Anda termasuk manusia miskin");
                }
            } else {
                System.out.println("A. Masih Belajar");
                System.out.println("B. Sudah tidak belajar");
                System.out.print("Silahkan Pilih    ");
                Pilih = input.next();

                switch (Pilih){
                    case "a":
                    System.out.print("Belajar yang bener ya dek!!");
                    break;
                    case "b":
                    System.out.println("Saran ku kamu sekolah deh");
                }
            }

        }
    
}
