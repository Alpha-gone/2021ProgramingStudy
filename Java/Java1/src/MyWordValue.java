import java.util.Scanner;

public class MyWordValue {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String sWord, nWhile = "-1";
		int sum;
		
		System.out.println("점수를 알고 싶은 단어를 입력하세요. 종료하고 싶으면 END를 입력하시면 됩니다.");
		while(nWhile.equals("-1")) {
			sWord = sc.nextLine();
			sWord = sWord.toLowerCase();
			sum = 0;
			
			if(sWord.equals("end")) {
				nWhile = "0";
				continue;
			}
			for(int i = 0; i < sWord.length(); i++) {
				sum += (int)sWord.charAt(i) - 96;
			}
			
			System.out.println(sWord + "는 " + sum + "점 입니다.");
		}
		sc.close();
	}
}