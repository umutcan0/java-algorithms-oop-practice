public class AccountManager {

    private double balance;

    public void deposit(double amount) { // Para yatırma metodu. Amount ise yarıtılacak miktar yani parametre.
        balance = getBalance() + getBalance()+ amount;
    }
    public void witdrow(double amount) throws Exception { // Para çekme metodu. Amount yine burada çekilecek miktarı
                                                          // isteyen parametre. Throw olduğu için ya try-catch yapısı oluşturulmalı
                                                          // ya da throws Exception yazılmadılıdır ki bu programı kullanacak olan
                                                          // kişi bir hata oluşabileceğini bilsin ve try-catch yapısı oluştursun.
        if(balance>=amount) {
            balance = getBalance() - amount;
        }
        else{
//          System.out.println("Bakiye yetersiz.");
            throw new Exception("Bakiye yetersiz");
        }
    }


    public double getBalance() { // Bakiyeyi okuma metodu
        return balance;
    }
}

// Throw kullanılarak hata verdirme örneği yapıldı.
