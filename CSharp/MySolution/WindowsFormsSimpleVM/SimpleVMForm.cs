using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsSimpleVM
{
    public partial class SimpleVMForm : Form
    {
        public SimpleVMForm()
        {
            InitializeComponent();
            InitControl();
            btnMethod();
        }

        private void btnMethod()
        {
            btnCoin.Click += BtnCoin_Click;
            btnCoke500.Click += BtnCoke500_Click;
            btnCider300.Click += BtnCider300_Click;
            btnCoffee700.Click += BtnCoffee700_Click;
            btnChanges.Click += BtnChanges_Click;
        }

        int changes = 0;

        private void BtnCoin_Click(object sender, EventArgs e)
        {
            changes += int.Parse(cbCoin.Text);
            lbChangesValue.Text = changes.ToString();
        }

        private void BtnCoke500_Click(object sender, EventArgs e)
        {
            if (changes < 500)
            {
                MessageBox.Show("잔액이 부족합니다.");
            }
            else
            {
                MessageBox.Show("콜라가 뽑혔음");
                changes -= 500;
                lbChangesValue.Text = changes.ToString();
            }
           
        }

        private void BtnCider300_Click(object sender, EventArgs e)
        {
            if (changes >= 300)
            {
                MessageBox.Show("사이다가 뽑혔음");
                changes -= 300;
                lbChangesValue.Text = changes.ToString();
                
            }
            else
            {
                MessageBox.Show("잔액이 부족합니다.");
            }
        }

        private void BtnCoffee700_Click(object sender, EventArgs e)
        {
            if (changes < 700)
            {
                MessageBox.Show("잔액이 부족합니다.");
                return;
            }

            MessageBox.Show("커피가 뽑혔음");
            changes -= 700;
            lbChangesValue.Text = changes.ToString();



        }

        private void BtnChanges_Click(object sender, EventArgs e)
        {
            if(changes != 0)
            {
                MessageBox.Show(changes.ToString() + "원이 환전 됐습니다.");
                changes = 0;
                lbChangesValue.Text = changes.ToString();
            }
            else
            {
                MessageBox.Show("환전될 잔액이 없습니다.");
            }
            
        }

        private void InitControl()
        {
            cbCoin.Items.Clear();
            cbCoin.Items.Add("100");
            cbCoin.Items.Add("500");
            cbCoin.Items.Add("1000");
        }
    }
}
