import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Hava çok sıcak.      ";
        System.out.println(mesaj);

        char[] karakterler = new char[5];
        mesaj.getChars(0, 4, karakterler, 0); // İstenilen indeksler arasındaki karakterleri gösterir.
        System.out.println(karakterler);
        System.out.println(mesaj.concat(" Nefes alınmıyor.")); // İki stringi birleştirir.
        System.out.println(mesaj.indexOf("a")); // Herhangi bir karakterin (kelime,harf vs) baştan kaçıncı indexte olduğunu gösterir.
        System.out.println(mesaj.lastIndexOf("ıc")); // Herhangi bir karakterin (kelime,harf vs) baştan kaçıncı indexte olduğunu gösterir.
                                                        // Ancak indexOfdan farkı parantez içindeki karakteri sondan arayıp bulur.
        System.out.println(mesaj.endsWith(".")); // Parantez içindeki harfle bitiyorsa true döner.
        System.out.println(mesaj.startsWith("H")); // Parantez içindeki harfle başlıyorsa true döner.
        System.out.println(mesaj.length()); // Stringin eleman sayısı bulundu.
        System.out.println(mesaj.replace("av","ou")); // Stringde yer alan herhangi bir karakter başka bir karaktere dönüştürüldü.
        System.out.println(mesaj.substring(2)); // Paratez içine yazılan indeksten başlayarak stringi yazdırır.
        System.out.println(mesaj.substring(0,3)); // Paratez içine yazılan indeksler arasındaki karakterleri yazdırır. Son indeksteki karakter alınmaz.
        System.out.println(mesaj.toLowerCase()); // Stringdeki tüm harfleri küçük yapar.
        System.out.println(mesaj.toUpperCase()); // Stringdeki tüm harfleri büyük yapar.
        System.out.println(mesaj.trim()); // Stringin başındaki ve sonundaki boşlukları siler.

    }
}

// Stringlerle çalışılıp belli fonksiyonlarla örnekler yapıldı.