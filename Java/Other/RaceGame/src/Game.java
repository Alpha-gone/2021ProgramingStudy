import java.io.IOException;

public class Game {
	public static void main(String[] args) throws IOException {
		int nWhileGame = 1; //파산하거나 목표 금액을 모을 때 까지 반복
		
		while(nWhileGame == 1) {
			
			GameFunction.showPlayer(); //선수 소개

			GameFunction.betting(); //배팅 선수 선택 및 금액 베팅
		
			GameFunction.playGame(); //경기 진행
			
			nWhileGame = GameFunction.endOfGame(); // 경기 마무리 및 목표 달성 여부 판단
		
		}
	}
}