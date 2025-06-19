public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Telefon","Xiaomi Telefon",3500,20,"Yeşil");
        /*product.setId(1);
        product.setName("Telefon");
        product.setDescription("Xiaomi Telefon");
        product.setPrice(3500);
        product.setStockAmount(20);
        product.setRenk("Yeşil");*/
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
        System.out.println(product.getKod());
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Ürünün rengi: "+ product.getRenk());
    }
}
// Attribute (field) ile çalışıldı ve farklı classlar oluşturuldu.(Her class tek işi yapmalıdır düşüncesiyle
// hareket edildi. Constructer yapısı ile ilgili örnek yapıldı.
