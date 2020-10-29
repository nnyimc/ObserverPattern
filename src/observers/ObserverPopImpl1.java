package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverPopImpl1 implements ObserverPop {
	private float temperature;
	
	public ObserverPopImpl1() {
		super();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}


	@Override
	public void update(Observable observable) {
		int value  = ((ObservableImpl) observable).getState();
		temperature += value;
		System.out.println("Pop1 --> new temperature: " + temperature);
	}
	

}
