package korea;

public class korea_case_2 {		//한류의 다른 언어버전을 포함한 클래스
	
	String en = "Korean Wave";
	String sp = "ola coreana";
	String ma = "Gelombang Korea";
	String tu = "Kore Dalgası";
	String ru = "Корейская волна";
	String ge = "Koreanische Welle";
	String ta = "กระแสเกาหลี";
	String tg = "Along Koreano";
	String ve = "Làn sóng Hàn Quốc";
	String uk = "Корейська хвиля";
	String ko = "한류";
	String[] language = {sp, ma, tu, ru, ge, ta, tg, ve, uk, ko, en};
	String[] country_list = {"spain", "malaysia", "turkey", "rusia", "germany", "tailand", "philippines", "vietnam", "ukrina", "america", "korea"};
	String give_string_k2(int index) {
		return country_list[index] + language[index];
	}
}
