public class Main {

    public static void main(String[] args) {
        ProductManager manager=new ProductManager();//static class örnek
        Product product=new Product();
        product.name="Mouse";
        product.price=10;
        manager.add(product);
        InnerClassExample.Crud.delete();//static olan inner class örneği

    }
}
// static class ve inner class örneği yapıldı. Static classlar sayesinde newleme yapmadan(nesne yaratmadan)
// class ismiyle çağırmış