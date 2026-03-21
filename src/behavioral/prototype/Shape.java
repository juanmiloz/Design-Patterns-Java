package behavioral.prototype;

public abstract class Shape {

    protected int x;
    protected int y;
    protected String color;

    protected Shape() {}

    protected Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();

}
