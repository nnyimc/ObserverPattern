package observable;

import java.util.ArrayList;
import java.util.List;

import observers.ObserverPop;
import observers.ObserverPush;
import observers.ObserverRoot;


public class ObservableImpl implements Observable {
	private int state;
	private List<ObserverPush> observersPush = new ArrayList<ObserverPush>();
	private List<ObserverPop> observersPop = new ArrayList<ObserverPop>();
	
	public ObservableImpl() {
		
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObservers();
	}

	@Override
	public void subscribePush(ObserverRoot observer) {
		observersPush.add((ObserverPush)observer);
	}

	@Override
	public void unsubscribePush(ObserverRoot observer) {
		observersPush.remove(observer);
		
	}
	
	@Override
	public void subscribePop(ObserverRoot observer) {
		observersPop.add((ObserverPop)observer);
	}

	@Override
	public void unsubscribePop(ObserverRoot observer) {
		observersPop.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(ObserverPush o: observersPush) {
			// pushing state towards observers
			o.update(state);
		}
		
		for(ObserverPop o: observersPop) {
			// pop data
			o.update(this);
		}
		
	}

}
