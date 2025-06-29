package problem_1;

public class Television implements RemoteControllable{
	
	public void turnOn() {
        System.out.println("TV is on.");
    }

    
    public void turnOff() {
        System.out.println("TV is off.");
    }

    
    public void setVolume(int level) {
        System.out.println("TV volume set to " + level);
    }

}
