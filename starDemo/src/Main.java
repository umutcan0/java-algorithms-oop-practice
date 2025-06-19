import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("One word enter: ");
        Scanner s=new Scanner(System.in);
        String word=s.next();

        for (int i = 0;i < word.length(); i++){
            System.out.print(word.charAt(i)+"*");
        }
    }
}

// Kelimedeki harflerin arasına "*" koyularak yeni string oluşturuldu.