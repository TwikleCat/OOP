package problem_1;


//When we talk about an interface and define capabilities that we promise to provide,we are talking about establishing a contract about what the object can do.
//Interfaces are best suited for providing a common functionality to unrelated classes.
//Interfaces are a good choice when we think that the API will not change for a while.
//They are also good when we want to have something similar to multiple inheritance, since we can implement multiple interfaces.
 

interface RemoteControllable {
	void turnOn();
    void turnOff();
    void setVolume(int level);
	
}


class RemoteController {
	 public void powerOn(RemoteControllable device) {
	        device.turnOn();
	    }

	    public void powerOff(RemoteControllable device) {
	        device.turnOff();
	    }

	    public void volume(RemoteControllable device, int level) {
	        device.setVolume(level);
	    }
}