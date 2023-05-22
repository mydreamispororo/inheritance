package domain;

public class SmartPhone extends Phone {
	public boolean internet; //인터넷 on, off
	public String company;
	public String model;
	
	
	
	//업체, 모델 : 생성자
	public SmartPhone() {}



	public SmartPhone(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	
	
	//인터넷을 껐다 켜는 동작은 메소드로 사용
	public void doInternet() {
		System.out.println("인터넷을 연결합니다.");
		this.internet = true;
	}
	
	public void undoInternet() {
		System.out.println("인터넷 연결을 해지합니다.");
		this.internet = false;
	}
	
}
