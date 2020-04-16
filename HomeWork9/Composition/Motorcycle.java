package HomeWork9.Encapsulation.Composition;

public class Motorcycle {
    private String name;
    private Wheel wheel;
    private Wheel wheel2;
    private SteeringWheel steeringWheel;
    private Seat seat;
    private Engine engine;
    private MotorcycleBody motorcycleBody;
    private Headlight headlight;

    public Motorcycle(String name, Wheel wheel, Wheel wheel2, SteeringWheel steeringWheel, Seat seat,
                      Engine engine, MotorcycleBody motorcycleBody, Headlight headlight) {
        this.name = name;
        this.wheel = wheel;
        this.wheel2 = wheel2;
        this.steeringWheel = steeringWheel;
        this.seat = seat;
        this.engine = engine;
        this.motorcycleBody = motorcycleBody;
        this.headlight = headlight;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Headlight getHeadlight() {
        return this.headlight;
    }

    public void refreshSeat(){
        System.out.println("Motorcycle ---> Refresh Seat");
        seat.refresh();
    }

    public void dostavit(){
        System.out.println("Motorcycle dostavlen. Vrum-Vrum.");
    }
}






