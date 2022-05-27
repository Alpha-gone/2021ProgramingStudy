using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using QuizClassLibrary;

namespace Quiz
{
    public partial class Form1 : Form
    {
        DataTable dt = new DataTable();

        public Form1()
        {
            InitializeComponent();
            btnQ1.Click += BtnQ1_Click;
            btnQ2.Click += BtnQ2_Click;
            btnQ3.Click += BtnQ3_Click;
            SetCombo();
            SetDataGrid();
        }

        private void SetDataGrid() {
            dt.Columns.Add("학번");
            dt.Columns.Add("이름");
            dt.Columns.Add("평점");
            
            dataGridView.DataSource = dt;
        }
        private void SetCombo() {
            comboBox.Items.Clear();
            comboBox.Items.Add("A");
            comboBox.Items.Add("B");
            comboBox.Items.Add("C");

        }
        private void BtnQ1_Click(object sender, EventArgs e)
        {
            String[] sInput = tbQ1Input.Text.Split(',');
            Popup popup = new Popup(sInput);
            popup.ShowDialog();
        }

        private void BtnQ2_Click(object sender, EventArgs e)
        {
            StringCompute sCompute = new StringCompute();
            tbQ2Result.Text = sCompute.Compute(tbQ2Input.Text);
        }

        private void BtnQ3_Click(object sender, EventArgs e)
        {
            dt.Rows.Add(tbNum.Text, tbName.Text, comboBox.Text);
        }
    }
}
