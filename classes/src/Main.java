public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager2=customerManager;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        customerManager2.Add();
        customerManager2.Remove();
        customerManager2.Update();


        int sayi1=20;
        int sayi2=15;
        sayi1=sayi2;
        sayi2=30;
        System.out.println(sayi1);


        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar1=sayilar2;
        sayilar2[0]=10;
        System.out.println(sayilar1[0]);
    }

}

// Classları birbirinden çağırmakla ilgili örnek yapıldı.