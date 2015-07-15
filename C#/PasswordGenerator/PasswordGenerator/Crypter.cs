﻿using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace PasswordGenerator
{
    class Crypter
    {
        private String cryptPasswort = "";
        private String cryptAccount = "";
        private String cryptSeite = "";

        public void setPasswort(String passwort)
        {
            this.cryptPasswort = passwort;
        }

        public void setAccount(String account)
        {
            this.cryptAccount = account;
        }

        public void setSeite(String seite)
        {
            this.cryptSeite = seite;
        }

        public String getPasswort()
        {
            return this.cryptPasswort;
        }

        public String getAccount()
        {
            return this.cryptAccount;
        }

        public String getSeite()
        {
            return this.cryptSeite;
        }


        //Muss noch in void geändert werden, wenn alle Test abgeschlossen sind 
        public String crypt()
        {
            String accountSeiteEncrypt = EncryptText(getAccount(), getSeite());
            String fullEncrypt = EncryptText(accountSeiteEncrypt, getPasswort());
            fullEncrypt = fullEncrypt.Substring(0, 16);
            System.Windows.Forms.Clipboard.SetText(fullEncrypt);
            return fullEncrypt;
        }

        private string EncryptText(string input, string password)
        {
            // Get the bytes of the string
            byte[] bytesToBeEncrypted = Encoding.UTF8.GetBytes(input);
            byte[] passwordBytes = Encoding.UTF8.GetBytes(password);

            // Hash the password with SHA256
            passwordBytes = SHA256.Create().ComputeHash(passwordBytes);

            byte[] bytesEncrypted = AES_Encrypt(bytesToBeEncrypted, passwordBytes);

            string result = Convert.ToBase64String(bytesEncrypted);

            return result;
        }

        private byte[] AES_Encrypt(byte[] bytesToBeEncrypted, byte[] passwordBytes)
        {
            byte[] encryptedBytes = null;

            // Set your salt here, change it to meet your flavor:
            // The salt bytes must be at least 8 bytes.
            byte[] saltBytes = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };

            using (MemoryStream ms = new MemoryStream())
            {
                using (RijndaelManaged AES = new RijndaelManaged())
                {
                    AES.KeySize = 256;
                    AES.BlockSize = 128;

                    var key = new Rfc2898DeriveBytes(passwordBytes, saltBytes, 1000);
                    AES.Key = key.GetBytes(AES.KeySize / 8);
                    AES.IV = key.GetBytes(AES.BlockSize / 8);

                    AES.Mode = CipherMode.CBC;

                    using (var cs = new CryptoStream(ms, AES.CreateEncryptor(), CryptoStreamMode.Write))
                    {
                        cs.Write(bytesToBeEncrypted, 0, bytesToBeEncrypted.Length);
                        cs.Close();
                    }
                    encryptedBytes = ms.ToArray();
                }
            }

            return encryptedBytes;
        }

    }
}
