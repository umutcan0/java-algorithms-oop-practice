public class Main {

    public static void main(String[] args) {
        //CustomerManager classında constructer oluşturulmazsa bu şekildede yapılabilir. Aynı işlemi gerçekleştirmenin farklı bir yoludur.
        /*CustomerManager customerManager=new CustomerManager();
        customerManager.customerDal=new MySqlCustomerDal();// Customer managerın customer dalı istenilen veritabanına göre newlenmiş olur.
        customerManager.add();*/

        CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}

// İnterface üzerinde örnek yapıldı. Farklı birde fazla interface classlarınn farklı classlar tarafından aynı anda implemente edilmesi sağlandı.
