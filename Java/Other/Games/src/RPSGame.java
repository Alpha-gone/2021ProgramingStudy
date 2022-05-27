import java.util.*;

public class RPSGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int nRand;
		String sInput;
		String[] GBB = {"가위", "바위", "보"};
		String[][] sResult = {{"비겼습니다.", "졌습니다.", "이겼습니다."},
							  {"이겼습니다.", "비겼습니다.", "졌습니다."},
							  {"졌습니다.","이겼습니다.","비겼습니다."}};
		
		System.out.println("201830113 맹성호");
		
		while(true) {
			System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
			System.out.print("입력 >> ");
			sInput = sc.nextLine();
			nRand = random.nextInt(3);
			
			System.out.println("나는 (" + sInput + ")를 내고 컴퓨터는 (" + GBB[nRand] + ")를 냈다.");
			System.out.println(sResult[Arrays.binarySearch(GBB, sInput)][nRand]);
		}
	}
}