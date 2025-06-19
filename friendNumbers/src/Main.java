public class Main {

    public static void main(String[] args) {
        int number1=220 ;
        int number2=284 ;
        int total1=0;
        int total2=0;
        for(int i=1;i<number1;i++){
            if(number1%i==0){
                total1=total1+i;
            }
        } for(int i=1;i<number2;i++){
            if(number2%i==0){
                total2=total2+i;
            }
    }if(total1==number2&&total2==number1){
            System.out.println("Bu sayılar arkadaş sayılardır.");

        }
        else
            System.out.println("Bu sayılar arkadaş sayılar değildir.");
}
}

// Girilen iki sayının arkadaş sayım olup olmadığı kontrol edildi.
// Arkadaş sayılar: İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse arkadaş sayılardır.
