public class DortIslem {
    public static int topla(int sayi1, int sayi2) {
        int toplam = 0;
        toplam = sayi1 + sayi2;
        return toplam;

    }

    public static int fark(int sayi1, int sayi2) {
        int fark = 0;
        int enbuyuk = sayi1;
        if (enbuyuk < sayi2) {
            enbuyuk = sayi2;
            fark = enbuyuk - sayi1;
            return fark;
        } else {
            fark = enbuyuk - sayi2;
            return fark;
        }


    }

    public static int carp(int sayi1, int sayi2) {
        int carpim = 1;
        carpim = sayi1 * sayi2;
        return carpim;

    }

    public static double bol(double sayi1, double sayi2) {
        double bolum = 1;
        double enbuyuk = sayi1;
        if (enbuyuk < sayi2) {
            enbuyuk = sayi2;
            bolum = enbuyuk / sayi1;
            return bolum;
        } else {
            bolum = enbuyuk / sayi2;
            return bolum;
        }
    }
}
