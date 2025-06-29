package problem_4;

public abstract class Person {
	
    protected String name;
	
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
	public String toString() {
		return "Hello my name is: " + name;
	}
	
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		return name.equals(person.name);
	}
	

}
