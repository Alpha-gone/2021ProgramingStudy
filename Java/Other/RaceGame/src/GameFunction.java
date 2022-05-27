import java.io.*;
import java.util.StringTokenizer;


public class GameFunction {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Player[] players = new Player[6]; //선수들을 선언 하기 위한 배열 
	static int money = 100000, choice = - 1, betting = 0, cashMoney = 0; //지갑 잔고, 선택 선수 번호, 베팅금액, 우승시 배당금
	
	public static String ItoString(int nNum) { 
		return Integer.toString(nNum);
	}
	
	public static void showPlayer() throws IOException { // 선수 소개 메소드
		for(int i = 0; i < players.length; i++) {
			players[i] = new Player(i);
		}
		
		bw.write("=".repeat(70) + "선수 소개" + "=".repeat(70) + "\n");
		
		for(int i = 0; i < players.length; i++) {
			bw.write("|선수명 : " + players[i].getsName() + "\t");
		}
		bw.newLine();
		
		for(int i = 0; i < players.length; i++) {
			bw.write("|컨디션 : " + players[i].getsCondition() + "\t\t");
		}
		bw.newLine();
		
		for(int i = 0; i < players.length; i++) {
			bw.write("|배 율 : " + Double.toString(players[i].getdMagnification()) + "\t\t");
		}
		bw.write("\n\n");
		bw.flush();
	}
	
	public static void betting() throws IOException { //선수 배팅 및 금액 입력, 출력 및 계산 메소드
		StringTokenizer st;
		int nWhileBetting = 1;
		
		while(nWhileBetting == 1) {
			bw.write("=".repeat(70) + "금액 배팅" + "=".repeat(70) + "\n");
			bw.write("게임 설명 : 간단 경마 게임으로 돈을 걸어 1백만원을 모으는 게임 입니다.\n");
			bw.write("현재 잔고 : " + ItoString(money) + "원\n");
			bw.write("배팅할 선수 번호와 배팅 금액을 입력해주세요 Ex)선수번호 배팅 금액 : ");
			bw.flush();
			st = new StringTokenizer(br.readLine(), " ");
			choice = Integer.parseInt(st.nextToken()) - 1;
			betting = Integer.parseInt(st.nextToken());
			
			if(choice < 0 || choice > 6) {
				bw.write("[선수 번호 입력 범위가 초과 되었습니다.]\n");
				bw.flush();
				continue;
			}else if(money - betting < 0) {
				bw.write("[잔고를 초과 했습니다.]\n");
				bw.flush();
				continue;
			}
			
			money -= betting;
			cashMoney = (int)Math.round(betting * players[choice].getdMagnification()); //배팅 금액과 배당률을 곱한뒤 반올림 하여 배당금 결정
			players[choice].setcCharcter();
			nWhileBetting = 0;
		}
		
		bw.write("\n\n");
		bw.write("배팅한 선수 번호 : " + ItoString(choice + 1) + "번\n");
		bw.write("잔고 / 배팅액 /배당금 : " + ItoString(money) + " / " + ItoString(betting) + " / "+ ItoString(cashMoney)+" 원");
		bw.write("\n\n");
		bw.flush();
		
	}
	
	public static void playGame() throws IOException { //경기 진행 메소드
		char[] cGoal = {'G', 'O', 'A', 'L', '!', '!'}; //골 라인 문자
		int nWhile = 1, nGoal = 0;
		
		bw.write("=".repeat(70) + "경기 시작" + "=".repeat(70) + "\n");
		
		while(nWhile == 1) {
			for(int i = 0; i < players.length; i++) {
				players[i].setnPosition(); //각 선수들의 이번 턴 진행거리 계산
				bw.write(ItoString(i + 1) + "|"+ " ".repeat(players[i].getnPosition()) ); //출발선에서 부터의 거리 출력
				
				if(players[i].getnPosition() < 100) { // 선수가 도착하지 못한 경우 케릭터 및 남은 거리 표시 
					bw.write(players[i].getcCharcter() + " ".repeat(100 - players[i].getnPosition() - 1) +"|" + cGoal[i] + "\n");
				}else { // 도착한 경우 결승선 통과
					bw.write("|" + players[i].getcCharcter() + "\n");
					players[i].setbGoal(true);
					nGoal += 1;	
				}
			
				bw.write("  "+"-".repeat(100)+ "\n");
				
			}
			
			
			
			
			if(nGoal == 0) { //결승선 을 통과하면 종료
				bw.write("=".repeat(110) + "\n");
			}else {
				bw.write("=".repeat(70) + "경기 종료" + "=".repeat(70) + "\n");
				nWhile = 0;
			}
			bw.flush();
		}
		
		bw.write("\n\n");
		bw.write("1위는 ");
		for(int i = 0; i < players.length; i++) {
			if(players[i].isbGoal()) {
				bw.write(players[i].getsName() + " ");
			}
			
		}
		bw.write("입니다.!!\n");
	}
	
	public static int endOfGame() throws IOException { //배당금 획득 여부 및 다음 게임 진행 여부 판단
		int nWhileGame = 1;
		if(players[choice].isbGoal()) {
			bw.write("축하드립니다 배팅한 선수가 승리 하였습니다. 배당금" + ItoString(cashMoney) +"원을 획득하셨습니다.");
			money += cashMoney;
		}else {
			bw.write("안타깝게도 배팅한 선수가 우승하지 못했습니다. 다음판에 우승을 기원 합니다.");
		}
		bw.newLine();
	
		
		if(money > 1000000) {
			bw.write("축하드립니다. 목표 금액을 달성 하셨습니다.");
			nWhileGame = 0;
		}else if(money == 0) {
			bw.write("잔고가 부족하여 더이상 게임을 진행 하실수 없습니다.");
			nWhileGame = 0;
		}
		bw.newLine();
		bw.flush();
		
		return nWhileGame;
	}
}
