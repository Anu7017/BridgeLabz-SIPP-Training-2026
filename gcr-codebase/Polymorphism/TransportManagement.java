package ScenarioBasedOOPs.Polymorphism;

class Vehicle {
    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String n) {
        super(n);
    }

    double fuelCost(int km) {
        return km * 5;
    }
}

class Bus extends Vehicle {
    Bus(String n) {
        super(n);
    }

    double fuelCost(int km) {
        return km * 10;
    }
}

class Bike extends Vehicle {
    Bike(String n) {
        super(n);
    }

    double fuelCost(int km) {
        return km * 2;
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String n) {
        super(n);
    }

    double fuelCost(int km) {
        return km * 1;
    }
}

public class TransportManagement {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car("Honda"), new Bus("Volvo"), new Bike("RE"), new ElectricCar("Tesla") };
        for (Vehicle v : vehicles) {
            System.out.println(v.vehicleName + " Cost=" + v.fuelCost(100));
        }
    }
}
