using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PasswordGenerator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

 

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void PasswortTextBox_TextChanged(object sender, EventArgs e)
        {
            generieren.Enabled = true;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            String passwort = PasswortTextBox.Text;
            Crypter.setPasswort(passwort);
        }

        private void Account_SelectedIndexChanged(object sender, EventArgs e)
        {
            Account.Items.Add("steffen-koehler1@gmx.de");
        }
    }
}
