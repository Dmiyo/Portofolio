import java.util.HashMap;
public class Hashmap{
   public static void main(String[] args) throws Exception{
     HashMap<Integer, String> hari = new HashMap<Integer, String>();
     System.out.println("Satuan hari dalam seminggu");

     hari.put(1, "Minggu");
     hari.put(2, "Senin");
     hari.put(3, "Selasa");
     hari.put(4, "Rabu");
     hari.put(5, "Kamis");
     hari.put(6, "Jumat");
     hari.put(7, "Sabtu");

      System.out.println("hari :" +hari);
      System.out.println("Ada berapa hari dalam seminggu? " +hari.size());
      System.out.println("Hari apa yang paling disuka? " +hari.get(1));
      System.out.println("Hari apa yang ilang? " );
      hari.remove(2);
      System.out.println(hari);
      System.out.println("Ilank coiii");
      hari.clear();
      System.out.println(hari);
      hari.clone();
     }
   } 

