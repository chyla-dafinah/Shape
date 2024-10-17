package Shape;

public class rectangle extends shape {
    private int length;
    private int width;

    public rectangle() {
        length = 0;
        width = 0;
    }

    public rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void print () {
        super.print();
        System.out.println("Length :"+length);
        System.out.println("Width :"+width);
    }
}
