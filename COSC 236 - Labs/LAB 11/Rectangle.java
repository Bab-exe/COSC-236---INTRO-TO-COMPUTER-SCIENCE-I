import java.util.Arrays;

public class Rectangle{

    private final double x,y,width,height;

    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean contains(double x, double y){
        final double x_limit = this.x + this.width;
        final double y_limit = this.y + this.height;

        boolean x_check = this.x <= x && x <= x_limit;
        boolean y_check = this.y <= y && y <= y_limit;

        return (x_check && y_check);
    }

    public String toString(){
        
        

        return "Rectangle[" +
        "x=" + this.x + "," +
        "y=" + this.y + "," +
        "width=" + this.width + "," +
        "height=" + this.height;
    }
}