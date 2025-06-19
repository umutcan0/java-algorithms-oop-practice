public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager kredi : krediManagers) {
            System.out.println(kredi.hesapla(1000));
        }

    }
}
