import java.util.*;

public class WordGameApp {
	private Scanner sc;
	private String startWord = "대림대";
	private Player[] players;
	
	public WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		int nPlayers = sc.nextInt();
		players = new Player[nPlayers];
		
		for(int i = 0; i < nPlayers; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			String name = sc.next();
			players[i] = new Player(name);
		}
	}
	
	public void run() {
		createPlayers();
		String lastWord = startWord;
		
		System.out.println("시작하는 단어는 " + lastWord + "입니다.");
		int next = 0;
		
		while(true) {
			String newWord = players[next].sayWord();
			if(players[next].succeed(lastWord)) {
				System.out.println(players[next].getName() + "이 졌습니다.");
				break;
			}
			
			next++;
			next %= players.length;
			lastWord = newWord;
			
		}
		
	}
	
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();

	}

}