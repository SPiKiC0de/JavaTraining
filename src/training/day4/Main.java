package training.day4;

public class Main {
    public static void main(String[] args){
        Vehicle skodaOctavia = new Vehicle(70,130);
        Car mazda6 = new Car(50,170);
        RaceMotorcycle kawazaki = new RaceMotorcycle(30,145);
        SportCar buggati = new SportCar(100,200);

        skodaOctavia.drive(50);
        mazda6.drive(20);
        kawazaki.drive(25);
        buggati.drive(100);
    }
}
