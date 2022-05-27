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

namespace WindowsFormsDB
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
            btnInsert.Click += BtnInsert_Click;
            btnSearch.Click += BtnSerach_Click;
            btnUpdate.Click += BtnUpdate_Click;
            btnDelete.Click += BtnDelete_Click;
            comDataGridView.CellClick += ComDataGridView_CellClick;
        }

        private void ComDataGridView_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            tbID.Text = comDataGridView.Rows[e.RowIndex].Cells[0].Value.ToString();
            tbName.Text = comDataGridView.Rows[e.RowIndex].Cells[1].Value.ToString();
            tbEmail.Text = comDataGridView.Rows[e.RowIndex].Cells[2].Value.ToString();
            tbDept.Text = comDataGridView.Rows[e.RowIndex].Cells[3].Value.ToString();
            tbJob.Text = comDataGridView.Rows[e.RowIndex].Cells[4].Value.ToString();
            tbLevel.Text = comDataGridView.Rows[e.RowIndex].Cells[5].Value.ToString();
            tbFlaType.Text = comDataGridView.Rows[e.RowIndex].Cells[6].Value.ToString();
            tbFlaValue.Text = comDataGridView.Rows[e.RowIndex].Cells[7].Value.ToString();
            tbFlbType.Text = comDataGridView.Rows[e.RowIndex].Cells[8].Value.ToString();
            tbFlbValue.Text = comDataGridView.Rows[e.RowIndex].Cells[9].Value.ToString();
            tbScore.Text = comDataGridView.Rows[e.RowIndex].Cells[10].Value.ToString();
            tbSalary.Text = comDataGridView.Rows[e.RowIndex].Cells[11].Value.ToString();
        }

        private static string mySqlConnStr = "Server=127.0.0.1;Database=winprog;Uid=devCom;Pwd=!pass1308;";
        DataSet ds;

        private void BtnDelete_Click(object sender, EventArgs e)
        {
            MySqlConnection conn = new MySqlConnection(mySqlConnStr);
            conn.Open();

            StringBuilder sb = new StringBuilder();
            sb.Append(" delete from mycompany1 ");
            sb.Append(" where id = '"); 
            sb.Append(tbID.Text);
            sb.Append("'");

            string sql = sb.ToString();

            MySqlCommand cmd = new MySqlCommand(sql, conn);
            cmd.ExecuteNonQuery();

            Search();
        }

        private void BtnUpdate_Click(object sender, EventArgs e)
        {
            try {
                MySqlConnection conn = new MySqlConnection(mySqlConnStr);
                conn.Open();

                StringBuilder sb = new StringBuilder();
                sb.Append(" update mycompany1 ");
                sb.Append(" set ");
                sb.Append(" name = '"); sb.Append(tbName.Text); sb.Append("', ");
                sb.Append(" email = '"); sb.Append(tbEmail.Text); sb.Append("', ");
                sb.Append(" dept = '"); sb.Append(tbDept.Text); sb.Append("', ");
                sb.Append(" job = '"); sb.Append(tbJob.Text); sb.Append("', ");
                sb.Append(" level = '"); sb.Append(tbLevel.Text); sb.Append("', ");
                sb.Append(" fla_type = '"); sb.Append(tbFlaType.Text); sb.Append("', ");
                sb.Append(" fla_value = '"); sb.Append(tbFlaValue.Text); sb.Append("', ");
                sb.Append(" flb_type = '"); sb.Append(tbFlbType.Text); sb.Append("', ");
                sb.Append(" flb_value = '"); sb.Append(tbFlbValue.Text); sb.Append("', ");
                sb.Append(" score = '"); sb.Append(tbScore.Text); sb.Append("', ");
                sb.Append(" salary = '"); sb.Append(tbSalary.Text); sb.Append("'");
                sb.Append(" where "); sb.Append(" id = '"); sb.Append(tbID.Text); sb.Append("'");

                string sql = sb.ToString();

                MySqlCommand cmd = new MySqlCommand(sql, conn);
                cmd.ExecuteNonQuery();

                Search();
            }
            catch(Exception ex) {
                Console.WriteLine(ex.Message);
            }
        }
        private void BtnInsert_Click(object sender, EventArgs e)
        {
            try
            {
                MySqlConnection conn = new MySqlConnection(mySqlConnStr);
                conn.Open();

                StringBuilder sb = new StringBuilder();

                sb.Append("insert into mycompany1 values (");
                sb.Append(" '"); sb.Append(tbID.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbName.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbEmail.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbDept.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbJob.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbLevel.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbFlaType.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbFlaValue.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbFlbType.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbFlbValue.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbScore.Text); sb.Append("', ");
                sb.Append(" '"); sb.Append(tbSalary.Text); sb.Append("' ");
                sb.Append(" ) ");

                string sql = sb.ToString();

                MySqlCommand cmd = new MySqlCommand(sql, conn);
                cmd.ExecuteNonQuery();

                Search();
            }
            catch (Exception ex) { 
                Console.WriteLine(ex.Message); 
            }
        }

       

        private void BtnSerach_Click(object sender, EventArgs e)
        {
            Search();
        }

        private void Search()
        {
            try
            {
                ds = new DataSet();
                MySqlConnection conn = new MySqlConnection(mySqlConnStr);
                conn.Open();

                //전체 조회
                //string sql = "select * from mycompany1";
                string sql = "select id as ID, name as 이름, email as 이메일, dept as 부서, job as 직군, level as 직급, " +
                             "fla_type as 영어, fla_value as 점수, flb_type as 제2외국어, flb_value as 제2외국어점수," +
                             "score as 차년도업적등급, salary as 연봉 from mycompany1";

                MySqlDataAdapter adapter = new MySqlDataAdapter(sql, conn);
                adapter.Fill(ds, "mycompany1");

                comDataGridView.DataSource = ds.Tables[0];
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }
        }
    }
}