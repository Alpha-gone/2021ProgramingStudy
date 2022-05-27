public class Player {
	private String[] sPlayerNumber = {"1st", "2nd", "3rd", "4th", "5th", "6th"}; // 선수 이름을 저장한 배열
	private String[] sarCodition = {"나쁨", "보통", "좋음"}; //선수 소개에 보여줄 선수 컨디션 저장 배열
	private double[] darMagification = {5.5, 2.3, 1.3}; //실제 경기에 사용될 컨디션 값 저장 배열
	private String sName; //선수 이름
	private double dCondition; //보여주는 컨디션
	private String sCondition; //실제 사용되는 컨디션 수치
	private double dMagnification; //우승시 배당률
	private int nPosition; //위치 값을 저장하는 변수
	private char cCharcter; //사용자가 선택한 선수의 케릭터를 구별하기위한 변수
	private boolean bGoal; //도착 여부 판단 변수 
	
	public Player(int nPlayerNumber) {
		sName = sPlayerNumber[nPlayerNumber] + " Player";
		dCondition = (int)(Math.random() * 3) + Math.random(); // 0 ~ 2.99 사이의 값을 랜덤으로 설정
		sCondition = sarCodition[(int)dCondition]; //컨디션 수치를 범위에 따라서 문자열로 표현
		dMagnification = darMagification[(int)dCondition]; //컨디션 수치를 참조하여 범위에 맞게 배당률 결정
		nPosition = 0; //선수 위치값
		cCharcter = '■'; // 기본 캐릭터 설정
		bGoal = false; //골 여부 판단 기본 false
	}

	public String getsName() {
		return sName;
	}

	

	public double getdCondition() {
		return dCondition;
	}

	

	public double getdMagnification() {
		return dMagnification;
	}


	public int getnPosition() {
		return nPosition;
	}

	public void setnPosition() {
		this.nPosition += (int)((Math.random()*5 + 1) * this.getdCondition()); //1 ~ 5 사이의 랜덤 값에 컨디션 수치를 곱하여 진행거리 계산 
		
		if(this.getdCondition() < 1){ //컨디션 수치가 매우 낮을 경우 게임 밸런스 및 변수 창출을 위한 거리 보정 
			this.nPosition += 3;
		}
		if(this.nPosition > 100) { //골인 지점에 도착한 경우 진행거리 계산 종료
			this.nPosition = 100;
		}
	}
	
	public String getsCondition() {
		return sCondition;
	}


	public char getcCharcter() {
		return cCharcter;
	}

	public void setcCharcter() { // 사용자가 선택한 선수의 캐릭터를 구별 할 수 있도록 다르게 설정
		this.cCharcter = '@';
	}

	public boolean isbGoal() {
		return bGoal;
	}

	public void setbGoal(boolean bGoal) {
		this.bGoal = bGoal;
	}
}