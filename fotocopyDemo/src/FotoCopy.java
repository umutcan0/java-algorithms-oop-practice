import java.util.Scanner;

public class FotoCopy {

    public static void main(String[] args) {

        FotoCopy foto = new FotoCopy();
        Scanner s=new Scanner(System.in);
        System.out.print("How many paper copies will you get?: ");
        int sayi= s.nextInt();
//      foto.calculateCopyPrice(sayi);
        System.out.print(foto.calculateCopyPrice2(sayi) + " Kuruş");

    }

    public int calculateCopyPrice(int n) { // Recursive olmayan metot
        int totalKrs2 = 0;
        int totalKrs = 0;
        int totalTl = 0;
        if (n >= 25) {
            totalTl = n / 25;
            totalKrs = n % 25;
            if (totalKrs >= 12) {
                totalKrs2 = totalKrs % 12; // 1 kopya
                totalKrs /= 12; // 12 kopya
                totalKrs2 *= 5;
                totalKrs *= 50;
                if (totalKrs + totalKrs2 >= 100) {
                    totalTl += (totalKrs + totalKrs2) / 100;
                    totalKrs2 = (totalKrs + totalKrs2) % 100;
                    totalKrs2 *= 5;
                    System.out.print(totalTl + " Tl " + totalKrs2 + " Kuruş");
                } else{
                    totalKrs=totalKrs2+totalKrs;
                    System.out.print(totalTl + " Tl " + totalKrs + " Kuruş");
                }
            } else {
                totalKrs2=totalKrs;
                totalKrs2 *= 5;
                System.out.print(totalTl + " Tl " + totalKrs2 + " Kuruş");
            }

        } else if (n >= 12 && n < 25) {
            totalKrs2 = n % 12; // 1 kopya
            totalKrs = n / 12; // 12 kopya
            totalKrs2 *= 5;
            totalKrs *= 50;
            if (totalKrs + totalKrs2 >= 100) {
                totalTl += (totalKrs + totalKrs2) / 100;
                totalKrs2 = (totalKrs + totalKrs2) % 100;
                totalKrs2 *= 5;
                System.out.print(totalTl + " Tl " + totalKrs2 + " Kuruş");
            } else {
                totalKrs = totalKrs2 + totalKrs;
                System.out.print(totalKrs + " Kuruş");
            }
        } else {
            totalKrs2 = n * 5;
            System.out.println(totalKrs2 + " Kuruş");
        }
        int totalMoney = totalTl + totalKrs + totalKrs2;
        return totalMoney;
    }

    public double  calculateCopyPrice2(int n) { // Recursive olan metot
        double price = (((int) (n/25)) * 1.0) + ((int)((n%25)/12)*0.5) + ((int)((n%25)%12)*0.05);
        return price;
    }
}

// Recursive olan ve recursive olmayan şeklinde metotlar oluşturulmuştur. 1 kopya 5 kuruş, 12 kopya 50 kuruş ve 25 kopya 1 tl olduğu düşünülerek yazılmıştır.