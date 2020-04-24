package HomeWork11;

public  class HomeCat extends CatAbstract implements IBringHappiness {

    private void stayNearTheDor(int time){}

    public void bringHappiness(){
        System.out.println("Bring to me HAPPINESS");
    }

    private void slurp() {
        System.out.println("RedCat.slurp() called");
    }

    public HomeCat(String b) {
        this.setBreed(b);
    }

    public void waitForOwner() {
        System.out.println("RedCat.waitForOwner() called");
        stayNearTheDor(10);
    }

    public void eat() {
            System.out.println("ReadCat.eat() called");
            slurp();

        }

    public void move(int speed) {
        System.out.println("RedCat.move called");

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
