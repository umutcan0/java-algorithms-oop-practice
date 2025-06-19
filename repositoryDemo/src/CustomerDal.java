public class CustomerDal implements IEntityRepository<Customer>{ // Burada Customer yerine CustomerDal artık yazılamaz. Çünkü IEntityRepositoryde
                                                                 // IEntityi extend ederek generic kısıt oluşturuldu ve sadece Customer yazılabilmesi
                                                                 // sağlandı.
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}
