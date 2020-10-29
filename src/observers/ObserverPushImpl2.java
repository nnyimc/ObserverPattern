package observers;

public class ObserverPushImpl2 implements ObserverPush {
	private int initialValue;
	public ObserverPushImpl2() {
		
	}
	
	@Override
	public void update(int state) {
		if (initialValue > state) {
			System.out.println("Obs2 --> Quality loss");
		} else if (initialValue < state ) {
			System.out.println("Obs2 --> Quality gain");
		} else {
			System.out.println("Obs2 --> Stable quality");
		}
		initialValue = state;
		
	}

}
