package korea;
public class korea_language extends korea_case_2{	// 부모 클래스를 두고 있는 자식 클래스
	void not_eng_kor() {
		for(int i=0; i<9; i++) {
			
			System.out.println(country_list[i]+" "+language[i]);
		}
		
	}
	void eng_kor() {
		for(int i=0; i<11; i++) {
			
			System.out.println(country_list[i]+" "+language[i]);
			
		}
	}
}
