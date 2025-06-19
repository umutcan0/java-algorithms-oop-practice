import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.print("Enter the number you want to print in reverse: ");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();

        int lastNumber;
        System.out.print("Number reverse: ");
        for(int i=0;number>=10;i++){
            lastNumber=number%10;
            System.out.print(lastNumber);
            number/=10;
        }System.out.print(number);
    }
}

// Kullanıcının girdiği sayı tersten yazdırılmıştır.
