namespace PasswordGenerator
{
    partial class Form1
    {
        /// <summary>
        /// Erforderliche Designervariable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Verwendete Ressourcen bereinigen.
        /// </summary>
        /// <param name="disposing">True, wenn verwaltete Ressourcen gelöscht werden sollen; andernfalls False.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Vom Windows Form-Designer generierter Code

        /// <summary>
        /// Erforderliche Methode für die Designerunterstützung.
        /// Der Inhalt der Methode darf nicht mit dem Code-Editor geändert werden.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.PasswortTextBox = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.optionenToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.seiteHinzufügenToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.Seite = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.Account = new System.Windows.Forms.ComboBox();
            this.generieren = new System.Windows.Forms.Button();
            this.toolTip1 = new System.Windows.Forms.ToolTip(this.components);
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // PasswortTextBox
            // 
            this.PasswortTextBox.Location = new System.Drawing.Point(79, 39);
            this.PasswortTextBox.Name = "PasswortTextBox";
            this.PasswortTextBox.Size = new System.Drawing.Size(121, 20);
            this.PasswortTextBox.TabIndex = 0;
            this.PasswortTextBox.TextChanged += new System.EventHandler(this.PasswortTextBox_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(9, 39);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(50, 13);
            this.label1.TabIndex = 3;
            this.label1.Text = "Passwort";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 83);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(47, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "Account";
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.optionenToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(262, 24);
            this.menuStrip1.TabIndex = 6;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // optionenToolStripMenuItem
            // 
            this.optionenToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.seiteHinzufügenToolStripMenuItem});
            this.optionenToolStripMenuItem.Name = "optionenToolStripMenuItem";
            this.optionenToolStripMenuItem.Size = new System.Drawing.Size(69, 20);
            this.optionenToolStripMenuItem.Text = "Optionen";
            // 
            // seiteHinzufügenToolStripMenuItem
            // 
            this.seiteHinzufügenToolStripMenuItem.Name = "seiteHinzufügenToolStripMenuItem";
            this.seiteHinzufügenToolStripMenuItem.Size = new System.Drawing.Size(154, 22);
            this.seiteHinzufügenToolStripMenuItem.Text = "Neuer Account";
            this.seiteHinzufügenToolStripMenuItem.Click += new System.EventHandler(this.seiteHinzufügenToolStripMenuItem_Click);
            // 
            // Seite
            // 
            this.Seite.FormattingEnabled = true;
            this.Seite.Location = new System.Drawing.Point(79, 124);
            this.Seite.Name = "Seite";
            this.Seite.Size = new System.Drawing.Size(121, 21);
            this.Seite.TabIndex = 7;
            this.Seite.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(12, 124);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(31, 13);
            this.label3.TabIndex = 8;
            this.label3.Text = "Seite";
            // 
            // Account
            // 
            this.Account.FormattingEnabled = true;
            this.Account.Location = new System.Drawing.Point(79, 83);
            this.Account.Name = "Account";
            this.Account.Size = new System.Drawing.Size(121, 21);
            this.Account.TabIndex = 9;
            this.Account.SelectedIndexChanged += new System.EventHandler(this.Account_SelectedIndexChanged);
            // 
            // generieren
            // 
            this.generieren.Enabled = false;
            this.generieren.Location = new System.Drawing.Point(79, 169);
            this.generieren.Name = "generieren";
            this.generieren.Size = new System.Drawing.Size(121, 23);
            this.generieren.TabIndex = 10;
            this.generieren.Text = "Generieren";
            this.generieren.UseVisualStyleBackColor = true;
            this.generieren.Click += new System.EventHandler(this.button3_Click);
            // 
            // toolTip1
            // 
            this.toolTip1.ToolTipTitle = "Passwort wird generiert und in die Zwischenablage kopiert";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(262, 207);
            this.Controls.Add(this.generieren);
            this.Controls.Add(this.Account);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.Seite);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.PasswortTextBox);
            this.Controls.Add(this.menuStrip1);
            this.Cursor = System.Windows.Forms.Cursors.Default;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.Fixed3D;
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Passwort Generator";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox PasswortTextBox;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem optionenToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem seiteHinzufügenToolStripMenuItem;
        private System.Windows.Forms.ComboBox Seite;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox Account;
        private System.Windows.Forms.Button generieren;
        private System.Windows.Forms.ToolTip toolTip1;
    }
}

