public class Main {

    public static void main(String[] args) {

        System.out.println("İçi dolu dikdörtgen");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nİçi boş dikdörtgen");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 | i == 9) {
                    System.out.print("*");
                } else {
                    if (j == 0 | j == 9) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\nİçi dolu dik üçgen");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (j < i*2+1) {
                    System.out.print("*");
                }
            }   System.out.println();

        }
                System.out.println("\nİçi dolu eşkenar üçgen");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (j < 9 / 2 - i | j > 9 / 2 + i) {
                            System.out.print(" ");
                        } else
                            System.out.print("*");
                    }
                    System.out.println();

                }

            }


        }





