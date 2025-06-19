public class Main {

    public static void main(String[] args)  {

        AccountManager accountManager=new AccountManager();
        System.out.println(accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println(accountManager.getBalance());
        //accountManager.witdrow(90);
        try {
            accountManager.witdrow(90);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(accountManager.getBalance());
        //accountManager.witdrow(20);
        try {
            accountManager.witdrow(20);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(accountManager.getBalance());

    }
}

// Hatalı bir işlem varsa hata vermesi için throw kullanılır. Bu tabi // işaretleri koyduğumuz yerleri kaldırıp try-cathler
// silindiğindede aynı sonucu vermektedir.