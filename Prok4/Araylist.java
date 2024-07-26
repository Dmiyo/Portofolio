import java.util.ArrayList;

public class Araylist {
    public static void main(String[] args) throws Exception {
        ArrayList mengisi = new ArrayList<Object>();
        mengisi.add( "Hai\n" );
        ArrayList isi = new ArrayList<Object>();
        isi.add( "!!!\n" );
        System.out.println("Masuk\n");
        
        for(int i = 0; i <= 5; i++){
            
            mengisi.add(i);
            for(Object angka : mengisi){
                 System.out.print(angka);
            }
            System.out.println();
        }
        for(int l = 6; l <= 10; l++){
            isi.add(l);
            
            for(Object angka : isi){
                 System.out.print(angka);
            }
            System.out.println();
        }
    }
}