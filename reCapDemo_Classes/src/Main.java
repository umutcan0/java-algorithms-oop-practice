public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc =dortIslem.topla(5, 6);
        System.out.println(sonuc);
        System.out.println(dortIslem.fark(8, 3));
        System.out.println(dortIslem.carp(2, 4));
        System.out.println(dortIslem.bol(3, 2));
    }

}

// Dört işlem örneği yapıldı. Dört işlem örneğinin işlem kısmı için ayrı bir class oluşturuldu. Daha sonra mainden
// bu classın gerekli fonksiyonu çağrılarak istenilen iki sayı için dört işlem gerçekleştirilmiş oldu.