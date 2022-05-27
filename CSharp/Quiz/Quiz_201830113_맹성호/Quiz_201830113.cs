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
using System.Windows.Forms.DataVisualization.Charting;
using QuizClassLibrary;

namespace Quiz
{
    public partial class Quiz_201830113 : Form
    {
        DataTable dt = new DataTable();

        public Quiz_201830113()
        {
            InitializeComponent();
            btnQ1.Click += BtnQ1_Click;
            btnQ2.Click += BtnQ2_Click;
            btnAddData.Click += BtnAddData_Click;
            btnChart.Click += BtnChart_Click;
            SetCombo();
            SetDataGrid();
        }

        private void SetDataGrid() {
            
            dt.Columns.Add("이름");
            dt.Columns.Add("공격");
            dt.Columns.Add("수비");
            dt.Columns.Add("패스");
            dt.Columns.Add("슛");
            
            dataGridView.DataSource = dt;
        }
        private void SetCombo() {
            cbAtt.Items.Clear();
            for (int i = 100; i >= 70; i -= 10){
                cbAtt.Items.Add(i);
            }

            cbDef.Items.Clear();
            for (int i = 100; i >= 70; i -= 10)
            {
                cbDef.Items.Add(i);
            }

            cbPas.Items.Clear();
            for (int i = 100; i >= 70; i -= 10)
            {
                cbPas.Items.Add(i);
            }

            cbSho.Items.Clear();
            for (int i = 100; i >= 70; i -= 10)
            {
                cbSho.Items.Add(i);
            }

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

        private void BtnAddData_Click(object sender, EventArgs e)
        {
            dt.Rows.Add(tbName.Text, cbAtt.Text, cbDef.Text, cbPas.Text, cbSho.Text);
        }

        private void BtnChart_Click(object sender, EventArgs e)
        {
            int i = 0;

            Series[] series = new Series[dt.Rows.Count];
            
            
            foreach(DataRow row in dt.Rows)
            {
                series[i] = new Series(row["이름"].ToString());
                series[i].ChartType = SeriesChartType.Radar;
                series[i].Points.AddXY("공격", row["공격"]);
                series[i].Points.AddXY("수비", row["수비"]);
                series[i].Points.AddXY("패스", row["패스"]);
                series[i].Points.AddXY("슛", row["슛"]);
                i++;
            }

            Chart chartForm = new Chart(series);
            chartForm.ShowDialog();
        }
    }
}
