package problem1_part_a;

public class Cube extends Shape3D{
	private double height;

    Cube(double height){
        this.height = height;
    }
    public double volume() {
        return Math.pow(height, 3);
    }

    public double surfaceArea() {
        return 6*Math.pow(height, 2);
    }

}
