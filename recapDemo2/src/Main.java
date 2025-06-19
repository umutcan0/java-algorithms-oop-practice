public class Main {

    public static void main(String[] args) {
        double[] myList = {1.3, 1.2, 4.3, 5.6};
        double total = 0;
        double multiplication = 1;
        double enKucuk=myList[0];
        double enBuyuk=myList[1];
        for (double number : myList) {
            total = total + number;
            multiplication = multiplication * number;
            System.out.println(number);
            if(number<myList[0]){
                myList[0]=number;
            }
            if(number>myList[1]){
                myList[1]=number;
            }
        }
        System.out.println("---------------------");
        System.out.println("Toplam: " + total);
        System.out.println("---------------------");
        System.out.println("Çarpım: " + multiplication);
        System.out.println("---------------------");
        System.out.println("En Küçük: "+myList[0]);
        System.out.println("---------------------");
        System.out.println("En Büyük: "+myList[1]);
    }
}

// For dögüsü ile dizi oluşturularak toplam, çarpım, en küçük sayı, en büyük sayı
// bulundu.
