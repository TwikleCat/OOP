package problem_4;
import java.time.LocalDate;
import java.util.*;
import java.text.*;

public class Test {
	public static void main(String[] args) {
        Employee emp1 = new Employee("Alibek", 50000, LocalDate.of(2024, 12, 26), "672310");
        Employee emp2 = new Employee("Ersultan", 55000, LocalDate.of(2019, 8, 22), "1635");
        Employee emp3 = new Employee("Eskendir", 50000, LocalDate.of(2022, 5, 30), "96665");
        Employee emp4 = new Employee("Beka", 53933, LocalDate.of(2025, 1, 1), "7654345");

        Manager manager1 = new Manager("Gena", 90000, LocalDate.of(2012, 2, 15), "112346", 11.2);
        manager1.addTeamMember(emp1);
        manager1.addTeamMember(emp2);
        manager1.addTeamMember(emp3);

        Collections.sort(manager1.employers);
        System.out.println("sorted by salary:");
        for (Employee emp : manager1.employers) {
            System.out.println(emp);
        }


        System.out.println("\n");
        
        

        Collections.sort(manager1.employers, new NameComparator());
        System.out.println("sorted by name:");
        for (Employee emp : manager1.employers) {
            System.out.println(emp);
        }
        

        System.out.println("\n");

        Collections.sort(manager1.employers, new HireDateComparator());
        System.out.println("sorted by hire date:");
        for (Employee emp : manager1.employers) {
            System.out.println(emp);
        }
        
        

        manager1.addTeamMember(emp4);

        
        System.out.println("\n");
        manager1.showEmployee();
        

        System.out.println("\n");
        
        
        Manager clonedManager = manager1.clone();
        
        System.out.println(clonedManager);
        

        System.out.println("\n");
        
        
        Employee clonedEmployee = emp1.clone();
        System.out.println(clonedEmployee);
    
	
	}

}
