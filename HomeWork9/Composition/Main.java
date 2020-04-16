package HomeWork9.Encapsulation.Composition;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("forward");
        Wheel wheel2 = new Wheel("forward");
        SteeringWheel steeringWheel = new SteeringWheel("To right");
        Seat seat = new Seat("Old Style", "skin", 40);
        Engine engine = new Engine("1000 кубСм");
        MotorcycleBody motorcycleBody = new MotorcycleBody("Old Style", "plastic", 100);
        Headlight headlight = new Headlight("Neon Light", true);

        Motorcycle bmwMotorcycle = new Motorcycle("BMW", wheel, wheel2, steeringWheel, seat,
                engine, motorcycleBody, headlight);

        bmwMotorcycle.refreshSeat();
        bmwMotorcycle.getEngine().turnOn();
        bmwMotorcycle.getHeadlight().turnOn();
        bmwMotorcycle.getEngine().turnOff();
        bmwMotorcycle.dostavit();


    }
}
