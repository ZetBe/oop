package korea;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
public class korea_main {
	public static void main(String[] args) throws IOException{
	    PrintWriter pw = new PrintWriter("c:/korea.txt");
		System.out.println("안녕하세요. 찾아 주셔서 감사합니다.");
		boolean a = true;
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int select = 0;
		while (a) {
			System.out.println("어떤 항목을 선택하실건가요?(숫자만 입력해 주세요)");
			System.out.println("------------------------------------");
			System.out.println("1번: 간략한 소개");
			System.out.println("2번: 언어별로 말하는 한류");
			System.out.println("3번: 한류의 역사");
			System.out.println("4번: 한류의 현황");
			System.out.println("5번: 장르별 한류");
			System.out.println("6번: 종료");
			
			select = scanner.nextInt();
			System.out.print(select+"번을 선택하셨습니다.\n해당 번호로 이동합니다.\n");
				
				
			switch(select) {
			case 1:
				if (!list.contains(select)) {
					list.add(select);
				}
				korea_case_1 k1 = new korea_case_1();
				k1.explain();
				System.out.println("혹시 해당 설명을 파일에 저장하시겠습니까?");
				System.out.println("(Yes/No) 둘중 하나만 입력하시오.");
				String f = scanner.next();
				if (f.equals("Yes")) {
					String data = k1.give_string_k1();
					pw.println(data);
					System.out.println("파일에 입력했습니다. 다음으로 넘어갑니다.");
				}
				else if (f.equals("No")) {
					System.out.println("다음으로 넘어갑니다.");
				}
				break;
				
				
				
				
				
			case 2:
				if (!list.contains(select)) {
					list.add(select);
				}
				korea_language kl = new korea_language();
				System.out.println("언어는 영어와 한국어를 제외한 9개국의 언어를 볼 수 있습니다.");
				System.out.println("영어와 한국어를 제외하겠습니까? 제외한 버전은 1번, 포함한 버전은 2번을 입력해주세요.");
				int lang = 0;
				try {
					lang = scanner.nextInt();
				}
				catch(NumberFormatException e) {
					System.out.println("숫자가 아닙니다.");
				}
				
				if(lang==1) {
					kl.not_eng_kor();
				}
				else if (lang==2) {
					kl.eng_kor();
				}
				System.out.println("혹시 해당 설명을 파일에 저장하시겠습니까?");
				System.out.println("(Yes/No) 둘중 하나만 입력하시오.");
				String d = scanner.next();
				if (d.equals("Yes")) {
					if (lang==1) {
						for (int in=0; in<9; in++) {
							String data = kl.give_string_k2(in);
							pw.println(data);
						}
						
					}
					else if (lang==2) {
						for(int in=0; in<11; in++) {
							String data = kl.give_string_k2(in);
							pw.println(data);
						}
					}
					
					System.out.println("파일에 입력했습니다. 다음으로 넘어갑니다.");
				}
				else if (d.equals("No")) {
					System.out.println("다음으로 넘어갑니다.");
				}
				break;
				
				
				
				
			case 3:
				if (!list.contains(select)) {
					list.add(select);
				}
				history his = new history();
				
				System.out.println("보고 싶은 연도를 선택해 주세요.");
				System.out.println("1번: 1990년대\n2번: 2000년대\n3번: 2010년대");
				korea_history_1990 h1990 = new korea_history_1990();
				korea_history_2000 h2000 = new korea_history_2000();
				korea_history_2010 h2010 = new korea_history_2010();
				
				int h = scanner.nextInt();
				if (h==1) {
					System.out.println("1990년대를 선택했습니다.\n");
					his.show_something(h1990);
				}
				else if (h==2) {
					System.out.println("2000년대를 선택했습니다.\n");
					his.show_something(h2000);
				}
				else if (h==3) {
					System.out.println("2010년대를 선택했습니다.\n");
					his.show_something(h2010);
				}
				System.out.println("혹시 해당 설명을 파일에 저장하시겠습니까?");
				System.out.println("(Yes/No) 둘중 하나만 입력하시오.");
				String o = scanner.next();
				if (o.equals("Yes")) {
					if (h==1) {
						String data = h1990.give();
						pw.println(data);
						System.out.println("파일에 입력했습니다. 다음으로 넘어갑니다.");
					}
					
				}
				else if (o.equals("No")) {
					System.out.println("다음으로 넘어갑니다.");
				}
				break;
				
				
				
				
			case 4:
				if (!list.contains(select)) {
					list.add(select);
				}
				System.out.println("콘텐츠 진흥원에서 발표한 2021 해외 콘텐츠시장 분석에 따라 출력합니다.\n");
				System.out.println("세계 콘텐츠 시장규모 [단위: 억 달러]");
				System.out.println("출판: 2,538 | 만화: 120 | 음악: 460 | 게임: 1,613 | 영화: 254 | 애니메이션: 29 | "
						+ "\n방송: 4,748 | 광고: 6,186 | 지식정보: 8,858 | 캐릭터/라이선스: 3,000 || 총합: 24,659");
				System.out.println("\n세계 콘텐츠 시장규모 순위: 7위\n");
				
				System.out.println("혹시 해당 설명을 파일에 저장하시겠습니까?");
				System.out.println("(Yes/No) 둘중 하나만 입력하시오.");
				String p = scanner.next();
				if (p.equals("Yes")) {
					
					pw.println("콘텐츠 진흥원에서 발표한 2021 해외 콘텐츠시장 분석에 따라 출력합니다.\n"+"세계 콘텐츠 시장규모 [단위: 억 달러]"+"출판: 2,538 | 만화: 120 | 음악: 460 | 게임: 1,613 | 영화: 254 | 애니메이션: 29 | "
							+ "\n방송: 4,748 | 광고: 6,186 | 지식정보: 8,858 | 캐릭터/라이선스: 3,000 || 총합: 24,659"+"\n세계 콘텐츠 시장규모 순위: 7위\n");
					System.out.println("파일에 입력했습니다. 다음으로 넘어갑니다.");
					
					
				}
				else if (p.equals("No")) {
					System.out.println("다음으로 넘어갑니다.");
				}
				break;
				
				
				
				
			case 5:
				if (!list.contains(select)) {
					list.add(select);
				}
				korea_case_5_gen g = null;
				String now = "";
				System.out.println("장르별 세계적으로 유명한 우리나라의 문화들을 소개합니다.");
				System.out.println("1.가수(음악) 2.드라마 3.음식 4.게임 5.영화\n이 중 보고 싶은 것에 번호를 입력하세요.");
				int num = scanner.nextInt();
				if (num==1) {
					g = korea_case_5_gen.MUSIC;
					now = g + "방탄소년단: 2013년 6월 13일에 데뷔한 빅히트 뮤직 소속 대한민국 7인조 보이 그룹이다. "
							+ "\n또한, K-Pop을 대표하는 메가스타(megastar)이다. 팬 클럽 이름은 아미다. 2022년 6월부터 팀 활동과 개인 활동을 병행하고 있는 상태이다."
							+"출처: 위키백과";
					System.out.println(now);
					
				}
				else if (num==2) {
					g = korea_case_5_gen.DRAMA;
					now = g + "오징어게임: 줄거리-빚에 쫓기는 수백 명의 사람들이 서바이벌 게임에 뛰어든다. 거액의 상금으로 새로운 삶을 시작하기 위해. "
							+ "\n하지만 모두 승자가 될 순 없는 법. 탈락하는 이들은 치명적인 결과를 각오해야 한다.\r\n"
							+ "주연-이정재,박해수,위하준\r\n"
							+ "크리에이터-황동혁\n"
							+ "출처: 넷플릭스\n";
					
					System.out.println(now);
				}
				else if (num==3) {
					g = korea_case_5_gen.FOOD;
					now = g + "농림축산식품부와 한식진흥원에 따르면 지난해 8~9월 뉴욕과 파리, 베이징 등 주요 도시 주민 8500명을 대상으로 설문조사를 한 결과, \n외국인들이 가장 선호하는 한식 메뉴는 ‘한국식 치킨’이 1위(16.1%)를 차지했다.\n"
							+ "출처: REAL FOODS\n"
							+ "치킨(영어: chicken)으로 불리기도 하는 한국의 닭튀김은 토막낸 닭고기에 튀김옷 또는 반죽물을 덮어 기름에 튀겨 만든 음식이다. "
							+ "\"치킨\"은 \"닭튀김\"이라는 뜻의 영어 \"프라이드 치킨(fried chicken)\"의 줄임말이다. "
							+ "다양한 형태로 변형하여 양념치킨, 간장치킨, 파닭, 닭강정 등으로 만들기도 한다. 반찬으로 \"치킨무\"라 불리는 무 초절임을 함께 낸다. "
							+ "음료수는 탄산음료나 맥주를 곁들여 먹는(치맥) 경우가 많으며, 맥주 대신 소주와 과실주를 곁들이기도 한다."
							+ "출처: 위키백과";
					System.out.println(now);
				}
				else if(num==4) {
					g = korea_case_5_gen.GAME;
					now = g + "배틀그라운드: 배틀그라운드는 김창한 대표의 게임 개발 의지와 도전정신에서 시작된 프로젝트로, 20여 명으로 구성된 작은 팀과 함께 배틀로얄이라는 새로운 게임 장르를 개척한 게임입니다."
							+ "팬 커뮤니티와의 긴밀한 교류를 통해 제작된 배틀그라운드는 새롭고 깊이 있는 게임성을 인정받고 배틀로얄 장르의 글로벌 선두주자로 자리매김하며, "
							+ "전 세계 가장 많은 플레이어를 보유한 게임으로 등극했습니다. 펍지 스튜디오는 계속해서 배틀그라운드만의 플레이 경험을 극대화시켜 팬들에게 즐거움을 선사하고, "
							+ "나아가 배틀그라운드가 팬들의 일상, 문화 일부가 되도록 서비스를 확장해 나갈 예정입니다."
							+ "출처: 크래프톤 공식사이트";
					System.out.println(now);
				}
				else if (num==5) {
					g = korea_case_5_gen.MOVIE;
					now = g + "기생충: 극과 극의 삶을 사는 두 가족의 만남이 빚어낸 신선한 스토리\r\n"
							+ "“같이 잘 살면 안 될까요?”\r\n"
							+ "공생이 어려워진 각박한 시대를 살아가는 사람들의 이야기"
							+ "출처: 다음 영화";
					System.out.println(now);
				}
				else {
					System.out.println("처음으로 돌아가세요");
				}
				
				System.out.println("혹시 해당 설명을 파일에 저장하시겠습니까?");
				System.out.println("(Yes/No) 둘중 하나만 입력하시오.");
				String b = scanner.next();
				if (b.equals("Yes")) {
					
					pw.println(now);
					System.out.println("파일에 입력했습니다. 다음으로 넘어갑니다.");
					
					
				}
				else if (b.equals("No")) {
					System.out.println("다음으로 넘어갑니다.");
				}
				break;
				
				
			case 6:
				boolean k = true;
				for(int i=1; i<=5; i++) {
					if (!list.contains(i)) {
						k = false;
					}
				}
				if (k) {
					System.out.println("모든 항목을 다 봤습니다.");
					System.out.println("항목 내부에 못본 것들이 있다면 한번 찾아봅시다.");
				}
				
				System.out.println("프로그램을 종료하십니까? \n(Yes/No) 둘중 하나만 입력하시오.");
				String exit = scanner.next();
				if (exit.equals("Yes")){
					System.out.println("프로그램을 종료합니다.");
					BufferedReader reader = new BufferedReader(new FileReader("c:/korea.txt"));
					String ch;
					while((ch = reader.readLine())!= null) {
						System.out.print(ch);
					}
					System.out.println("지금까지 봤던 글들은 모두 로컬 디스크 안에 텍스트파일로 기록하였습니다.");
					a = false;
				}
				else if (exit.equals("No")) {
					System.out.println("다시 시작합니다.");
				}
				else {
					System.out.println("다시 처음부터 입력하세요.");
				}
				break;
				}
			
			}pw.close();
		
	}
}
