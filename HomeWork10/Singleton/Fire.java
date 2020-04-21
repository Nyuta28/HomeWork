package HomeWork10;

public class Fire implements ElementOfNature {
    private static Fire instance;
    int temperature;

    private Fire(int temperature){
        this.temperature = temperature;

    }
    public static Fire getInstance(){
        if(instance==null)instance=new Fire(100);
        return instance;
    }

    public int getTemperature() {
        return temperature;
    }
}

