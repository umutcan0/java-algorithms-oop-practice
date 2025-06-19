import java.util.Scanner;

public class Main {


    /* 0 or > 120 : Çık
    • 0-3 : Bebek
    • 4-12 : Çocuk
    • 13-19 : Ergen
    • 20-30 : Genç
    • 31-59 : Orta Yaş
    • 60-120 : Yaşlı*/

    public static int baby = 0;
    public static int child = 0;
    public static int adolescent = 0;
    public static int youth = 0;
    public static int middleAged = 0;
    public static int old = 0;

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Programı bitirmek ve tüm yaş aralıklarını görmek için 0 tuşuna basınız.");
            Scanner s = new Scanner(System.in);
            System.out.print("Aile ferdinin yaşını giriniz: ");
            int age = s.nextInt();

            if (age == 0) {
                System.out.println("Ailenizde toplam: " + baby + " Bebek " + child + " Çocuk " + adolescent + " Ergen " + youth + " Genç " + middleAged + " Orta Yaşlı " + old + " Yaşlı vardır.");
                break;
            }
            if (age > 0 && age <= 3) {
                // System.out.println("Bebek");
                baby += 1;
            } else if (age >= 4 && age <= 12) {
                //System.out.println("Çocuk");
                child += 1;
            } else if (age >= 13 && age <= 19) {
                //System.out.println("Ergen");
                adolescent += 1;
            } else if (age >= 20 && age <= 30) {
                //System.out.println("Genç");
                youth += 1;
            } else if (age >= 31 && age <= 59) {
                //System.out.println("Orta Yaş");
                middleAged += 1;
            } else if (age >= 60 && age <= 120) {
                //System.out.println("Yaşlı");
                old += 1;
            } else {
                System.out.println("Lütfen 0-120 arasında bir değer giriniz.");
            }

        }
    }
}

// Aile fertlerinin yaşları kullanıcıdan istenerek yaş aralıklarına göre kategorilendirme işlemi yapıldı.