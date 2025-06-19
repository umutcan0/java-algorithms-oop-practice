public class Main {

    public static void main(String[] args) {
        String[] futbolcular = new String[11];
        futbolcular[0] = "Volkan Demirel";
        futbolcular[1] = "Lugano";
        futbolcular[2] = "Bruno Alves";
        futbolcular[3] = "Gökhan Gönül";
        futbolcular[4] = "Caner Erkin";
        futbolcular[5] = "Gustavo";
        futbolcular[6] = "Alex";
        futbolcular[7] = "Stoch";
        futbolcular[8] = "Kuyt";
        futbolcular[9] = "Sow";
        futbolcular[10] = "Anelka";

        for (int i = 0; i < futbolcular.length; i++) {
            System.out.println(i + 1 + ". Futbolcu:" + " " + futbolcular[i]);
        }System.out.println("----------------------------------");
        for(String futbolcu:futbolcular){
            System.out.println(futbolcu);
        }

    }
}

// Dizilerle örnek yapıldı. İki farklı for döngüsü ile dizi oluşturuldu.
