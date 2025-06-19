import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException { // Finally bloğunda dosya açıksa kapat dendi ancak kapatılacak bir dosya
                                                                // yoksa IOException ile kapatılacak dosya olmadığını hata vermek gerektiği
                                                                // için kullanılır. Yine aynı şekilde reader.readLineda herhangi bir dosya okuma
                                                                // hatası olabilir. Bunun içinde bu hatayı çıkarabilir ve try-catch kullanlmalıdır
                                                                // veya o programı kullanacak olan kişinin böyle bir hata çıkabileceğini
                                                                // ve try-catch oluşturması gerektiğini belirtmek için IOException kullanılmalıdır.
        BufferedReader reader = null; // BufferedReaderın try bloğunun içerisinde oluşturulmayıp mainde oluşturulmasının nedeni finally
                                      // bloğununda onu kullanması gerektiği içindir. Try bloğunun içerisinde yer alırsa onu kullanamaz.
        int total=0;

        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt")); // Dosyanın adresi
            String line=null; // Dosyalarda okuma işlemleri satır satır olur. Ayrıca dosyada hiç kayıt olmayabilir bu yüzden en başta
                              // null verildi.
            while((line= reader.readLine())!=null){ // Satırları oku ve line değişkenine ata. Okuma işlemi null değilse döngüye gir.
                total+=Integer.valueOf(line); // Her bir satırdaki değeri toplayacağı ve her bir satırdaki değer string olduğu için
                                              // String değerler Integera çevrilir. Bunun içinde Integer.valueOf(line) kullanılmıştır.
            }
            System.out.println(total);
        } catch (FileNotFoundException e) { // Dosya bulunmazsa verilen hatadır.
            e.printStackTrace();
        } finally { // Reader açık olduğu için herhangi bir hata durumunda kapatması gerekiyor. Bunun içinde finally kodu yazılmalıdır.
            reader.close();

        }


    }
}


