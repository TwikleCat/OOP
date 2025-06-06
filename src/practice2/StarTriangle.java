package practice2;
import java.util.*;

public class StarTriangle {
	private int w;
	
	public StarTriangle(int wid) {
        w = wid;      		
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for (int i=1; i<=w; i++) {
			for(int j=1; j<=i; j++) {
				result.append("[*]");
			}
			result.append("\n");
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("The width: ");
		int wd=input.nextInt();
		input.close();
		StarTriangle star= new StarTriangle(wd);
		System.out.println(star.toString());
		
		
	} 
	
	

}
