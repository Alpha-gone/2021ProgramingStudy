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
    public partial class NotePadForm : Form
    {
        public NotePadForm()
        {
            InitializeComponent();
            btnOpen.Click += BtnOpen_Click;
            btnSave.Click += BtnSave_Click;
        }

        private void BtnSave_Click(object sender, EventArgs e)
        {
            saveFileDialog.Filter = "텍스트 파일 (*.txt)|*.txt ";
            if (saveFileDialog.ShowDialog() == DialogResult.OK) {
                StreamWriter sw = new StreamWriter(saveFileDialog.FileName, 
                                                    false, Encoding.Default);
                sw.Write(txtContent.Text);
                sw.Close();
            }
            
        }

        private void BtnOpen_Click(object sender, EventArgs e)
        {
            openFileDialog.Filter = "텍스트 파일 (*.txt)|*.txt ";
            if(openFileDialog.ShowDialog() == DialogResult.OK)
            {
                StreamReader sr = new StreamReader(openFileDialog.FileName,
                                                    Encoding.Default);

                txtContent.Text = sr.ReadToEnd();
                sr.Close();
            }
        }
    }
}
