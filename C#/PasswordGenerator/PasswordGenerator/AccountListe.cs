using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Serialization;

namespace PasswordGenerator
{
    class AccountListe
    {
        public List<string> accountListe = new List<string>();


       //  Lese-Code
        public List<string> readAccount()
        {
            FileStream fs = new FileStream(@"Account\account.xml", FileMode.Open); ;
            XmlSerializer formatter = new XmlSerializer(typeof(string));
            accountListe = (List<string>)formatter.Deserialize(fs);

            foreach (string name in accountListe)
            {
                MessageBox.Show(name);
            }
            return accountListe;
        }


        // Schreib-Code
        public void writeAccount(string account)
        {

            FileStream stream;
            stream = new FileStream(@"Account\account.xml", FileMode.Append);
            XmlSerializer formatter = new XmlSerializer(typeof(string));
            formatter.Serialize(stream, account);
            stream.Close();

        }


    }


}
