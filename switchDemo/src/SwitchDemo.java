import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        SwitchDemo demo = new SwitchDemo();

        System.out.print("A month write please but capitalize the first letter: ");
       /* Scanner scanner = new Scanner(System.in);
        String month = scanner.next();*/
        Scanner s = new Scanner(System.in);
        Integer month = s.nextInt();

        demo.switchMonths(month);

    }

    public void switchMonths(String month) {
        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;

            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;

            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;

            case "September":
            case "October":
            case "November":
                System.out.println("Fall");
                break;

            default:
                System.out.println("Error! Please enter the month between January-February");
        }
    }
}
// Switch-case örneği yapıldı.