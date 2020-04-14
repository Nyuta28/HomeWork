package HomeWork8;

public class RedCat extends Cat{
    private String name;
    private boolean coat;
    private String color;
    private int eyes;
    private int ears;
    private int paws;
    private boolean tail;
    private boolean mustache;


    public RedCat(boolean coat, String color, int eyes, int ears, int paws, boolean tail,
                  boolean mustache, String name, String breed, int silly, int body, int size, int weigh) {
        super(breed, silly, body, size, weigh);
        this.coat = coat;
        this.color = color;
        this.eyes = eyes;
        this.ears = ears;
        this.paws = paws;
        this.tail = tail;
        this.mustache = mustache;
        this.name = name;
    }
    public void bringHappiness(){
        System.out.println("Bring to me HAPPINESS");
    }

    private void slurp() {
        System.out.println("RedCat.slurp() called");
    }

    private void stayNearTheDor(int time){
        System.out.println();
    }

    @Override
    public void waitForOwner(){
        System.out.println("RedCat.waitForOwner() called");
        stayNearTheDor(10);
        super.waitForOwner();
    }

    @Override
    public void eat() {
        System.out.println("ReadCat.eat() called");
        slurp();
        super.eat();
    }

    private void moveLegs(int speed){
        System.out.println("RedCat.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("RedCat.move called");
        moveLegs(speed);
        super.move(speed);
    }

    public void climb(){
        System.out.println("RedCat.climb() called");
        move(2);
    }

    public void jump(){
        System.out.println("RedCat.jump() called");
        move(5);
    }


}
