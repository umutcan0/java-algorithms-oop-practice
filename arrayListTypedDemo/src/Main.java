import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(2);
        sayilar.add(16);
        sayilar.add(260);
        sayilar.add(20);

        sayilar.remove(1);
        //Collections.sort(sayilar);//Listeyi sıralar
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}


// ArrayListlerde tek tiple çalışma örneği yapıldı. ArrayListin sadece String değerler alması sağlandı.
