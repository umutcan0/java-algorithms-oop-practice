public class Deneme {

    public static void main(String[] args) {

        System.out.println("Aynı classtaki farklı metoddan çağırılma ile sayıları toplamı: " + sayilarToplam(4,5)); // Aynı classtaki farklı metoddan çağırılma işlemi yapıldı.

        Total total=new Total();
        System.out.println("Yazılan iki sayının toplamı: " + total.sayilar(2,3));

        Extraction extraction=new Extraction();
        System.out.println("Yazılan iki sayının çıkarması: " + extraction.sayilar(3,7));

        Multiplication multiplication=new Multiplication();
        System.out.println("Yazılan iki sayının çarpımı: " + multiplication.sayilar(3,0));

        Division division= new Division();
        System.out.println("Yazılan iki sayının bölümü: " + division.sayilar(10,2));  //Bu kısımlar ayrı ayrı classların metodları kullanılarak yapılmıştır.

        System.out.println(sayilarToplam(2,3));

        }
    public static int sayilarToplam(int sayi1,int sayi2){

        return sayi1+sayi2;
    }
}

// Bu çalışmada hem farklı classlarda metodlar oluşturup o metodları mainden çağırma hem de aynı class üzerinde farklı metod oluşturup mainden çağırma işlemleri yapıldı.