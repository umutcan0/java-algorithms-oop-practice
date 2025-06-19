import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add("İstanbul");


        /*System.out.println(arrayList.size());
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
        arrayList.set(0,100);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList.size());*/

        for(Object i: arrayList){
            System.out.println(i);
        }


    }
}

// ArrayList ile ilgili örnek yapılıp komutlar yazıldı. ArrayListin dizilerden birçok farkı vardır. Örnedğin diziler oluşturulduktan
// sonra büyültülüp küçültülemezler. ArrayLisetlerde böyle bir kısıtlama yoktur. Dizilerde dizi tek tür olabilir yani int, string vs; ArrayLislerde
// ise her tip bulunabilir, bir kısıt yoktur.
