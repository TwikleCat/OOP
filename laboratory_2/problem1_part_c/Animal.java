package problem1_part_c;
import java.util.*;

public class Animal {
	private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
    	return name; 
    }
    public int getAge() {
    	return age; 
    }
    
    public void setName(String name) { 
    	this.name = name; 
    }
    public void setAge(int age) {
    	this.age = age;
    }
        
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }
    
    public int hashCode() {
        return Objects.hash(name, age);
    }
 
    public String toString() {
        return "Animal [Name=" + name + ", Age=" + age + "]";
    }

}
