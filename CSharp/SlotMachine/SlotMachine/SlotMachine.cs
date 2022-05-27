using System;
using System.Linq;
using System.Windows.Forms;

namespace SlotMachine
{
    public partial class SlotMachine : Form
    {
        Random rd = new Random(); //랜덤 클래스를 사용하기 위한 객체 생성
        static string[] slotMachineSymbol = { "★", "✖", "▣", "⋈", "⊕", "♢", "⑦" };// 슬롯 문양
        static int[] slotIdxs = new int[3]; // 슬롯의 인덱스를 저장
        int symbolArrayLength = slotMachineSymbol.Length;
        int battingMoney; // 배팅된 금액
        bool machineNowRunning; //슬롯구동을 위한 무한 루프 변수

        public SlotMachine()
        {
            InitializeComponent();
            btnStart.Click += BtnStart_Click;
            btnStop.Click += BtnStop_Click;
            SetGame();
        }

        private void BtnStart_Click(object sender, EventArgs e)
        {
            //텍스트 박스에 0 이나 공백, 문자가오면 종료, 숫자가 오면 실행
            if (BettingCheck()) return; 
                        
            //실제 게임 구동
            GameStart();

            Delay(100); // 슬롯 완전 정지후 판별 위하여 딜레이 추가

            //슬롯 결과 판별
            GameEnd();

            return;
        }

        private void BtnStop_Click(object sender, EventArgs e)
        {          
            //슬롯 무한 루프 종료
            machineNowRunning = false;
            return;
        }

        public bool BettingCheck()
        {
            //베팅 금액이 숫자인 경우 battingMoney에 대입, 아닌경우 false 리턴
            bool moneyisNum = int.TryParse(tbBat.Text, out battingMoney);

            //배팅 금액 확인(0, 공백, 문자가 아니며 소지금액 이하로 입력하면 게임 시작)
            if (tbBat.Text != "" && moneyisNum && 
                battingMoney <= int.Parse(lbMyWallet.Text) && battingMoney != 0)
            {
                lbTitle.Text = "게임을 시작합니다.";
                lbMyWallet.Text = (int.Parse(lbMyWallet.Text) - battingMoney).ToString();
                return false;
            }
            else if (!moneyisNum) //숫자가 아닌 문자 입력
            {
                lbTitle.Text = "숫자를 입력하세요";
            }
            else if (tbBat.Text == "" || battingMoney == 0) //공백 이나 0을 입력
            {
                lbTitle.Text = "돈을 배팅하세요";
            }
            else //소지금액보다 많은 금액을 입력
            {
                lbTitle.Text = "자금이 부족합니다.";
            }
            return true;
        }

        //게임 시작
        public void GameStart() {
            // 무한루프용 변수
            machineNowRunning = true;

            lbTitle.Text = "**SLOT MACHINE**";
            lbResult.Text = "";
            
            //무한 루프를 돌면서 슬롯의 문양을 바꿈
            while (machineNowRunning)
            {
                //각 슬롯의 인덱스를 증가시킴 0 ~ 6사이의 값
                for (int i = 0; i < slotIdxs.Length; i++)
                {
                    slotIdxs[i] = ++slotIdxs[i] % symbolArrayLength;
                }
                
                //랜덤 딜레이 후 1번 슬롯부터 3번 슬롯 까지 문양 설정
                Delay(rd.Next(60, 65));
                SetLabel(slotIdxs[0], lbSlot1_1, lbSlot1_2, lbSlot1_3);

                
                Delay(rd.Next(10, 30));
                SetLabel(slotIdxs[1], lbSlot2_1, lbSlot2_2, lbSlot2_3);

                
                Delay(rd.Next(60, 90));
                SetLabel(slotIdxs[2], lbSlot3_1, lbSlot3_2, lbSlot3_3);
            }

            return;
        }

        //슬롯 판정과 정산
        public void GameEnd()
        {
            int[] slotSymbolCount = new int[symbolArrayLength]; //문양 개수를 저장하는 배열
            String slotState = lbSlot1_2.Text + lbSlot2_2.Text + lbSlot3_2.Text; // 현재 슬롯의 문양을 문자열로 저장

            //문양의 개수 파악
            for (int i = 0; i < symbolArrayLength; i++)
            {
                int beforeSlotStateLength = slotState.Length;
                if (beforeSlotStateLength == 0) break; //문자열의 길이가 0이되면 종료

                slotState = slotState.Replace(slotMachineSymbol[i], ""); //해당하는 문양을 공백으로 바꿈
                slotSymbolCount[i] = beforeSlotStateLength - slotState.Length; //이전 문자열 길이와 현재 문자열 길이의 차이를 변수에 저장

            }

            //3개 슬롯이 같은 문양이면 베팅금액의 7배를 줌
            if (slotSymbolCount.Max() == 3)
            {   
                lbTitle.Text = "!JACKPOT!";
                lbMyWallet.Text = (int.Parse(lbMyWallet.Text) + battingMoney * 7).ToString();
                lbResult.Text = "+" + (battingMoney * 7).ToString();
            }
            else
            {
                lbTitle.Text = "OOPS";
            }

            return;
        }

        //각 슬롯마다 랜덤값을 부여하여 게임을 준비함
        private void SetGame()
        {
            for (int i = 0; i < slotIdxs.Length; i++)
            {
                slotIdxs[i] = rd.Next(symbolArrayLength);
            }

            SetLabel(slotIdxs[0], lbSlot1_1, lbSlot1_2, lbSlot1_3);
            SetLabel(slotIdxs[1], lbSlot2_1, lbSlot2_2, lbSlot2_3);
            SetLabel(slotIdxs[2], lbSlot3_1, lbSlot3_2, lbSlot3_3);
        }

        //슬롯 문양 설정
        public void SetLabel(int slotIndex, Label slotUp, Label slotMiddle, Label slotDown)
        {
            int upIndex = ((slotIndex + 1) == symbolArrayLength) ? 0 : slotIndex + 1; // 배열 범위를 벗어날 경우 처음 인덱스를 리턴
            int downIndex = ((slotIndex - 1) == -1) ? symbolArrayLength - 1 : slotIndex - 1; // 배열 인덱스를 벗어날 경우 마지막 인덱스를 리턴

            slotUp.Text = slotMachineSymbol[upIndex];
            slotMiddle.Text = slotMachineSymbol[slotIndex];
            slotDown.Text = slotMachineSymbol[downIndex];
        }

        //슬롯을 지연시키기위한 딜레이 함수 구글 펌
        public void Delay(int ms)
        {
            DateTime dateTimeNow = DateTime.Now;
            TimeSpan duration = new TimeSpan(0, 0, 0, 0, ms);
            DateTime dateTimeAdd = dateTimeNow.Add(duration);
            while (dateTimeAdd >= dateTimeNow)
            {
                System.Windows.Forms.Application.DoEvents();
                dateTimeNow = DateTime.Now;
            }
            return;
        }
    }
}
