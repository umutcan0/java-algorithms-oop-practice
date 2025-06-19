public class Operators {
    public static void main(String[] args) {
        int sayi1 = 15;
        int sayi2 = 22;
        int sayi3 = 4;
        float sayi4 = 2.2f;
        double sayi5 = 2.2;
        String name1 = "name1";
        String name2 = "name2";


        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
        sayi1 = sayi2;
        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
        System.out.println("***************************************");

        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
        sayi1 += sayi2;
        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
        System.out.println("***************************************");

        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
        ++sayi1;
        ++sayi2;
        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
        sayi1 = sayi2++;
        System.out.println("Sayı 1: " + sayi1 + " Sayı 2: " + sayi2);
        System.out.println("***************************************");

        if (getOne() ==2 & getTwo() ==2) {
            System.out.println("getOne is valid 2 and getTwo is valid 2");
        }
        if (getOne() == 1 | getTwo() == 2) {
            System.out.println("getOne is valid 1 or getTwo is valid 2");
        }
        System.out.println("***************************************");

        if (getOne() ==2 && getTwo() ==2) { // Kısayol kullanımı. Sol taraf yanlışsa sağ tarafa bakılmaz.
            System.out.println("getOne is valid 2 and getTwo is valid 2");
        }
        if (getOne() == 1 || getTwo() == 2) {   // Kısayol kullanımı. Sol taraf doğruysa sağ tarafa bakılmaz.
            System.out.println("getOne is valid 1 or getTwo is valid 2");
        }
    }

    public static int getOne() {
        System.out.println("In getOne()");
        return 1;
    }

    public static int getTwo() {
        System.out.println("In getTwo()");
        return 2;
    }
}

// Birleşik atamalar, arttırma eksiltme işlemcileri ve şartlı işlemcilerle çalışıldı.
