package HomeWork9.Encapsulation.Composition;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void turnOn(){
        System.out.println("Engine ---> Turn On");
    }

    public void turnOff(){
        System.out.println("Engine ---> Turn Off");
    }

    public String getType(){
        return type;
    }
}
