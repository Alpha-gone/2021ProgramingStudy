import java.util.Scanner;

public class ZeroGame {  
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int temp, nGamer, nRound = 1, nSwitch = -1;
        int nMainGame = 1;
        int[] nScore = {0,0};
        int[] nGameInput = {0, 0};
        String[] sPlayer = {"컴퓨터", "사용자"};
        String[] sMessage = {"방어할", "공격할"};
        
        
        System.out.println("제로게임 시작");
        while(nMainGame == 1) {
        	System.out.println("ROUND " + nRound);
        	
        	System.out.print("게임에 참가할 인원수를 입력 하시오(최대 10명)>> ");
        	nGamer = sc.nextInt();
        	
        	while(nGamer > 10 || nGamer < 1) {
            	System.out.print("게임에 참가할 인원수를 입력 하시오(최대 10명)>> ");
            	nGamer = sc.nextInt();
            }
        	
        	nGameInput[nRound % 2 + nSwitch] = (int)(Math.random() * nGamer + 1);
        	
        	System.out.println(sPlayer[nRound % 2] + " 공격");
        	System.out.print(sMessage[nRound % 2] +" 수를 입력하세요 >> ");
        	nGameInput[nRound % 2] = sc.nextInt();
        	
        	while(nGameInput[nRound % 2]  > nGamer) {
        		System.out.println("입력한 값이 플레이어 수 보다 많습니다.");
        		System.out.print(sMessage[nRound % 2] +" 수를 입력하세요 >> ");
        		nGameInput[nRound % 2] = sc.nextInt();
        	}
        	
        	if(nRound % 2 == 0) {
        		temp = nGameInput[0];
        		nGameInput[0] = nGameInput[1];
        		nGameInput[1] = temp;
        	}
        	
        	System.out.println(sPlayer[nRound % 2] + "가 " + nGameInput[nRound % 2] + "를 외침 " + sPlayer[nRound % 2 + nSwitch] +"가 " + nGameInput[nRound % 2 + nSwitch] +"만큼 일어남");
        	
        	if(nGameInput[nRound % 2] == nGameInput[nRound % 2 + nSwitch]) {
        		System.out.println(sPlayer[nRound % 2] + "승리");
        		nScore[nRound % 2]++; 
        	}else {
        		System.out.println(sPlayer[nRound % 2 + nSwitch] + "승리");
        		nScore[nRound % 2 + nSwitch]++; 
        	}
        	
        	System.out.print("\n게임을 계속 하시겠습니까? Y: 1  N: 0 >> ");
        	nMainGame = sc.nextInt();
        	
        	if(nMainGame == 1) {
        		System.out.println("게임을 계속 합니다. \n");
        		nRound++;
        		nSwitch *= -1;
        	}else {
        		System.out.println("게임을 종료 합니다.");
        		System.out.println(nRound + "전 " + nScore[1] + "승 " + nScore[0] +"패");
        		sc.close();
        	}
        }       
   }
}    
