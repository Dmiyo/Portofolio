import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) throws Exception {
        Double luas;
        int p, l;

        Scanner baca = new Scanner(System.in);

        System.out.println("==menghitung luas persegi panjang==");
        System.out.print("masukan Panjang : ");
        p = baca.nextInt();
        System.out.print("masukan Lebar : ");
        l = baca.nextInt();

        luas = Double.valueOf(p * l);
        System.out.print(luas);
    }
}
