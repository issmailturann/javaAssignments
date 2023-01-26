package Chapter4Assign1;

public class CarTest {public static void main(String[] args) {


    //-Homework-//
    //-----//
    Car car1 = new Car();
    Car car2 = new Car();
    Car araba1 = new Car();

    System.out.println("Car 2 stands still.");
    car2.make = "Mercedes";
    car2.distance = 0;
    car2.model = "A180";
    car2.year = "2014";
    car2.speed = 0;
    String bilgiler = car2.getInfo();
    System.out.println(bilgiler);

    System.out.println("Araba 1 stands still.");
    araba1.make = "Dacia";
    araba1.distance = 0;
    araba1.model = "Duster";
    araba1.year = "2015";
    araba1.speed = 0;
    String bilgi = araba1.getInfo();
    System.out.println(bilgi);

    System.out.println("When the cars move.");
    car2.accelerate(100);
    araba1.accelerate(300);

    System.out.println("How long does it take to cover 1000 km?");
    double time1 = car2.go(1000);
    double time2 = araba1.go(1000);
    System.out.println("car2 time to go 1000 km " + time1 + " hour."
                        + "\naraba 1 time to go 1000 km " + time2 + "hour");


    //-----//

    System.out.println("When the car stands still.");
    car1.make = "Mercedes";
    car1.model = "C200";
    car1.year = "2019";
    car1.distance = 0;
    car1.speed = 0;
    String info = car1.getInfo();
    System.out.println(info);

    System.out.println("\nWhen the car moves.");
    car1.accelerate(125);
    car1.go(100);
    car1.go(50);
    System.out.println(car1.getInfo());
    car1.stop();
    System.out.println(car1.getInfo());

    System.out.println();

    /*
    Car car2 = new Car();
    car2.make = "BMW";
    car2.model = "i8";
    car2.year = "2017";
    car2.distance = 10_000;
    car2.speed = 160;
    System.out.println(car2.getInfo());

    car2.accelerate(220);
    double timeToGo = car2.go(1000);
    System.out.println("Time to go 1000 km " + timeToGo + " hour.");
    System.out.println(car2.getInfo());
    */
}
}
