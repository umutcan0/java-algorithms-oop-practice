public class Main {

    public static void main(String[] args) {
        GameCalculator gameCalculator=new KidsGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

    }
}
