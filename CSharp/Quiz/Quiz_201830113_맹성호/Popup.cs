using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Quiz
{
    public partial class Popup : Form
    {
        public Popup()
        {
            InitializeComponent();
        }

        public Popup(object[] value) : this()
        {
            for (int i = 0; i < value.Length; i++)
            {
                listBox.Items.Add(value[i].ToString().Trim());
            }
        }
    }
}
