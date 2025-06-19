public class ProductValidator {
    static {
        System.out.println("Yapıcı blok oluşturuldu.");
    }

    public boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else
            return false;
    }

}
