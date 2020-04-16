package HomeWork9.Encapsulation.Composition;

public class Seat {
    private String style;
    private String material;
    private int size;

    public Seat(String style, String material, int size) {
        this.style = style;
        this.material = material;
        this.size = size;
    }

    public void refresh(){
        System.out.println("Seat --> refresh");
    }

    public String getStyle(){
        return style;
    }

    public String getMaterial(){
        return material;
    }

    public int getSize(){
        return size;
    }
}
