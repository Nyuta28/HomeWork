package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("RedCat", 100, 1, 5, 4);
        cat.eat();

        RedCat redCat = new RedCat(true,"Red",2,2,4,true, true, "Fluffy", "RedCat", 100, 1, 3, 6);
        redCat.eat();
        redCat.waitForOwner();
        redCat.climb();
        redCat.jump();
        redCat.bringHappiness();
    }

}
