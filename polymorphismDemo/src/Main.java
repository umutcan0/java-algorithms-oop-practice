
public class Main {

    public static void main(String[] args) {
       /* BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger(),new ConsoleLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log mesajı:");
        }*/

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
        CustomerManager customerManager2=new CustomerManager(new ConsoleLogger());
        customerManager.add();
        CustomerManager customerManager3=new CustomerManager(new EmailLogger());
        customerManager.add();
        CustomerManager customerManager4=new CustomerManager(new FileLogger());
        customerManager.add();
    }
}

//Polymorphisim örneği yapıldı. Farklı classlardan öncelikle inherit(miras alma) işlemi uygulandı. Daha sonra