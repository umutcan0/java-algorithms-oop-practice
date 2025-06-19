import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.print("One number enter: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int totalPrimeNumbers = 0;
        if (number < 2) {
            System.out.print(number + " Asal sayı değildir.");
        } else {
            for (int i = 2; i <= number - 1; i++) {
                if (i == 2 || i == 3 || i == 5) {
                    System.out.println(i + "Asal sayıdır.");
                    totalPrimeNumbers += 1;
                } else {
                    if (i % 2 != 0 && i % 3 != 0) {
                        System.out.println(i + "Asal Sayıdır.");
                        totalPrimeNumbers += 1;
                    }
                }
            }
            System.out.print("Toplam asal sayı: " + totalPrimeNumbers);
        }
    }
}

// Kullanıcının girdiği sayıya kadar kaç tane asal sayı olduğunu hesaplayan program yazılmıştır.