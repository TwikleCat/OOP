package problem_1;

public class Speaker implements RemoteControllable {
	
	public void turnOn() {
        System.out.println("Speaker is on.");
    }

   
    public void turnOff() {
        System.out.println("Speaker is off.");
    }

    
    public void setVolume(int level) {
        System.out.println("Speaker volume set to " + level);
    }

}
