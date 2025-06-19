import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String,String> sozluk=new HashMap<String, String>();
        sozluk.put("Kitap","Book");
        sozluk.put("Masa","Table");
        sozluk.put("Mutfak","Kitchen");
        sozluk.put("Halı","Carpet");

        System.out.println(sozluk.get("Halı"));

        for(String item: sozluk.keySet() ){
            System.out.println("Anahtar: "+item+"   Değer: "+ sozluk.get(item));
        }

        System.out.println("----------------------------------");
        System.out.println("İlk indeksteki değer silinirse:\n");

        sozluk.remove("Masa");

        for(String item: sozluk.keySet() ){
            System.out.println("Anahtar: "+item+"   Değer: "+ sozluk.get(item));
        }
        sozluk.clear();

    }
}
