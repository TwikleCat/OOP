package lab1;
import java.util.*;

public class Temperature {
	private double value;
    private char scale;

    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }


    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }


    public Temperature(char scale) {
        this.value = 0.0;
        this.scale = Character.toUpperCase(scale);
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = Character.toUpperCase(scale);
    }

    public double getCelsius() {
        if (scale == 'C') return value;
        else return 5.0 * (value - 32) / 9;
    }

    public double getFahrenheit() {
        if (scale == 'F') return value;
        else return (9.0 * value / 5) + 32;
    }

    
    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = Character.toUpperCase(scale);
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = Character.toUpperCase(scale);
    }

   
    public char getScale() {
        return scale;
    }

    public void displayTemperature() {
        System.out.println("\nStored Temperature: " + value + " " + scale);
        System.out.printf("In Celsius: %.2f C\n", getCelsius());
        System.out.printf("In Fahrenheit: %.2f F\n", getFahrenheit());
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter temperature value: ");
        double userValue = input.nextDouble();

        System.out.print("Enter temperature scale (C/F): ");
        char userScale = input.next().toUpperCase().charAt(0);

        if (userScale != 'C' && userScale != 'F') {
            System.out.println("Invalid scale entered. Defaulting to Celsius.");
            userScale = 'C';
        }

        Temperature t = new Temperature(userValue, userScale);
        t.displayTemperature();
    }

}
