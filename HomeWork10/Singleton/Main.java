package HomeWork10;

public class Main {
    public static void main(String[] args) {
        Water w = Water.getInstance();
        System.out.println("Температура воды " + w.getTemperature());

        Water w2 = Water.getInstance();
        System.out.println("Температура воды " + w2.getTemperature());

        Fire f = Fire.getInstance();
        System.out.println("Температура огня " + f.getTemperature());

        Fire f2 = Fire.getInstance();
        System.out.println("Температура огня " + f2.getTemperature());

        Earth e = Earth.getInstance();
        System.out.println("Температура земли "+ e.getTemperature());

        Earth e2 = Earth.getInstance();
        System.out.println("Температура земли "+ e2.getTemperature());

        Air a = Air.getInstance();
        System.out.println("Температура воздуха " + a.getTemperature());

        Air a2 = Air.getInstance();
        System.out.println("Температура воздуха " + a2.getTemperature());
    }
}
