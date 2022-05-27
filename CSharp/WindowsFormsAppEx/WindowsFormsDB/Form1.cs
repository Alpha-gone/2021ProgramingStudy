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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            btnSerach.Click += BtnSerach_Click;
        }


        private static string mySqlConnStr = "Server=127.0.0.1;Database=winprog;Uid=devCom;Pwd=!pass1308;";
        DataSet ds;

        private void BtnSerach_Click(object sender, EventArgs e)
        {
            try
            {
                //데이터 공간 생성
                ds = new DataSet();
                //접속하기
                MySqlConnection conn = new MySqlConnection(mySqlConnStr);
                //오픈
                conn.Open();
                
                //전체 조회
                //string sql = "select * from mycompany1";

                //salary가 3000이상 5000미만인 id, name, dept, job, level, salary
                //string sql = "select id, name, dept, job, level, salary from mycompany1" +
                //             "where 3000 <= salary and salary < 5000";


                StringBuilder sb = new StringBuilder();

                sb.Append("select id as ID");

                if (cbName.Checked) sb.Append(", name as 이름");
                if (cbEmail.Checked) sb.Append(", email as 이메일");
                if (cbDept.Checked) sb.Append(", dept as 부서");
                if (cbJob.Checked) sb.Append(", job as 직군");
                if (cbLevel.Checked) sb.Append(", level as 지위");
                if (cbSalary.Checked)
                {
                    sb.Append(", salary as 연봉");
                }

                sb.Append(" from mycompany1");

                sb.Append(" where 1 = 1 ");

                if (!string.IsNullOrEmpty(tbInput.Text)) {
                    sb.Append(" and ");
                    sb.Append(tbInput.Text);
                }       
  
                String sql = sb.ToString();

                //비연결 모드 DB 연결
                //비연결 모드 : 데이터베이스에서 가져온 값을 클라이언트 메모리로 저장한 후, 연결을 끊는 방식
                //즉, 데이터를 가져와서 본 프로그램의 연결 공간에 데이터 저장
                MySqlDataAdapter adpt = new MySqlDataAdapter(sql, conn);
                //DataSet내에 mycompany1이라는 Table 공간을 만들어 저장
                //즉, DataSource는 여러개의 DataTable을 가질 수 있음
                adpt.Fill(ds, "mycompany1");
                dataGridView.DataSource = ds.Tables[0];
            }
            catch (Exception ex) {
                Console.WriteLine(ex);
            }
        }
    }
}