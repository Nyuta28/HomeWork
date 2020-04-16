package HomeWork9.Encapsulation.Composition;

public class Headlight {
    private String style;
    private boolean battery;


    public Headlight(String style, boolean battery) {
        this.style = style;
        this.battery = battery;
    }

    public void turnOn(){
        System.out.println("Headlight -> Turning on for the light");
    }
    public String getStyle(){
        return style;
    }
    public boolean isBattery(){
        return battery;
    }

}
