package domain;

public class SmartPhone_Ex {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("애플", "Iphone");
		System.out.println("SmartPhone Spec : " + sp.company + "/" + sp.model);
		
		sp.turnOn();
		sp.bell();
		sp.doInternet();
		sp.turnOff();
		
		
		
		
		
		
		
		
		
		
	}

}
