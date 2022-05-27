namespace WindowsFormsDB
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.panel1 = new System.Windows.Forms.Panel();
            this.btnSerach = new System.Windows.Forms.Button();
            this.panel2 = new System.Windows.Forms.Panel();
            this.dataGridView = new System.Windows.Forms.DataGridView();
            this.cbDept = new System.Windows.Forms.CheckBox();
            this.cbJob = new System.Windows.Forms.CheckBox();
            this.cbLevel = new System.Windows.Forms.CheckBox();
            this.cbSalary = new System.Windows.Forms.CheckBox();
            this.tbInput = new System.Windows.Forms.TextBox();
            this.cbEmail = new System.Windows.Forms.CheckBox();
            this.cbName = new System.Windows.Forms.CheckBox();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.tbInput);
            this.panel1.Controls.Add(this.cbSalary);
            this.panel1.Controls.Add(this.cbLevel);
            this.panel1.Controls.Add(this.cbJob);
            this.panel1.Controls.Add(this.cbDept);
            this.panel1.Controls.Add(this.cbEmail);
            this.panel1.Controls.Add(this.cbName);
            this.panel1.Controls.Add(this.btnSerach);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(800, 73);
            this.panel1.TabIndex = 0;
            // 
            // btnSerach
            // 
            this.btnSerach.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnSerach.Location = new System.Drawing.Point(691, 12);
            this.btnSerach.Name = "btnSerach";
            this.btnSerach.Size = new System.Drawing.Size(97, 46);
            this.btnSerach.TabIndex = 0;
            this.btnSerach.Text = "Search";
            this.btnSerach.UseVisualStyleBackColor = true;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.dataGridView);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel2.Location = new System.Drawing.Point(0, 73);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(800, 377);
            this.panel2.TabIndex = 1;
            // 
            // dataGridView
            // 
            this.dataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView.Location = new System.Drawing.Point(0, 0);
            this.dataGridView.Name = "dataGridView";
            this.dataGridView.RowTemplate.Height = 23;
            this.dataGridView.Size = new System.Drawing.Size(800, 377);
            this.dataGridView.TabIndex = 0;
            // 
            // cbDept
            // 
            this.cbDept.AutoSize = true;
            this.cbDept.Location = new System.Drawing.Point(135, 28);
            this.cbDept.Name = "cbDept";
            this.cbDept.Size = new System.Drawing.Size(48, 16);
            this.cbDept.TabIndex = 3;
            this.cbDept.Text = "dept";
            this.cbDept.UseVisualStyleBackColor = true;
            // 
            // cbJob
            // 
            this.cbJob.AutoSize = true;
            this.cbJob.Location = new System.Drawing.Point(189, 28);
            this.cbJob.Name = "cbJob";
            this.cbJob.Size = new System.Drawing.Size(41, 16);
            this.cbJob.TabIndex = 4;
            this.cbJob.Text = "job";
            this.cbJob.UseVisualStyleBackColor = true;
            // 
            // cbLevel
            // 
            this.cbLevel.AutoSize = true;
            this.cbLevel.Location = new System.Drawing.Point(236, 28);
            this.cbLevel.Name = "cbLevel";
            this.cbLevel.Size = new System.Drawing.Size(50, 16);
            this.cbLevel.TabIndex = 5;
            this.cbLevel.Text = "level";
            this.cbLevel.UseVisualStyleBackColor = true;
            // 
            // cbSalary
            // 
            this.cbSalary.AutoSize = true;
            this.cbSalary.Location = new System.Drawing.Point(292, 28);
            this.cbSalary.Name = "cbSalary";
            this.cbSalary.Size = new System.Drawing.Size(59, 16);
            this.cbSalary.TabIndex = 6;
            this.cbSalary.Text = "salary";
            this.cbSalary.UseVisualStyleBackColor = true;
            // 
            // tbInput
            // 
            this.tbInput.Location = new System.Drawing.Point(357, 26);
            this.tbInput.Name = "tbInput";
            this.tbInput.Size = new System.Drawing.Size(251, 21);
            this.tbInput.TabIndex = 7;
            // 
            // cbEmail
            // 
            this.cbEmail.AutoSize = true;
            this.cbEmail.Location = new System.Drawing.Point(74, 28);
            this.cbEmail.Name = "cbEmail";
            this.cbEmail.Size = new System.Drawing.Size(55, 16);
            this.cbEmail.TabIndex = 2;
            this.cbEmail.Text = "email";
            this.cbEmail.UseVisualStyleBackColor = true;
            // 
            // cbName
            // 
            this.cbName.AutoSize = true;
            this.cbName.Location = new System.Drawing.Point(12, 28);
            this.cbName.Name = "cbName";
            this.cbName.Size = new System.Drawing.Size(56, 16);
            this.cbName.TabIndex = 1;
            this.cbName.Text = "name";
            this.cbName.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button btnSerach;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.DataGridView dataGridView;
        private System.Windows.Forms.CheckBox cbSalary;
        private System.Windows.Forms.CheckBox cbLevel;
        private System.Windows.Forms.CheckBox cbJob;
        private System.Windows.Forms.CheckBox cbDept;
        private System.Windows.Forms.TextBox tbInput;
        private System.Windows.Forms.CheckBox cbEmail;
        private System.Windows.Forms.CheckBox cbName;
    }
}

