package HomeWork8;

public class Cat {
    private String breed;
    private int silly;
    private int body;
    private int size;
    private int weight;

    public Cat(String breed, int silly, int body, int size, int weigh) {
        this.breed = breed;
        this.silly = silly;
        this.body = body;
        this.size = size;
        this.weight = weigh;
    }

    public void waitForOwner(){
        System.out.println("Cat wait for owner");
    }
    public void eat(){
        System.out.println("Cat.eat() called");
    }
    public void move(int speed){
        System.out.println("Cat.move() called. Moving with speed:"+ speed);

    }
}
