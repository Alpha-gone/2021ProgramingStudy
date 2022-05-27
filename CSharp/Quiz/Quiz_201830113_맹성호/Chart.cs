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

namespace Quiz
{
    public partial class Chart : Form
    {
        public Chart()
        {
            InitializeComponent();
        }

        public Chart(Series[] series) : this()
        {
            myChart.Series.Clear();
            myChart.ChartAreas[0].AxisY.Maximum = 100;

            for (int i = 0; i < series.Length; i++) {
                myChart.Series.Add(series[i]);
            }
        }
    }
}
