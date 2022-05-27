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

namespace WindowsFormsAppEx
{
    public partial class MyForm : Form //My Form extend Form
    {
        public MyForm()
        {
            InitializeComponent();
            btnPopup.Click += BtnPopup_Click;
        }

        private void BtnPopup_Click(object sender, EventArgs e)
        {
            ArrayList arrayList = new ArrayList();

            if (cbApple.Checked) {
                arrayList.Add(cbApple.Text);
            }
            if (cbPoire.Checked)
            {
                arrayList.Add(cbPoire.Text);
            }
            if (cbBerry.Checked)
            {
                arrayList.Add(cbBerry.Text);
            }
            if (cbGrape.Checked)
            {
                arrayList.Add(cbGrape.Text);
            }

            MyPopupForm myPopupForm = new MyPopupForm(arrayList.ToArray());
            myPopupForm.ShowDialog();
        }
    }
}
