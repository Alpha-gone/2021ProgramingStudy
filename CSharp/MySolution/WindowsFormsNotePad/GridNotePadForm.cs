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
    public partial class GridNotePadForm : Form
    {
        public GridNotePadForm()
        {
            InitializeComponent();
            DataGridViewSetup();
            btnOpen.Click += BtnOpen_Click;
            btnSave.Click += BtnSave_Click;
            btnAdd.Click += BtnAdd_Click;
            btnDelete.Click += BtnDelete_Click;
        }

        private void DataGridViewSetup()
        {
            dataGridView.ColumnCount = 5;
            dataGridView.Columns[0].Name = "이름";
            dataGridView.Columns[1].Name = "전화번호";
            dataGridView.Columns[2].Name = "소속";
            dataGridView.Columns[3].Name = "관계";
            dataGridView.Columns[4].Name = "비고";
        }

        private void DataGridViewSetup(string rowValue)
        {
            dataGridView.Columns.Clear();
            string[] columns = rowValue.Split(',');
            dataGridView.ColumnCount = columns.Length;
            for (int i = 0; i < dataGridView.ColumnCount; i++)
            {
                dataGridView.Columns[i].Name = columns[i];
            }
            
        }
        private void BtnDelete_Click(object sender, EventArgs e)
        {
            dataGridView.Rows.RemoveAt(dataGridView.CurrentCell.RowIndex);
        }

        private void BtnAdd_Click(object sender, EventArgs e)
        {
            dataGridView.Rows.Add();
        }

        private void BtnSave_Click(object sender, EventArgs e)
        {
            saveFileDialog.Filter = "CSV(*.csv))|*.csv";
            if (saveFileDialog.ShowDialog() == DialogResult.OK) {
                StreamWriter sw = new StreamWriter(saveFileDialog.FileName, 
                                                    false, Encoding.Default);
                string strHeader = "";
                for(int i = 0; i < dataGridView.ColumnCount; i++)
                {
                    strHeader += dataGridView.Columns[i].HeaderText;
                    if(i < dataGridView.ColumnCount - 1)
                    {
                        strHeader += ","; 
                    }
                }
                sw.WriteLine(strHeader);
                for(int i = 0; i < dataGridView.RowCount; i++)
                {
                    string strRowValue = "";
                    for(int j = 0; j < dataGridView.ColumnCount; j++)
                    {
                        strRowValue += dataGridView.Rows[i].Cells[j].Value;
                        if (j < dataGridView.ColumnCount - 1)
                        {
                            strRowValue += ",";
                        }
                    }
                    sw.WriteLine(strRowValue);
                }

                sw.Close();
            }
            
        }

        private void BtnOpen_Click(object sender, EventArgs e)
        {
            openFileDialog.Filter = "CSV(*.csv))|*.csv";
            if(openFileDialog.ShowDialog() == DialogResult.OK)
            {
                

                StreamReader sr = new StreamReader(openFileDialog.FileName,
                                                    Encoding.Default);

                string rowvalue = sr.ReadLine();
                DataGridViewSetup(rowvalue);
                string[] cellValue;
                dataGridView.Rows.Clear();
                while(sr.Peek() != -1)
                {
                    rowvalue = sr.ReadLine();
                    cellValue = rowvalue.Split(',');
                    dataGridView.Rows.Add(cellValue);
                }

                sr.Close();
            }
        }
    }
}
