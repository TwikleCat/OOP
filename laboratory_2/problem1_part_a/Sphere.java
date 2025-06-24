package problem1_part_a;

public class Sphere extends Shape3D{
	private double radius;

    Sphere(double radius){
        this.radius = radius;
    }
  
    public double volume() {
        return (4/3)*Math.PI*Math.pow(radius,3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

}
