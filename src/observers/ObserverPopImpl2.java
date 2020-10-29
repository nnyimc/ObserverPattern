package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverPopImpl2 implements ObserverPop {
	public int initialValue;

	public ObserverPopImpl2() {
		super();
	}

	public int getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}

	@Override
	public void update(Observable observable) {
		int retrievedValue = ((ObservableImpl) observable).getState();
		if (retrievedValue != initialValue) {
			System.out.println("Pop2 --> Change detected!!");
			initialValue = retrievedValue;
		}
	}
	
	

}
