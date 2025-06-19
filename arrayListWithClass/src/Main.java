import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers=new ArrayList<Customer>();
        customers.add(new Customer(1,"Rıza","Seri"));
        customers.add(new Customer(2,"Erman","Seri"));
        customers.add(new Customer(3,"Ramiz","Seri"));



        for (Customer customer:customers){
            System.out.println(customer.id);
            System.out.println(customer.firstName);
            System.out.println(customer.lastName+"\n--------------------");
        }
        System.out.println("İlk eleman silinirse:\n");
        customers.remove(0);

        for (Customer customer:customers){
            System.out.println(customer.id);
            System.out.println(customer.firstName);
            System.out.println(customer.lastName+"\n--------------------");
        }
    }
}

// ArrayListlerde kullanılacak değerleri baka bir classtan çekme örneği yapıldı. Kullanılması gereken
// ArrayList adının, değerlerin çekildiği class ismiyle aynısı olduğu görüldü.