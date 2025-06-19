public class Main {

    public static void main(String[] args) {
        IPayable payable=new Worker();
        payable.pay();

    }
}

// Farklı interface classlarından farklı classlara implement işlemi gerçekleştirildi. İmplement işleminde
// oluşturulan bir classın interface classlarından hangilerine gerek duyduğu saptanıp ona göre implement işlemi
// uygulandı.