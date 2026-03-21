package behavioral.prototype;

public class Rectangle extends Shape{

    private int width, height;

    public Rectangle() {}

    private Rectangle(Rectangle source){
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
