package domain;

public class Register extends Company{
	public String url;
	
	//회사이름, 도메인 : 생성자
	public Register(String url) {
		super(); //부모꺼를 가져옴
		this.url = url;
		
		
	}

}
