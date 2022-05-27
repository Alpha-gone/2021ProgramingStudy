using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsUpDown
{
    public partial class UpDownForm : Form
    {
        public UpDownForm()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        int tryCount = 0;
        int resultNum;

        private void btninit_Click(object sender, EventArgs e)
        {
            //시도한 횟수 - 외부에서 사용
            tryCount = 0;
            lbTryCount.Text = tryCount.ToString();

            //시작한 시간
            lbStartTime.Text = DateTime.Now.ToString();

            //현재 상태
            lbState.Text = "게임을 시작합니다. 1 ~ 60까지의 숫자를 입력하세요!";

            //랜덤 값(결과 숫자) - 외부에서 사용
            Random random = new Random();
            resultNum = random.Next(60) + 1;

            initGame();
        }

        private void initGame()
        {
            btnInput.Enabled = true;
            txtInput.Text = "";
            IncressTryProgressBar(tryCount);
        }

        private void btnInput_Click(object sender, EventArgs e)
        {
            int inputNum = int.Parse(txtInput.Text);

            if (inputNum > 60 || inputNum < 1) {
                lbState.Text = "1 ~ 60 사이의 값을 입력해주세요";
            }
            else
            {
                tryCount++;
                lbTryCount.Text = tryCount.ToString();
                IncressTryProgressBar(tryCount);

                if (resultNum == inputNum)
                {
                    lbState.Text = "정답입니다." + tryCount.ToString() + "번만에 맞추셨습니다.";
                    CloseGame();
                }
                else if (resultNum > inputNum)
                {
                    lbState.Text = "UP!";
                }
                else
                {
                    lbState.Text = "DOWN!"; 
                }
            }

            if (tryCount >= 10 && resultNum != inputNum) {
                lbState.Text = "시도횟수는 10번까지입니다.";
                CloseGame();
            }
            
        }

        private void CloseGame()
        {
            btnInput.Enabled = false;

        }

        private void IncressTryProgressBar(int tryCount) {
            tryProgressBar.Value = tryCount * 10;
        }
    }
}
