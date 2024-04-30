public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /** flip() negates and swaps the x/y coordinates of the Point object. For example, if the object initially represents the point (5, -3), after a call to flip, the object should represent (3, -5). If the object initially represents the point (4, 17), after a call to flip, the object should represent (-17, -4). */
    public void flip() {
        
        double temp_x = this.x;
        this.x = -1 * this.y;
        this.y = -1 * temp_x;
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
    
}