public class Main {

    public static void main(String[] args) {
        // for döngüsü
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Sayılar for döngüsü ile sıralandı. Döngü bitti.\n");

        // Tek sayıları döndüren for döngüsü
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Tek sayıları sıralayan for döngüsü bitti.\n");

        // Çift sayıları döndüren for döngüsü
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Çift sayıları sıralayan for döngüsü bitti.\n\n");

        // while döngüsü
        int i = 0;
        while (i < 20) {
            System.out.println(i);
            i++;
        }
        System.out.println("Sayılar while döngüsü ile sıralandı. Döngü bitti.\n");

        // Tek sayıları sıralayan while döngüsü
        int j = 1;
        while (j < 20) {
            System.out.println(j);
            j += 2;
        }
        System.out.println("Tek sayıları sıralayan while döngüsü bitti.\n");

        // Çift sayıları sıralayan while döngüsü
        int k = 0;
        while (k < 20) {
            System.out.println(k);
            k += 2;
        }
        System.out.println("Çift sayıları sıralayan while döngüsü bitti.\n\n");

        int m = 100; //bir kez ekrana 100 yazdırır, sonrasında döngü sonlanır.
        do {
            System.out.println(m);
            m += 2;
        } while (m < 20);
        System.out.println("Sayılar do-while döngüsü ile sıralandı. Döngü bitti.");
    }
}

// For ve while döngüleriyle çalışıldı ve çeşitli döngüler oluşturuldu.
