package HomeWork10;

public class Water implements ElementOfNature {
    private static Water instance;
    int temperature;

    private Water(int temperature){
        this.temperature = temperature;

    }
    public static Water getInstance(){
        if(instance==null)instance=new Water(20);
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }
}
