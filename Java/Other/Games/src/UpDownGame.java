import java.util.*;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int nRand, nInput;
		
		System.out.println("201830113 맹성호");
		
		nRand = random.nextInt(31);
		while(true) {
			System.out.println("업다운 게임");
			System.out.print("0 ~ 30 사이의 수를 입력하세요 >> ");
			nInput = sc.nextInt();
			
			if(nInput == nRand) {
				System.out.println("정답입니다.");
				break;
			}else if(nInput > nRand) {
				System.out.println("Down");
			}else {
				System.out.println("Up");
			}
		}
		System.out.println("종료");

	}
}