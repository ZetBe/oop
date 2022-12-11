package korea;

public class korea_case_1 {
	String one  = "한국의 대중문화 요소가 아시아를 중심으로 해외로 전파되어 인기리에 소비되는 문화현상.\r\n";
	String two = "[출처: 한국민족문화대백과사전(한류(韓流))]\n";
	void explain() {
		System.out.println(one + two);
	}
	String give_string_k1() {
		String three = one + two;
		return three;
	}
}
