public class Main {

    public static void main(String[] args) {
        KronometreThread thread1=new KronometreThread("thread1"); // Threadi açma işlemi yapıldı. Ve threade isim verildi.
        KronometreThread thread2=new KronometreThread("thread2");
        KronometreThread thread3=new KronometreThread("thread3");

        thread1.start(); // Threadler çalıştırıldı.
        thread2.start();
        thread3.start();
    }
}

// Thread ile ilgili kronometre örneği yapıldı.
