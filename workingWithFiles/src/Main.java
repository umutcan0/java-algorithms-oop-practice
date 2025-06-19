import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\javademos\\files\\students.txt"); // Dosya adresi ve students.txt şeklinde dosya ismi.
        try { // try-catch içine almak gerekiyor çünkü herhangi bir hata durumu olabilir.(adres yolunun farklı olması gibi)
            if (file.createNewFile()) // Yeni dosya yukarıdaki adrese yukarıdaki ismiyle oluşturuldu.
                System.out.println("Dosya oluşturuldu.");
            else
                System.out.println("Dosya zaten mevcut");
            ;
        } catch (IOException e) { // Hata varsa çalışır.
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {

        File file = new File("C:\\javademos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya ismi: " + file.getName());
            System.out.println("Dosya adresi: " + file.getAbsolutePath());
            System.out.println("Dosya okunabilir mi: " + file.canRead());
            System.out.println("Dosya yazılabilir mi: " + file.canWrite());
            System.out.println("Dosya boyutu(byte): " + file.length());

        }

    }
    public static void readFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader= new Scanner(file); // File nesnesinde okuma yapabilmek için Scanner sınıfından yararlanılır.
            while(reader.hasNextLine()){ // Sıradaki satır varsa döngüye gir.
                String line=reader.nextLine(); // Sıradaki satırları line değişkenine ata.
                System.out.println(line); // Değişkeni yazdır.

            }reader.close(); // Okuma işlemi bittiğinde dosyayı kapat.
        } catch (FileNotFoundException e) { // Bir hata varsa çalışır.
            e.printStackTrace(); // Hata mesajı.
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true)); // Daha efektif kullanabilmek için BufferredWriter
                                                                                                                                // içine yazıldı. Parantez içindeki true parametresi
                                                                                                                                // dosyaya yazabilmek için kullanıldı. Aksi taktirde
                                                                                                                                // dosya içine kalıcı bir biçimde istenilen ifadeler
                                                                                                                                // yazdırılamaz.
            writer.newLine(); // Yeni satır oluşturuldu.
            writer.write("Umut"); // Oluşturulan yeni satıra yazdırıldı.
            System.out.println("Dosyaya yazıldı.");
            writer.newLine();
            writer.write("Can");
            System.out.println("Dosyaya yazıldı.");
            writer.newLine();
            writer.write("BAL");
            System.out.println("Dosyaya yazıldı.");
            writer.close(); // Yazdırma işlemi bittikten sonra dosya kapatıldı.
        } catch (IOException e) { // Bir hata varsa vermesi için yazıldı.

        }
    }
}

// Dosya oluşturma, dosyayla ilgili bilgi alma, dosya okuma ve dosyaya yazdırma işlemleri yapıldı.