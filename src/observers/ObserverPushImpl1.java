package observers;

public class ObserverPushImpl1 implements ObserverPush {
	private double testValue;
	
	@Override
	public void update(int state) {
		System.out.print("Former value: " + testValue + "\r\n");
		testValue += state;
		System.out.println("New value: " + testValue);
	}

}
