public class Main {

    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());
        krediUI.krediHesapla2(new OgrenciKrediManager());

    }
}

// Inheritance durumu için daha kapsamlı bir örnek oluşturuldu. Öncelikle attribute açısından benzer olan birden fazla class için tek bir
// class oluşturulup oradan extend edilme işlemi yapıldı(miras alındı). Daha sonra bir UI(User Interface: kullanıcı arayüzü)classı oluşturulup
// oradan benzer özellikte olan classlar tek tek çağırılabildi.