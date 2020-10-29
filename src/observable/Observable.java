package observable;

import observers.ObserverRoot;

public interface Observable {
	public void notifyObservers();
	void subscribePush(ObserverRoot observer);
	void unsubscribePush(ObserverRoot observer);
	void subscribePop(ObserverRoot observer);
	void unsubscribePop(ObserverRoot observer);
}
