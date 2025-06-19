import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("ax^2+bx+c");
        System.out.print("Yukarıdaki formatta yer alan a değişkenini girin: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Yukarıdaki formatta yer alan b değişkenini girin: ");
        Scanner ss = new Scanner(System.in);
        int b = ss.nextInt();
        System.out.print("Yukarıdaki formatta yer alan c değişkenini girin: ");
        Scanner sss = new Scanner(System.in);
        int c = sss.nextInt();

        double x1, x2;
        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        //System.out.println("1. Kök: " + x1);
        System.out.println(new DecimalFormat("####.####").format(x1)); // Ondalık sayıyı '.' işaretinden sonra 4 basamak yazıdırlması şeklinde sınırlandırıldı.
        // 1. Kök: -0.2928932188134524

        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        // System.out.println((new DecimalFormat("####.####").format(x2)).replace(',', '.')); Ondalık sayıyı '.' işaretinden sonra istenilen şekle çevirmek için başka bir yöntem.
        //System.out.print(x2);
        System.out.println(new DecimalFormat("####.####").format(x2));
        // 2. Kök-1.7071067811865475
    }
}
