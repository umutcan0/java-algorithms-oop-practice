import java.util.Scanner;

public class MonteCarlo {

    public static void main(String[] args) {

        System.out.print("Nokta saısını girin: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int numberInCircle=0;
        long start=System.currentTimeMillis();

        for(int i=0;i<n;i++){
            double x=Math.random();
            double y=Math.random();
            double distance=x*x+y*y;
            if(distance<=1)
                numberInCircle++;
        }
        long end=System.currentTimeMillis();
        long time=end-start;

        double myPI=4.0*numberInCircle/n;
        System.out.println("My pi: "+myPI);
        System.out.println(("java's pi: "+Math.PI));
        System.out.println(("time: "+time+" ms."));
    }
}

// Monte Carlo yöntemi ile pi sayısını hesaplayan program yazıldı.
