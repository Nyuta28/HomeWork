package HomeWork9.Encapsulation;

public class Cat {

    private String name;
    private int age;
    private int weight;
    private String voice;

    public Cat(String name, int age, int weight, String voice) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
        this.weight = weight;
        this.voice = voice;
    }


    public String getMeow() {
        if (this.weight > 3){
            return "Кот молчит. Он слишком толстий и ему тяжело.";
        }
        if (this.weight == 3) {
            return this.voice;
        }
        if (this.weight == 2){
            return this.voice + " " +this.voice;
        }
        if (this.weight <= 0){
            return "Кот Призрак. Он слишком легкий!";
        }

        return (this.voice + " " +this.voice+ " " +this.voice);
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getWeight() {
        return weight;
    }
}


