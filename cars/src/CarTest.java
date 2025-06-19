class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car();

        System.out.println("When the car stands still.");
        car1.make = "Mercedes";
        car1.model = "C200";
        car1.year = "2019";
        car1.distance = 0;
        car1.speed = 0;
        System.out.println(car1.getInfo());
//
//		System.out.println("\nWhen the car moves.");
//		car1.accelerate(125);
//		car1.go(100);
//		car1.go(50);
//		System.out.println(car1.getInfo());
//
//		System.out.println();

        Car car2 = new Car();
        car2.make = "BMW";
        car2.model = "i8";
        car2.year = "2017";
        car2.distance = 10_000;
        car2.speed = 160;
        System.out.println(car2.getInfo());

        double timeToGo= car1.go(1000);
        System.out.println("Time to go 1000 km " + timeToGo);

        car2.accelerate(220);
        double timeToGo2 = car2.go(1000);
        System.out.println("Time to go 1000 km " + timeToGo2);
        System.out.println(car2.getInfo());

        System.out.println("*******************");
        System.out.println("car1 " + car1.getInfo());
        System.out.println("car2 " + car2.getInfo());
        Car tmp = car1;
        car1 = car2;
        car2 = tmp;
        System.out.println("*******************");
        System.out.println("car1 " + car1.getInfo());
        System.out.println("car2 " + car2.getInfo());
        System.out.println("*******************\n");

        System.out.println("*****************Farklı Arabalar***************\n");

        Car car3 = new Car();

        car3.make = "Mercedes";
        car3.model = "C200";
        car3.year = "2019";
        car3.distance = 0;
        car3.speed = 0;

        car3.accelerate(100);
        car3.go(1000);

        System.out.println(car3.getInfo());
        double timeToGo3 = car3.go(1000);;
        System.out.println("Time to go 1000 km " + timeToGo3);

        System.out.println("*************************************************");

        Car car4 = new Car();

        car4.make = "Mercedes";
        car4.model = "C200";
        car4.year = "2019";
        car4.distance = 0;
        car4.speed = 0;

        car4.accelerate(200);
        car4.go(1000);

        System.out.println(car4.getInfo());

        double timeToGo4 = car4.go(1000);;
        System.out.println("Time to go 1000 km " + timeToGo4);











//
////		car2 = null;
//
//		car2.accelerate(250);
//		if(car2 != null)
//			car2.accelerate(220);
//		else
//			System.out.println("Null");
//
//		System.out.println("*******************");
//
////		double time = 1000d/car2.speed;
////		System.out.println(time + " saat");
//
    }
}
