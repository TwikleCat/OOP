package practice2;
import java.util.*;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
		
	}
	
	public boolean setTime(int h, int m, int s) {
		if(h<0 || h >23) {
			return false;
		}
		if(m<0 || m>59) {
			return false;
		}
		if(s<0 || s>59) {
			return false;
		}
		
		hour = h;
		minute=m; 
		second =s;
		return true;
	}
	
	public String toUniversal() {
		return (hour < 10 ? "0" + hour : hour) + ":" +
			       (minute < 10 ? "0" + minute : minute) + ":" +
			       (second < 10 ? "0" + second : second);
	}
	
	public String toStandard() {
		int x = hour % 12;
	    if (x == 0) x = 12;
	    String end = (hour < 12) ? "AM" : "PM";

	    StringBuilder sb = new StringBuilder();
	    if (x < 10) sb.append("0");
	    sb.append(x).append(":");

	    if (minute < 10) sb.append("0");
	    sb.append(minute).append(":");

	    if (second < 10) sb.append("0");
	    sb.append(second).append(" ").append(end);

	    return sb.toString();
		
	}
	
	public void add(int h2, int m2, int s2) {
	    second += s2;
	    minute += m2 + second / 60;
	    second %= 60;
	    hour += h2 + minute / 60;
	    minute %= 60;
	    hour %= 24;
	}
	
	public void add(Time t2) {
        add(t2.hour, t2.minute, t2.second);
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    Time t = new Time();

	    System.out.print("Enter hour: ");
	    int h = input.nextInt();

	    System.out.print("Enter minute: ");
	    int m = input.nextInt();

	    System.out.print("Enter second: ");
	    int s = input.nextInt();

	    if (!t.setTime(h, m, s)) {
            System.out.println("Invalid time input for time 1!");
            return;
        }
	    
	    Time t2 = new Time();

	    System.out.print("Enter hour for second time: ");
	    int h2 = input.nextInt();

	    System.out.print("Enter minute for second time: ");
	    int m2 = input.nextInt();

	    System.out.print("Enter second for second time: ");
	    int s2 = input.nextInt();

	    if (!t2.setTime(h2, m2, s2)) {
            System.out.println("Invalid time input for time 2!");
            return;
        }
	    
	    System.out.println("Universal format: " + t.toUniversal());
        System.out.println("Standard format: " + t.toStandard());
	    
	    t.add(t2);
	    
	    
        System.out.println("After adding:");
        System.out.println("Universal format: " + t.toUniversal());
        System.out.println("Standard format: " + t.toStandard());
	    

	    input.close();
	    
	    
	}

}
