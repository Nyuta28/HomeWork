package HomeWork10;

public class Earth implements ElementOfNature {
    private static Earth instance;
    int temperature;

    private Earth( int temperature){
        this.temperature = temperature;

    }
    public static Earth getInstance(){
        if(instance==null)instance=new Earth(30);
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }
}
