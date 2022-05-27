import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nNum1, nNum2, nNum3;
		
		try {
			nNum1 = sc.nextInt();
			nNum2 = sc.nextInt();
			nNum3 = nNum1 / nNum2;
			
			System.out.println(nNum3);
			
		}catch(ArithmeticException e) {
			System.out.println("��� ������ �߻��߽��ϴ�.");
			System.out.println(e.getMessage());
			
		}catch(InputMismatchException e) {
			System.out.println("�Է°� ������ �߻��߽��ϴ�.");
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
		
		}finally{
			System.out.println("���α׷��� �����մϴ�.");
		}
		
		
		
		
		
		

	}

}
