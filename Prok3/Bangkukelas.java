import java.util.Scanner;

public class Bangkukelas {
    public static void main(String[] args) {
        String[][] siswa = new String[2][3];
        Scanner inputUser = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Siapa yang akan duduk di " + "(0,"+ i + "): ");
            siswa[0][i] = inputUser.next();
        }
        for(int i = 0; i < 3; i++){
            System.out.print("Siapa yang akan duduk di " + "(1,"+ i + "): ");
            siswa[1][i] = inputUser.next();
        }

        System.out.println("-------------------------");
        System.out.println("| " + siswa[0][0] + " |" + "          " + "| " + siswa[0][1] + " |" + "          " + "| " + siswa[0][2] + " |");
        System.out.println("| " + siswa[1][0] + " |" + "          " + "| " + siswa[1][1] + " |" + "          " + "| " + siswa[1][2] + " |");
        System.out.println("-------------------------");

    }
}