public class Main {

    public static void main(String[] args) {
        int toplam = topla(2, 5);
        System.out.println(toplam);
        String isimler = isimVer("Ayşe", "Fatma");
        System.out.println(isimler);
        int toplam2 = topla2(3, 5, 6, 7, 1, 2);
        System.out.println(toplam2);

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String isimVer(String isim1, String isim2) {
        return isim1 + " " + isim2;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}

//Metotlarlar (fonksiyonler) ile çalışıldı ve mainden çağırıldı. Değişken içeren fonksiyonların nasıl kullanıldığı ile örnekler yapıldı.
