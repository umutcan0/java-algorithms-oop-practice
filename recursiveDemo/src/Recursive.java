public class Recursive {
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else if (n < 0) {
            System.out.println("Please enter positive number.");
            return -1;
        } else
            return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("The 0th fibonacci number is: " + fib(0));
        System.out.println("The 7th fibonacci number is: " + fib(7));
        System.out.println("The 12th fibonacci number is: " + fib(12));
        System.out.println("The -1th fibonacci number is: " + fib(-1));
        /*int a=0;
        int b=1;
        int total=0;*/
        //System.out.print("Fibonacci dizisi: ");
       /* for(int i=0;i<30;i++){ // Not recursive
            total=a+b;
            a=b;
            b=total;
            System.out.print(total+" ");}*/
    }

}

// Recursive ve recursive olmayan Fibonacci örneği yapıldı.