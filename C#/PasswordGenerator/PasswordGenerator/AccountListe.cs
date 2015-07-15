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
        public List<String> accountListe = new List<String>();


       //  Lese-Code
        public List<String> readAccount()
        {
            FileStream fs = new FileStream(@"Account\account.xml", FileMode.Open); ;
            XmlSerializer formatter = new XmlSerializer(typeof(String));
            accountListe = (List<String>)formatter.Deserialize(fs);

            foreach (String name in accountListe)
            {
                Console.WriteLine(name);
            }
            return accountListe;
        }


        // Schreib-Code
        public void writeAccount(String account)
        {

            FileStream stream;
            stream = new FileStream(@"Account\account.xml", FileMode.Append);
            XmlSerializer formatter = new XmlSerializer(typeof(String));
            formatter.Serialize(stream, account);
            stream.Close();

        }


    }


}
