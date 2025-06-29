package problem_1;

public class RemoteExample {
	public static void main(String[] args) {
        RemoteControllable tv = new Television();
        RemoteControllable speaker = new Speaker();
        RemoteController remote = new RemoteController();
        

        System.out.println("=== TV Control ===");
        remote.powerOn(tv);            
        remote.volume(tv, 20);                  
        remote.powerOff(tv);            
        remote.volume(tv, 10);          

        System.out.println("\n=== Speaker Control ===");
        remote.powerOn(speaker);        
        remote.volume(speaker, 7);      
        remote.powerOff(speaker);
    }

}
