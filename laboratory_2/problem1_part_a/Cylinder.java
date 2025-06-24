package problem1_part_a;

public class Cylinder extends Shape3D{
	private double height;
    private double radius;

    Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    
    public double volume() {
        return height*Math.pow(radius, 2)*Math.PI;
    }

    public double surfaceArea() {
        return  2*Math.PI*radius*(radius+height);
    }

}
