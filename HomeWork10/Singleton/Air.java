package HomeWork10;

public class Air implements ElementOfNature {

        private static Air instance;
        int temperature;
        private Air(int temperature){
            this.temperature = temperature;

        }
        public static Air getInstance(){
            if(instance==null)instance=new Air(15);
            return instance;
        }

        public int getTemperature() {
        return temperature;
        }
    }
