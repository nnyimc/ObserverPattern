package presentation;

import observable.ObservableImpl;
import observers.ObserverPush;
import observers.ObserverPop;

public class Application {

	public static void main(String[] args) {
		try 
		{
			ObservableImpl observable = (ObservableImpl) Class
					.forName("observable.ObservableImpl")
					.newInstance();
			
			ObserverPush observerPush1 = (ObserverPush) Class
						.forName("observers.ObserverPushImpl1")
						.newInstance();
			
			ObserverPush observerPush2 = (ObserverPush) Class
					.forName("observers.ObserverPushImpl2")
					.newInstance();
			
			ObserverPop observerPop1 = (ObserverPop) Class
					.forName("observers.ObserverPopImpl1")
					.newInstance();
		
			ObserverPop observerPop2 = (ObserverPop) Class
				.forName("observers.ObserverPopImpl2")
				.newInstance();
			
			
			observable.subscribePush(observerPush1);
			observable.subscribePush(observerPush2);
			
			observable.subscribePop(observerPop1);
			observable.subscribePop(observerPop2);
			
			observable.setState(52);
			System.out.println("\r\n---------------------\r\n");
			observable.setState(-12);
			System.out.println("\r\n---------------------\r\n");
			
			observable.unsubscribePush(observerPush1);
			observable.setState(5);
			
			
			

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
