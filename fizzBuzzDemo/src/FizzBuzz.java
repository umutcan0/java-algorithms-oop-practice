import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

//        System.out.print("Enter one number: ");
//        Scanner s=new Scanner(System.in);
//        int sayi=s.nextInt();
        for (int i=0;;i++) {
            System.out.print("Welcome FizzBuzz game. Enter one number: ");
            Scanner s = new Scanner(System.in);
            int sayi = s.nextInt();

            if (sayi % 3 == 0 && sayi % 5 != 0) {
                System.out.println("Fizz");
            } else if (sayi % 5 == 0 && sayi % 3 != 0) {
                System.out.println("Buzz");
            } else if (sayi % 3 == 0 && sayi % 5 == 0&& sayi!=0) {
                System.out.println("Fizz Buzz");
            } else if (sayi == 0) {
                System.out.print("Finished Game");
                break;
            } else
                System.out.println(sayi);
        }
    }
}

// 3'e bölünüğünde Fizz; 5'e bölündüğünde Buzz; hem 3'e hem 5'e bölündüğünde ise Fizz Buzz yazdıran bir program yazıldı.