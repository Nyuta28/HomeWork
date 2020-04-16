package HomeWork9.Encapsulation.Composition;

public class MotorcycleBody {

    private String style;
    private String material;
    private int size;

    public MotorcycleBody(String style, String material, int size) {
        this.style = style;
        this.material = material;
        this.size = size;
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
