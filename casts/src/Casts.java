public class Casts {

    public static void main(String[] args) {
        char name ='a';
        byte sayi0 = 12;
        int sayi1 = 15;
        float sayi2 = 1.12f;
        double sayi3 = 2.12;

        System.out.println("sayi1: " + sayi1 + " sayi2: " + sayi2);
        sayi2 = sayi1;
        System.out.println("sayi1: " + sayi1 + " sayi2: " + sayi2);

        System.out.println("************************************");
        System.out.println("sayi0: " + sayi0 + " sayi1: " + sayi1);
        sayi0 = (byte) sayi1;
        System.out.println("sayi0: " + sayi0 + " sayi1: " + sayi1);

        System.out.println("************************************");
        System.out.println("sayi1: " + sayi1 + " sayi2: " + sayi2);
        sayi1 = (int) sayi2;
        System.out.println("sayi1: " + sayi1 + " sayi2: " + sayi2);

        System.out.println("************************************");
        System.out.println("sayi1: " + sayi1 + " name: " + name);
        sayi1=name;
        System.out.println("sayi1: " + sayi1 + " name: " + name);
    }
}


// Farklı ilkel tiplerde daraltan ve genişleten çevrimler yapıldı.