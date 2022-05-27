using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.DataVisualization.Charting;

namespace WindowsFormsAppEx
{
    public partial class MyChartForm : Form
    {
        public MyChartForm()
        {
            InitializeComponent();
            btnDraw.Click += BtnDraw_Click;
            initCombo();
        }

        private void initCombo()
        {
            comboType.Items.Clear();
            comboType.Items.Add("Column");
            comboType.Items.Add("Bar");
            comboType.Items.Add("Pie");
            comboType.Items.Add("Bubble");
            comboType.Items.Add("Doughnut");
        }

        private void BtnDraw_Click(object sender, EventArgs e)
        {
            myChart.Series.Clear();
            Series s1 = new Series("인구");
            string[] xValue = { "서울", "대전", "전주" };
            int[] yValue = { 10000, 3000, 2000 };

            if (comboType.Text == "Column")
            {
                s1.ChartType = SeriesChartType.Column;
            }
            else if (comboType.Text == "Bar") {
                s1.ChartType = SeriesChartType.Bar;
            }
            else if (comboType.Text == "Pie")
            {
                s1.ChartType = SeriesChartType.Pie;
            }
            else if (comboType.Text == "Bubble")
            {
                s1.ChartType = SeriesChartType.Bubble;
            }
            else if (comboType.Text == "Doughnut")
            {
                s1.ChartType = SeriesChartType.Doughnut;
            }

            s1.Points.DataBindXY(xValue, yValue);
            myChart.Series.Add(s1);
        }    
    }
}
