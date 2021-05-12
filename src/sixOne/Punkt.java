package sixOne;

public class Punkt {
    private double x, y;
    private String mode = "cart";
    /*
    * in "cart" mode:
    * x: x-position
    * y: y-position
    *
    * in "polar" mode:
    * x: radius
    * y: theta
    */

    public Punkt(){
        this.x = 0;
        this.y = 0;
    }

    public Punkt(double a, double b){
        this.x = a;
        this.y = b;
    }

    // copy constructor
    public Punkt(Punkt p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public double abstand(){
        double dx, dy, d;
        dx = 0 - this.x;
        dy = 0 - this.y;
        d = Math.sqrt(dx * dx + dy * dy);
        return d;
    }

    public void cvtToPolar(){
        if(this.mode != "polar"){
            this.mode = "polar";
            double radius = Math.sqrt((this.x)*(this.x) + (this.y)*(this.y));
            double theta = Math.acos(this.x/radius);
            this.x = radius;
            this.y = theta;
        }
    }

    public void cvtToCart(){
        if(this.mode != "cart"){
            this.mode = "cart";
            double x = this.x * Math.cos(this.y);
            double y = this.x * Math.sin(this.y);
            this.x = x;
            this.y = y;
        }
    }

    public void printPoint(){
        System.out.println("( " + this.x + " | " +this.y + " )");
    }

    public void printPoint(boolean mode){
        if(mode) System.out.println("MODE: " + this.mode);
        this.printPoint();
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
