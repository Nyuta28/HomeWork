package HomeWork11;

public class Main {
    public static void main(String[] args) {
        HomeCat jusya = new HomeCat("HomeCat");
        jusya.eat();
        jusya.waitForOwner();
        jusya.bringHappiness();
        jusya.move(3);
        jusya.jump();
        System.out.println(jusya.getBreed());

    }
}
