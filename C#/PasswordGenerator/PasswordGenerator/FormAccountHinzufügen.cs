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
using System.Xml;
using System.Xml.Serialization;

namespace PasswordGenerator
{
    public partial class FormAccountHinzufügen : Form
    {
        public FormAccountHinzufügen()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            AccountListe accountListe = new AccountListe();
            String account = textBoxAccount.Text;
            String seite = textBoxSeite.Text;

            accountListe.writeAccount(account);
            accountListe.writeAccount(seite);


            this.Close();
        }

        private void butAbbrechen_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
