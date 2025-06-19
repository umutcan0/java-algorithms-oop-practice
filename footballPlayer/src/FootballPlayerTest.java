
class FootballPlayerTest {

    public static void main(String[] args) {
        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex De Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;


        alex.play(90);
        alex.score(2);

        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals); // number of goals 2
        System.out.println("Alex played totally " + alex.minutes + " minutes so far."); // minutes is 90


        alex.play(60);
        alex.score(1);

        System.out.println("Number of goals Alex scored: " + alex.numberOfGoals); // number of goals 2
        System.out.println("Alex played totally " + alex.minutes + " minutes so far."); // minutes is 90

        System.out.println("************************");

        FootballPlayer anelka = new FootballPlayer();
        anelka.no = 39;
        anelka.name = "Nicolas Anelka";
        anelka.minutes = 30;
        anelka.inPlay = true;
        anelka.numberOfGoals = 4;


        anelka.play(70);
        anelka.score(3);

        System.out.println("Number of goals Nicolas Anelka scored: " + anelka.numberOfGoals); // number of goals 2
        System.out.println("Nicolas Anelka played totally " + anelka.minutes + " minutes so far."); // minutes is 90



    }
}
