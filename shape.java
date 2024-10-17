package Shape;

public class shape {
    private String name;
    private String color;

    public shape() {
        name = "";
        color = "";
    }

    public shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void print () {
        System.out.println("Name :"+name);
        System.out.println("Color :"+color);
    }
}
