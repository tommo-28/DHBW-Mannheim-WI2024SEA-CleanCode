package solid.isp.exercise;

public class Main {

    public static void main(String[] args) {
        MotorizedVehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        FlyingVehicle airplane = new Airplane();
        airplane.startEngine();
        airplane.fly();
//        airplane.sail();

        SailingVehicle boat = new Boat();
        boat.sail();

        CargoVehicle truck = new Truck();
        truck.loadCargo();
//        truck.fly();

        MotorizedVehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
    }

}
