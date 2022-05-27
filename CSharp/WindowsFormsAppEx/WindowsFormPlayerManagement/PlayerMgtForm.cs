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

namespace WindowsFormPlayerManagement
{
    public partial class PlayerMgtForm : Form
    {
        public PlayerMgtForm()
        {
            InitializeComponent();
            initData();
            btnSearch.Click += BtnSearch_Click;
        }
        private void initData()
        {
            checkedListBoxPlayer.Items.Clear();
            checkedListBoxPlayer.Items.Add(PlayerDataClassLibrary.PlayerDataPark.name);
            checkedListBoxPlayer.Items.Add(PlayerDataClassLibrary.PlayerDataSon.name);
        }
        private void BtnSearch_Click(object sender, EventArgs e)
        {
            string strPlayers =  "";
           
            for (int i = 0; i < checkedListBoxPlayer.CheckedItems.Count; i++)
            {
                strPlayers += checkedListBoxPlayer.CheckedItems[i].ToString();
                strPlayers += ", ";
            }

            if(strPlayers.Length >= 2)
            {
                strPlayers = strPlayers.Remove(strPlayers.Length - 2, 2);
            }
            lbPlayer.Text = strPlayers;

            ShowData();

            ShowChart();
        }

        private void ShowData() {
            DataTable dt = new DataTable();

            dt.Columns.Add("이름");
            dt.Columns.Add("공격");
            dt.Columns.Add("수비");
            dt.Columns.Add("스피드");
            dt.Columns.Add("패스");
            dt.Columns.Add("슛");

            for (int i = 0; i < checkedListBoxPlayer.CheckedItems.Count; i++)
            {
                if (checkedListBoxPlayer.CheckedItems[i].Equals(PlayerDataClassLibrary.PlayerDataPark.name))
                {
                    dt.Rows.Add(PlayerDataClassLibrary.PlayerDataPark.name,
                                PlayerDataClassLibrary.PlayerDataPark.offense,
                                PlayerDataClassLibrary.PlayerDataPark.defense,
                                PlayerDataClassLibrary.PlayerDataPark.speed,
                                PlayerDataClassLibrary.PlayerDataPark.pass,
                                PlayerDataClassLibrary.PlayerDataPark.shoot);
                }
                if (checkedListBoxPlayer.CheckedItems[i].Equals(PlayerDataClassLibrary.PlayerDataSon.name))
                {
                    dt.Rows.Add(PlayerDataClassLibrary.PlayerDataSon.name,
                                PlayerDataClassLibrary.PlayerDataSon.offense,
                                PlayerDataClassLibrary.PlayerDataSon.defense,
                                PlayerDataClassLibrary.PlayerDataSon.speed,
                                PlayerDataClassLibrary.PlayerDataSon.pass,
                                PlayerDataClassLibrary.PlayerDataSon.shoot);
                }
            }

            dataGridView.DataSource = dt;
        }
        private void ShowChart() {
            chart.Series.Clear();

            for (int i = 0; i < checkedListBoxPlayer.CheckedItems.Count; i++)
            {
                Series[] series = new Series[checkedListBoxPlayer.CheckedItems.Count];

                if (checkedListBoxPlayer.CheckedItems[i].Equals(PlayerDataClassLibrary.PlayerDataPark.name))
                {
                    series[i] = new Series(PlayerDataClassLibrary.PlayerDataPark.name);
                    series[i].ChartType = SeriesChartType.Radar;
                    series[i].Points.AddXY("공격", PlayerDataClassLibrary.PlayerDataPark.offense);
                    series[i].Points.AddXY("수비", PlayerDataClassLibrary.PlayerDataPark.defense);
                    series[i].Points.AddXY("스피드", PlayerDataClassLibrary.PlayerDataPark.speed);
                    series[i].Points.AddXY("패스", PlayerDataClassLibrary.PlayerDataPark.pass);
                    series[i].Points.AddXY("슛", PlayerDataClassLibrary.PlayerDataPark.shoot);
                    chart.Series.Add(series[i]);
                }
                if (checkedListBoxPlayer.CheckedItems[i].Equals(PlayerDataClassLibrary.PlayerDataSon.name))
                {
                    series[i] = new Series(PlayerDataClassLibrary.PlayerDataSon.name);
                    series[i].ChartType = SeriesChartType.Radar;
                    series[i].Points.AddXY("공격", PlayerDataClassLibrary.PlayerDataSon.offense);
                    series[i].Points.AddXY("수비", PlayerDataClassLibrary.PlayerDataSon.defense);
                    series[i].Points.AddXY("스피드", PlayerDataClassLibrary.PlayerDataSon.speed);
                    series[i].Points.AddXY("패스", PlayerDataClassLibrary.PlayerDataSon.pass);
                    series[i].Points.AddXY("슛", PlayerDataClassLibrary.PlayerDataSon.shoot);
                    chart.Series.Add(series[i]);
                }
            }
        }
    }
}
