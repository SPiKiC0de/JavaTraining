package training.day4;

public class Vehicle {

    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    double fuelConsuption;
    double fuel;
    int horsePower;

    public final double getDefaultFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;

    }
    public double getFuelConsuption() {
        return  fuelConsuption;

    }
    public void setFuelConsuption(double fuelc) {
        if (fuelc < 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.fuelConsuption = fuelc;

    }
    public double getFuel() {
        return fuel;

    }
    public void setFuel(double fuel) {
        if (fuel < 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.fuel = fuel;

    }
    public int getHorsePower() {
        return horsePower;

    }
    public void setHorsePower(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.horsePower = hp;

    }
    public Vehicle(double fuel, int hp) {
        setFuel(fuel);
        setHorsePower(hp);
        fuelConsuption = DEFAULT_FUEL_CONSUMPTION;

    }
    public void drive(double km) {
        fuelConsuption = DEFAULT_FUEL_CONSUMPTION;
        if (fuel <= 0) {
            throw new IllegalArgumentException("You ran out of fuel");
        }else {
            fuel += fuelConsuption + km;
            System.out.println("Fuel:"+fuel);
        }

    }
}
