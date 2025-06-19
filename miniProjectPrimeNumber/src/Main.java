public class Main {

    public static void main(String[] args) {
       /* int sayi =-1;
        if(sayi==1){
            System.out.println("Sayı asal değildir.");
        }
        else if(sayi<1){
            System.out.println("Sayı geçersizdir.");
        }
        else if(sayi==2||sayi==3){
            System.out.println("Sayı asaldır.");
        }
        else if (sayi / 2 == 0 || sayi / 3 == 0) {
            System.out.println(sayi + " Sayısı asal değildir.");
        } else {
            System.out.println(sayi + " Sayısı asal sayıdır.");
        }*/
        int sayi=23;
        boolean isPrime=true;
        if(sayi<1){
            System.out.println(sayi+" Sayısı Geçersizdir.");
            return;
        }
        if(sayi==1) {
            System.out.println(sayi+" Sayısı Asal Değildir.");
            return;
        }
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                isPrime=false;
            }
        }if(isPrime==true)
            System.out.println(sayi+" Sayısı Asaldır.");
        else
            System.out.println(sayi+" Sayısı Asal Değildir.");
    }
}
