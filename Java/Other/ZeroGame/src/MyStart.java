import java.util.Scanner;

public class MyStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nInput;
        
        // showMsg("hello Java!!");

        // nInput = sc.nextInt();
        // showMsg(Integer.toString(nInput));

        // sc.close();

        showMsg("참가 인원수 입력 : ");
        nInput = sc.nextInt();
        showMsg(ZeroGame(nInput));
        sc.close();
    }

    public static void showMsg(String str) {
        System.out.println(str);
    }

    public static int myRandom(int start, int count) {
        return (int) (Math.random() * count) + start;
    }
    
    public static String ZeroGame(int nPerson) {
        Scanner sc = new Scanner(System.in);
        boolean bWhile = true;
        int nInput, random;
        int round = 1;
        showMsg("start");

        while (bWhile) {
            nInput = sc.nextInt();
            if(nInput > nPerson || nInput < 0){
                showMsg("다시 입력하세요");
                continue;
            }
            random = myRandom(0, nPerson + 1);
            
            showMsg("유저 >" + nInput);
            showMsg("컴퓨터 > " + random);

            if (nInput == random) {
                showMsg("승리");
                bWhile = false;
            } else {
                showMsg("다시 공격");
                round++;
            }
        }
        sc.close();
        return round +"번 만에 승리";
    }
}