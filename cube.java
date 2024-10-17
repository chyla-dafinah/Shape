package Shape;

public class cube extends rectangle{
    private int height;

    public cube() {
        height = 0;
    }

    public cube(String name, String color, int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print() {
        super.print();
        System.out.println("Height :"+height);
    }

}
