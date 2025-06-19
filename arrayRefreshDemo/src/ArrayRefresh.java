import java.util.Scanner;

public class ArrayRefresh {

    public static void main(String[] args) {

        int m, p, q,c,d,b,a;

        Scanner s = new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını girin");
        m = s.nextInt();

        int first[] = new int[m];

        System.out.println("Dizinin elemanlarını girin");

        for (c = 0; c < m; c++) {

           first[c] = s.nextInt();
        }
        for (c = 0; c < m; c++) {
            d=c+1;
            System.out.println("Dizinin "+d+". elamanı: "+first[c]);

        }
        for(c=0;c<first.length;c++){
            b=first[c];
            for(b;{

            }
            System.out.print(first[c]+" ");
        }
        }
}