using MySql.Data.MySqlClient;
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
    public partial class PlayerMgtFormDB : Form
    {
        public PlayerMgtFormDB()
        {
            InitializeComponent();
            initData();
            btnSearch.Click += BtnSearch_Click;
        }

        private static string mySqlConnStr = "Server=127.0.0.1;Database=winprog;Uid=devCom;Pwd=!pass1308;";
        DataSet ds;
        DataTable dt;

        private void initData()
        {
            checkedListBoxPlayer.Items.Clear();

            try
            {
                MySqlConnection conn = new MySqlConnection(mySqlConnStr);  
                conn.Open();
                String sql = "Select * from playerdata1";
                MySqlDataAdapter mySqlDataAdapter = new MySqlDataAdapter(sql, conn);
                ds = new DataSet(); 
                mySqlDataAdapter.Fill(ds, "playerdata");
                DataTable dt = ds.Tables["playerdata"];

                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    checkedListBoxPlayer.Items.Add(dt.Rows[i]["name"].ToString());
                }
                conn.Close();

            }catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            
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

            SetDataGrid(checkedListBoxPlayer.CheckedItems);
            ShowChart();
        }

        private void SetDataGrid(CheckedListBox.CheckedItemCollection checkedItems)
        {
            try
            {
                MySqlConnection conn = new MySqlConnection(mySqlConnStr);
                conn.Open();
                StringBuilder sb = new StringBuilder();

                sb.Append("select ");
                sb.Append("name as 이름, ");
                sb.Append("offense as 공격, ");
                sb.Append("depense as 수비, ");
                sb.Append("speed as 스피드, ");
                sb.Append("pass as 패스, ");
                sb.Append("shoot as 슛 from playerdata1");

                /*if (checkedItems.Count == 1)
                {
                    sb.Append(" where name = '");
                    sb.Append(checkedItems[0]);
                    sb.Append("'");
                }
                else if (checkedItems.Count > 1)
                {
                    sb.Append(" where name = '");
                    sb.Append(checkedItems[0]);
                    sb.Append("'");

                    for (int i = 1; i < checkedItems.Count; i++)
                    {
                        sb.Append(" or name = '");
                        sb.Append(checkedItems[i]);
                        sb.Append("'");
                    }
                }*/

                sb.Append(" where name = '");
                sb.Append(checkedItems[0]);
                sb.Append("'");

                if (checkedItems.Count > 1)
                {
                    for (int i = 1; i < checkedItems.Count; i++)
                    {
                        sb.Append(" or name = '");
                        sb.Append(checkedItems[i]);
                        sb.Append("'");
                    }
                }

                String sql = sb.ToString();
                MySqlDataAdapter mySqlDataAdapter = new MySqlDataAdapter(sql, conn);
                ds = new DataSet();
                mySqlDataAdapter.Fill(ds, "selected_playerdata");
                dt = ds.Tables["selected_playerdata"];
                dataGridView.DataSource = dt;
                conn.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void ShowChart() {
            chart.Series.Clear();

            Series[] series = new Series[dt.Rows.Count]; 

            for (int i = 0; i < dt.Rows.Count; i++)
            {
                series[i] = new Series(dt.Rows[i]["이름"].ToString());                
                series[i].Points.AddXY("공격", dt.Rows[i]["공격"]);
                series[i].Points.AddXY("수비", dt.Rows[i]["수비"]);
                series[i].Points.AddXY("스피드", dt.Rows[i]["스피드"]);
                series[i].Points.AddXY("패스", dt.Rows[i]["패스"]);
                series[i].Points.AddXY("슛", dt.Rows[i]["슛"]);
                series[i].ChartType = SeriesChartType.Radar;
                chart.Series.Add(series[i]);
            }
                
        }


    }
}
