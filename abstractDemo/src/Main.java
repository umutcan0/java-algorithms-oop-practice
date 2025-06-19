import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager();//abstract classlar newlenemezler.
        customerManager.databaseManager=new MySqlServer();// newlenemedikleri için bu şekilde oluşturulur.
        customerManager.getCustomers();


    }
}
// Abstract sınıflarla ilgili örnek yapıldı. Farklı database sınıfları oluşturulup anadatabaseden
// inherit edildi. Ayrıca CustomerManager sınıfından bu databaseleri çağırabilme işlemi yapıldı.