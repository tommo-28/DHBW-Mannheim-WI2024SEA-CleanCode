package solid.isp.exercise;

public class Truck implements MotorizedVehicle, CargoVehicle {
    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped.");
    }

    @Override
    public void loadCargo() {
        System.out.println("Truck cargo loaded.");
    }
}
