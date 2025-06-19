public class KronometreThread implements Runnable{ // thread güdümlü olabilmesi için Runnable sınıfı implemente edilmeli

    private Thread thread;
    private String threadName; // threadlerin çalışabilmesi için birbirinden ayırt etmek gerekir. O yüzden herbir threade isim vermek gerekir.

    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("Oluşturuluyor: "+threadName);
    }
    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: "+threadName);


            try {
                for(int i=1;i<=10;i++) { // 1 den 10 kadar sayacak bi kronometre oluşturuldu
                    System.out.println(threadName + ":" + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException exception) { // Thread bozulursa hata verir.
                System.out.println("Kesildi: "+threadName);
            }
            System.out.println("Thread bitti: "+threadName);
        }


    public void start(){ // Thread oluşturmak için bu operasyon(fonsiyon) gerçekleştirilmelidir.
        System.out.println("Thread nesnesi oluşuyor");
        if(thread==null){
            thread=new Thread(this,threadName); // classı newleme işlemi yapıldı. Thread nesnesine konu olan class(this) ve threade isim ister(threadName).
                                                      //
            thread.start();
        }
    }
}
