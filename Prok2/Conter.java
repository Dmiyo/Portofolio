import java.util.Scanner;

public class Conter {
       public static void main(String[] args) {
        String Samsung,Oppo,Xiomi;
        Scanner input = new Scanner(System.in);
        boolean perulangan = true;

        while(perulangan == true){
            System.out.println("-------------");
            System.out.println("List Hp");
            System.out.println("1. Samsung");
            System.out.println("2. Oppo");
            System.out.println("3. Xiomi");
            System.out.println("-------------");
            System.out.print("Pilih :");
            String Pilihan = input.nextLine();
            String pilih = null;
            String LanjutTidak;

        switch (Pilihan) {
            case "1" :
            System.out.println("1. Murah");
            System.out.println("2. Mahal");
            System.out.print("Pilih :");
            pilih = input.nextLine();

            switch (pilih){
                case "1":
                System.out.println("Galaxy A24 harga 3.500.000");
                System.out.print("Lanjut atau Tidak?  ");
                LanjutTidak = input.nextLine();
                
                switch (LanjutTidak){
                    case "lanjut":
                    System.out.println("Mungkin anda ingin melihat hp lain");

                    break;
                    case "tidak":
                    System.out.println("Terima kasih dah meliah hp ini");
                    perulangan = false;
                    
                }
                
                break;
                case "2":
                System.out.println("Galaxy A54 harga 6.500.000");
                System.out.print("Lanjut atau Tidak?  ");
                LanjutTidak = input.nextLine();
                
                switch (LanjutTidak){
                    case "lanjut":
                    System.out.println("Mungkin anda ingin melihat hp lain");

                    break;
                    case "tidak":
                    System.out.println("Terima kasih dah meliah hp ini");
                    perulangan = false;
                    
                }

            }
            break;

            case "2" :
            System.out.println("1. Murah");
            System.out.println("2. Mahal");
            System.out.print("Pilih :");
            pilih = input.nextLine();

            switch (pilih){
                case "1":
                System.out.println("A55 harga 1.800.000");
                System.out.print("Lanjut atau Tidak?  ");
                LanjutTidak = input.nextLine();
                
                switch (LanjutTidak){
                    case "lanjut":
                    System.out.println("Mungkin anda ingin melihat hp lain");

                    break;
                    case "tidak":
                    System.out.println("Terima kasih dah meliah hp ini");
                    perulangan = false;
                    
                }

                break;
                case "2":
                System.out.println("A57 harga 2.300.000");
                System.out.print("Lanjut atau Tidak?  ");
                LanjutTidak = input.nextLine();
                
                switch (LanjutTidak){
                    case "lanjut":
                    System.out.println("Mungkin anda ingin melihat hp lain");

                    break;
                    case "tidak":
                    System.out.println("Terima kasih dah meliah hp ini");
                    perulangan = false;
                    
                }

            }
            break;

            case "3" :
            System.out.println("1. Murah");
            System.out.println("2. Mahal");
            System.out.print("Pilih :");
            pilih = input.nextLine();

            switch (pilih){
                case "1":
                System.out.println("Redmi Note 12 harga 2.200.000");
                System.out.print("Lanjut atau Tidak?  ");
                LanjutTidak = input.nextLine();
                
                switch (LanjutTidak){
                    case "lanjut":
                    System.out.println("Mungkin anda ingin melihat hp lain");

                    break;
                    case "tidak":
                    System.out.println("Terima kasih dah meliah hp ini");
                    perulangan = false;
                    
                }

                break;
                case "2":
                System.out.println("Redmi Note 12 pro harga 4.400.000");
                System.out.print("Lanjut atau Tidak?  ");
                LanjutTidak = input.nextLine();
                
                switch (LanjutTidak){
                    case "lanjut":
                    System.out.println("Mungkin anda ingin melihat hp lain");

                    break;
                    case "tidak":
                    System.out.println("Terima kasih dah meliah hp ini");
                    perulangan = false;
                    
                }
                
            }
            
        }
    }
    }
}
 
        
