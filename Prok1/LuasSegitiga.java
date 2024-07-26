import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) throws Exception {
    Double luas;
    int a, t;
    
    Scanner baca = new Scanner(System.in);

    System.out.println("==Menghitung luas segitiga==");
    System.out.print("masukkan Alas : ");
    a = baca.nextInt();
    System.out.print("Masukkan Tinggi : ");
    t = baca.nextInt();

    luas = Double.valueOf((a * t) / 2);
    System.out.println(luas);
    }
}
