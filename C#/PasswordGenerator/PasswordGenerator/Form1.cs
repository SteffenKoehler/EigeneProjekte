using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml;

namespace PasswordGenerator
{
    public partial class Form1 : Form
        

    {
        Crypter crypter = new Crypter();
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
            crypter.setPasswort(PasswortTextBox.Text);
            crypter.setAccount(Account.Text);
            crypter.setSeite(Seite.Text);

            crypter.crypt();

            Console.WriteLine(crypter.getPasswort());
            Console.WriteLine(crypter.getAccount());
            Console.WriteLine(crypter.getSeite());
            Console.WriteLine(crypter.crypt());

            String message = "Das Passwort wurde in die Zwichenablage kopiert und kann mit Strg+V eingefügt werden";
            MessageBox.Show(message);
        }

        private void Account_SelectedIndexChanged(object sender, EventArgs e)
        {


            XmlDocument doc = new XmlDocument();

           // Path of the XMl file
            doc.Load(@"C:\Users\Steffen\Documents\GitHub\EigeneProjekte\C#\PasswordGenerator\PasswordGenerator\bin\Debug\Account\account.xml");
           //  Read the node of the XML
            XmlNodeList RequestTypeNodes = doc.GetElementsByTagName("RequestTypeDetails");
           //  Make a object of list type
            List<string> RequestTypeMails = new List<string>();

           //  Read the XML child node and fill the List
            foreach (XmlNode node in RequestTypeNodes[0].ChildNodes)
            {
                RequestTypeMails.Add(node.InnerText);
            }
           //  Bind the data of the list to the combo box(cmbRequestType)
            Account.Items.AddRange(RequestTypeMails.ToArray());



            AccountListe accountListe = new AccountListe();
            List<string> accountName     = accountListe.readAccount();

            foreach (string account in accountName)
            {
                Account.Items.Add(account);
            }

        }

        private void seiteHinzufügenToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormAccountHinzufügen formAcc = new FormAccountHinzufügen();
            formAcc.Show();
        }
    }
}
