package observers;

import observable.Observable;

public interface ObserverPop extends ObserverRoot {
	public void update(Observable observable);
}
