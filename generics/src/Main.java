public class Main {

    public static void main(String[] args) {
        MyList<Customer> sehiler=new MyList<Customer>();// Bu bir generic yapıdır. Yani farklı bir referans tipi verilmiştir(Customer). Bu referans tip
                                                        // farklı verilebilir(String, Integer vs.).
 /*       sehiler.add("Ankara");
        sehiler.add("İstanbul");
        sehiler.add("İzmir");*/
        Customer customer=new Customer();
        customer.id=1;
        customer.firstName="Umut";
        sehiler.add(new Customer());
        System.out.println(customer.id+" "+customer.firstName);

    }
}

// Generics yapıların nasıl çalıştığı ile ilgili örnek yapıldı.