public class Main {

    public static void main(String[] args) {
        int sayi1 = 7;
        int sayi2 = 15;
        int sayi3 = 14;
        int enKucuk=sayi1;
        int enBuyuk=sayi3;

        if(enKucuk<sayi2){
            enKucuk=enKucuk;
        }else{
            enKucuk=sayi2;
        }

        if(enKucuk<sayi3){
            enKucuk=enKucuk;
        }else{
            enKucuk=sayi3;
        }

        System.out.println("En küçük sayı:"+enKucuk);

// If blokları ile çeşitli kontroller yapılarak 3 sayıdan en küçüğü bulundu.

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi1){
            enBuyuk=sayi1;
        }

        System.out.println("En büyük sayı:"+enBuyuk);

// If blokları ile çeşitli kontroller yapılarak 3 sayıdan en büyüğü bulundu.

    }
}
