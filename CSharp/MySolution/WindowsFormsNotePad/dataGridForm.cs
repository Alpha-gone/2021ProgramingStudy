using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsNotePad
{
    public partial class dataGridForm : Form
    {
        public dataGridForm()
        {
            InitializeComponent();
            btnInit.Click += BtnInit_Click;
            btnAdd.Click += BtnAdd_Click;
            btnRemove.Click += BtnRemove_Click;
            analysisDataGrid.CellClick += AnalysisDataGrid_CellClick;
        }

       

        int row = 1, rowIndex;
        DataTable dt = new DataTable();
        Random rand = new Random();

        private void AnalysisDataGrid_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            rowIndex = e.RowIndex;
            lbSelectedData.Text = analysisDataGrid.Rows[e.RowIndex].Cells[e.ColumnIndex].Value.ToString();
        }
        private void BtnInit_Click(object sender, EventArgs e)
        {
            dt.Columns.Add("SEQ");
            dt.Columns.Add("ID");

            for (int j = 1; j <= 4; j++) {
                dt.Columns.Add("P_" + j.ToString());
            }
            
            for(row = 1; row <= 10; row++)
            {
                dt.Rows.Add(row.ToString(), "s" + row.ToString(),
                    rand.NextDouble().ToString(),
                    rand.NextDouble().ToString(),
                    rand.NextDouble().ToString(),
                    rand.NextDouble().ToString());
            }

            analysisDataGrid.DataSource = dt;
        }
        
        private void BtnAdd_Click(object sender, EventArgs e)
        {
            dt.Rows.Add(row.ToString(), "s" + row.ToString(),
                    rand.NextDouble().ToString(),
                    rand.NextDouble().ToString(),
                    rand.NextDouble().ToString(),
                    rand.NextDouble().ToString());

            row++;
        }

        private void BtnRemove_Click(object sender, EventArgs e)
        {
            dt.Rows.RemoveAt(analysisDataGrid.CurrentCell.RowIndex);
            //dt.Rows.RemoveAt(rowIndex);d
        }




    }
}
