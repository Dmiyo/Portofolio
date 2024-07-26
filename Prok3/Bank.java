import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String LanjutTidak;
        int saldo = 50000;
        boolean perulangan = true;

        while (perulangan = true){
            System.out.println(" - Happy Teransaksi -");
            System.out.println("1. Setor saldo");
            System.out.println("2. Tarik saldo");
            System.out.println("3. Cek saldo");
            System.out.print("Input disini : ");

            String pilihan = userInput.next();

            switch (pilihan){
                case "1":
                    System.out.println(" - Minimal Setor Saldo sebesar Rp 50.000,00 -");
                    System.out.print("masukan jumlah uang yang ingin anda setor: ");
                    int setorUang = userInput.nextInt();
                    if (setorUang >= 50000){
                        saldo += setorUang;
                        System.out.println("Uang berhasil disetor sebanyak: " + setorUang);
                    } else {
                        System.out.println("Tidak bisa menyetorkan uang");
                        System.out.println("Jumlah uang yang anda masukkan di bawah Rp 50.000,00");
                        System.out.println("Tekan 1 untuk lanjut");
                        System.out.println("Tekan 2 untuk selesai");
                        int opsiProgram = userInput.nextInt();
                        if (opsiProgram == 1) {
                            perulangan = true;
                        }
                        else if (opsiProgram == 2) {
                            System.out.println("Transaksik dibatalkan T_T");
                            perulangan = false;
                            return;
                        }
                    }
                    
                    break;

                case "2":
                    System.out.print("masukan jumlah uang yang ingin anda tarik: ");
                    int tarikUang = userInput.nextInt();
                    if (tarikUang >= 50000 && saldo >= tarikUang){
                        saldo -= tarikUang;
                        System.out.println("uang berhasil ditarik sebanyak: " + tarikUang);
                    } else {
                        System.out.println("tidak bisa menarik uang");
                        System.out.println("jumlah uang yang anda tarik di bawah Rp 50.000,00");
                        System.out.println("atau jumlah saldo anda tidak mencukupi. Saldo anda: Rp " + saldo);
                    }
                    break;

                case "3":
                    System.out.println("Saldo yang anda miliki: " + saldo);
                    break;
                    
            }
        }
        System.out.println("program selesai");
    }
}
