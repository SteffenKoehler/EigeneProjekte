namespace PasswordGenerator
{
    partial class FormAccountHinzufügen
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.butHinzufuegen = new System.Windows.Forms.Button();
            this.textBoxAccount = new System.Windows.Forms.TextBox();
            this.textBoxSeite = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.butAbbrechen = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // butHinzufuegen
            // 
            this.butHinzufuegen.Location = new System.Drawing.Point(39, 161);
            this.butHinzufuegen.Name = "butHinzufuegen";
            this.butHinzufuegen.Size = new System.Drawing.Size(75, 23);
            this.butHinzufuegen.TabIndex = 0;
            this.butHinzufuegen.Text = "Hinzufügen";
            this.butHinzufuegen.UseVisualStyleBackColor = true;
            this.butHinzufuegen.Click += new System.EventHandler(this.button1_Click);
            // 
            // textBoxAccount
            // 
            this.textBoxAccount.Location = new System.Drawing.Point(89, 56);
            this.textBoxAccount.Name = "textBoxAccount";
            this.textBoxAccount.Size = new System.Drawing.Size(143, 20);
            this.textBoxAccount.TabIndex = 1;
            // 
            // textBoxSeite
            // 
            this.textBoxSeite.Location = new System.Drawing.Point(89, 112);
            this.textBoxSeite.Name = "textBoxSeite";
            this.textBoxSeite.Size = new System.Drawing.Size(143, 20);
            this.textBoxSeite.TabIndex = 2;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(36, 56);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(47, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Account";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(36, 112);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(31, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "Seite";
            // 
            // butAbbrechen
            // 
            this.butAbbrechen.Location = new System.Drawing.Point(157, 161);
            this.butAbbrechen.Name = "butAbbrechen";
            this.butAbbrechen.Size = new System.Drawing.Size(75, 23);
            this.butAbbrechen.TabIndex = 5;
            this.butAbbrechen.Text = "Abbrechen";
            this.butAbbrechen.UseVisualStyleBackColor = true;
            this.butAbbrechen.Click += new System.EventHandler(this.butAbbrechen_Click);
            // 
            // FormAccountHinzufügen
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(271, 219);
            this.Controls.Add(this.butAbbrechen);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBoxSeite);
            this.Controls.Add(this.textBoxAccount);
            this.Controls.Add(this.butHinzufuegen);
            this.Name = "FormAccountHinzufügen";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Neuer Account";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button butHinzufuegen;
        private System.Windows.Forms.TextBox textBoxAccount;
        private System.Windows.Forms.TextBox textBoxSeite;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button butAbbrechen;
    }
}