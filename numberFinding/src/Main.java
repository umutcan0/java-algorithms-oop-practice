public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 2;

       /* for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                System.out.println("Sayı mevcuttur. Aranan sayı dizide " + i + ". indekstedir.");
                return;
            }

        }
        System.out.println("Aranan sayı dizide yer almamaktadır.");*/

        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak)
                varMi = true;

        }
        if (varMi)
            mesajVer("Sayı mevcuttur:"+ aranacak);
        else
            mesajVer("Sayı mevcut değildir:"+ aranacak);
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);

    }
}

// Metodlarla çalışıldı ve iki farklı şekilde aranan sayının dizide var mı yok mu diye bakılıp dizide varsa kaçıncı indekste olduğu yazdırıldı.
