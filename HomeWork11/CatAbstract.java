package HomeWork11;

public abstract class CatAbstract {
    private String breed;
    private int body;
    private int weight;


    public abstract void waitForOwner();

    public abstract void eat();

    public abstract void move(int speed);

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
