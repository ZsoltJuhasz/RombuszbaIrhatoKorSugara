public class Rhombus {
    
    public double calcRadius(double side, double angle){
        double rad = angle * Math.PI/180;
        return  1.0/2.0 * side * Math.sin(rad);
    }
}
