public class Main {

    public static void main(String[] args) {
        int sayi = 0;
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }

        if (sayi < 1)
            System.out.println("Geçersiz sayı girdiniz. Lütfen pozitif bir sayı giriniz.");

        else if (toplam == sayi) {
            System.out.println(sayi + " sayısı mükemmel sayıdır.");
        } else
            System.out.println(sayi + " sayısı mükemmel sayı değildir.");

    }
}

// Yazılan sayının mükemmel sayı olup olmadığı kontrol edildi. Mükemmel sayı: Bir sayının kendisi hariç pozitif bölenlerinin
// toplamı kendisine eşitse o sayı mükemmel sayıdır.