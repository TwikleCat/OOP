package problem1_part_c;
import java.util.*;

public class Cat extends Animal{
    private String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    public String getColor(){ 
    	return color; 
    }
    
    public void setColor(String color) { 
    	this.color = color; 
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }
    
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
    
    public String toString() {
        return "Cat [Name=" + getName() + ", Age=" + getAge() + ", Color=" + color + "]";
    }
}
