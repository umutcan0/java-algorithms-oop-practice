import matematik.DortIslem;
import matematik.Logoritma;

import java.util.Scanner; // Kullanıcıdan bilgi almak için oluşturulmuş bir pakettir.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("İsim giriniz: ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);

        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(5,8));
        Logoritma logoritma=new Logoritma();
        System.out.println(logoritma.logoritmaHesapla());
    }
}
