public class Main {

    public static void main(String[] args) {

            Employee employee=new Employee();
            Customer customer=new Customer();

            CustomerManager customerManager=new CustomerManager();
            EmployeeManager employeeManager=new EmployeeManager();
    }
}

// Inheritance (miras alma) üzerinde duruldu. İki classta yer alan aynı ifadeler için yeni bir class oluşturulup
// oradan extend edildi(miras alındı). Birbirinin aynısı olmayan ifadeler ise ait olduğu classa yazıldı(extend edilmedi).