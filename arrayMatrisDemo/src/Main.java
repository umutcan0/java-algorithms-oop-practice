import java.util.Scanner;

class MatrixMultiplication
{
    public static void main(String args[])
    {
        int m, n, p, q, sum = 0, c, d, k;

        Scanner s = new Scanner(System.in);
        System.out.println("Birinci matrisin satır ve sütun sayılarını girin");
        m = s.nextInt();
        n = s.nextInt();

        int first[][] = new int[m][n];

        System.out.println("Birinci matrisin elemanlarını girin");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = s.nextInt();

        System.out.println("İkinci matrisin satır ve sütun sayılarını girin");
        p = s.nextInt();
        q = s.nextInt();

        if (n != p)
            System.out.println("Matrisler çarpılamaz.");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];

            System.out.println("İkinci matrisin elemanlarını girin");

            for (c = 0; c < p; c++)
                for (d = 0; d < q; d++)
                    second[c][d] = s.nextInt();

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++) {
                    for (k = 0; k < p; k++)
                        sum = sum + first[c][k]*second[k][d];

                    multiply[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("Matrislerin çarpımı:");

            for (c = 0; c < m; c++) {
                for (d = 0; d < q; d++)
                    System.out.print(multiply[c][d]+"\t");

                System.out.print("\n");
            }
        }
    }
}

// İstenilen boyuta ve değerlere sahip 2 matrisin çarpıldığı program yazılmıştır.