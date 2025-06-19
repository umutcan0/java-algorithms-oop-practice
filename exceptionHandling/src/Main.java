public class Main {

    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{10, 20, 30};
            System.out.println(sayilar[4]);

        } catch (StringIndexOutOfBoundsException exception) { // String hatası varsa çalışır. Örneğin Ankara kelimesi için
                                                              // 6 eleman vardır ve 9. indeks istenirse bu hatayı verir.
            System.out.println("Hata Oluştu: " + exception);
        } catch (ArrayIndexOutOfBoundsException exception) {  // Dizi indeksi dışına çıkılması hatasıdır. Örneğin 6 elemanlı
                                                              // bir dizide 9. indeks isteniyorsa bu hatayı verir.
            System.out.println("Hata Oluştu: " + exception);
        } catch (Exception exception) { // Yukarıdaki hatalardan farklı bir hata varsa bu hatayı verir.
            System.out.println("Loglandı: " + exception);//
        } finally {
            System.out.println("Ben her türlü çalışırım.");
        }
    }
}

// Try-Catch-Finally bloklarıyla çalışıldı. Try cath yapısı hata yönetimini gerçekleştirmek için
// kullanılır. Önce try bloğu çalışır. Hata yoksa catch bloğuna girilmez. Hata varsa catch bloğu çalışır.
// Parametre olarak görüldüğü üzere Exception alır. Bu durum try-catch oluşturmayınca consoleda verilen hatayla aynıdır.
// Finally bloğu ise try da çalışssa catchde çalışsa her türlü çalışır. Finally hata olsa da olmasa da çalıştırılması
// gereken kod olduğunda işe yarar
// Bu kod hatanın ne olduğunu ve o hataya göre yapılması gereken işlerin yapılmasını sağlar. Örneğin hesapta para yoksa
// kullanıcı para yükleme bölümüne yönlensin gibi(yani hataya göre yapılması gereken kodlar catch bloğuna yazılır) yönlendir gibi.