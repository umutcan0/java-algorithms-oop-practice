public class Main {

    public static void main(String[] args) {
        char harf = 'z';
        switch (harf) {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':

                System.out.println("Kalın sesli ünlüdür.");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ö':
            case 'ö':
            case 'Ü':
            case 'ü':

                System.out.println("İnce sesli ünlüdür.");
                break;
            default:
                System.out.println("Lütfen ünlü harf giriniz.");
        }
    }
}

// Yazılan harfe göre kalın ünlü, ince ünlü veya yanlış harf yazımı şeklinde kontrol işlemi yapıldı.
