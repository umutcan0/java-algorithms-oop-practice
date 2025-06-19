public class Main {

    public static void main(String[] args) {
        Validator validator=new Validator(); // Validator kullanılmak istendi.
        Customer customer=new Customer(); // validator herhangi bir nesne istedi ve customer oluşturuldu.
        validator.validate(customer); // customer yollandı.

    }
}

// Interfaceler gruplandırıldı. Her class ait olduğu interfaceden implement edildi. Ayrıca generic kısıt oluşturuldu(IEntityRepositorydeki extend
// işlemi ile). Generic classın birde generic metod örneği yapılmış oldu.