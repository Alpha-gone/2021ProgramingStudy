
namespace Quiz
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
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.comboBox = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.tbName = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.tbNum = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.btnQ3 = new System.Windows.Forms.Button();
            this.tbQ2Input = new System.Windows.Forms.TextBox();
            this.btnQ2 = new System.Windows.Forms.Button();
            this.tbQ2Result = new System.Windows.Forms.TextBox();
            this.tbQ1Input = new System.Windows.Forms.TextBox();
            this.btnQ1 = new System.Windows.Forms.Button();
            this.dataGridView = new System.Windows.Forms.DataGridView();
            this.groupBox1.SuspendLayout();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.panel1);
            this.groupBox1.Controls.Add(this.dataGridView);
            this.groupBox1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.groupBox1.Font = new System.Drawing.Font("굴림", 14F);
            this.groupBox1.Location = new System.Drawing.Point(0, 0);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(800, 450);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "컴퓨터소프트웨어학과 맹성호";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.comboBox);
            this.panel1.Controls.Add(this.label4);
            this.panel1.Controls.Add(this.label3);
            this.panel1.Controls.Add(this.tbName);
            this.panel1.Controls.Add(this.label2);
            this.panel1.Controls.Add(this.tbNum);
            this.panel1.Controls.Add(this.label1);
            this.panel1.Controls.Add(this.btnQ3);
            this.panel1.Controls.Add(this.tbQ2Input);
            this.panel1.Controls.Add(this.btnQ2);
            this.panel1.Controls.Add(this.tbQ2Result);
            this.panel1.Controls.Add(this.tbQ1Input);
            this.panel1.Controls.Add(this.btnQ1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel1.Location = new System.Drawing.Point(3, 25);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(794, 272);
            this.panel1.TabIndex = 1;
            // 
            // comboBox
            // 
            this.comboBox.Font = new System.Drawing.Font("굴림", 15F);
            this.comboBox.FormattingEnabled = true;
            this.comboBox.Location = new System.Drawing.Point(590, 227);
            this.comboBox.Name = "comboBox";
            this.comboBox.Size = new System.Drawing.Size(161, 28);
            this.comboBox.TabIndex = 12;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("굴림", 15F);
            this.label4.Location = new System.Drawing.Point(535, 230);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(49, 20);
            this.label4.TabIndex = 11;
            this.label4.Text = "평점";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("굴림", 13F);
            this.label3.Location = new System.Drawing.Point(351, 231);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(44, 18);
            this.label3.TabIndex = 10;
            this.label3.Text = "이름";
            // 
            // tbName
            // 
            this.tbName.Font = new System.Drawing.Font("굴림", 9F);
            this.tbName.Location = new System.Drawing.Point(401, 230);
            this.tbName.Name = "tbName";
            this.tbName.Size = new System.Drawing.Size(118, 21);
            this.tbName.TabIndex = 9;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("굴림", 13F);
            this.label2.Location = new System.Drawing.Point(185, 230);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(44, 18);
            this.label2.TabIndex = 8;
            this.label2.Text = "학번";
            // 
            // tbNum
            // 
            this.tbNum.Font = new System.Drawing.Font("굴림", 9F);
            this.tbNum.Location = new System.Drawing.Point(235, 228);
            this.tbNum.Name = "tbNum";
            this.tbNum.Size = new System.Drawing.Size(110, 21);
            this.tbNum.TabIndex = 7;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("굴림", 20F);
            this.label1.Location = new System.Drawing.Point(55, 149);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(88, 27);
            this.label1.TabIndex = 6;
            this.label1.Text = "Result";
            // 
            // btnQ3
            // 
            this.btnQ3.AutoSize = true;
            this.btnQ3.Font = new System.Drawing.Font("굴림", 20F);
            this.btnQ3.Location = new System.Drawing.Point(26, 228);
            this.btnQ3.Name = "btnQ3";
            this.btnQ3.Size = new System.Drawing.Size(117, 37);
            this.btnQ3.TabIndex = 4;
            this.btnQ3.Text = "문제3";
            this.btnQ3.UseVisualStyleBackColor = true;
            // 
            // tbQ2Input
            // 
            this.tbQ2Input.Font = new System.Drawing.Font("굴림", 20F);
            this.tbQ2Input.Location = new System.Drawing.Point(158, 82);
            this.tbQ2Input.Name = "tbQ2Input";
            this.tbQ2Input.Size = new System.Drawing.Size(516, 38);
            this.tbQ2Input.TabIndex = 3;
            // 
            // btnQ2
            // 
            this.btnQ2.AutoSize = true;
            this.btnQ2.Font = new System.Drawing.Font("굴림", 20F);
            this.btnQ2.Location = new System.Drawing.Point(26, 83);
            this.btnQ2.Name = "btnQ2";
            this.btnQ2.Size = new System.Drawing.Size(117, 37);
            this.btnQ2.TabIndex = 2;
            this.btnQ2.Text = "문제2";
            this.btnQ2.UseVisualStyleBackColor = true;
            // 
            // tbQ2Result
            // 
            this.tbQ2Result.Font = new System.Drawing.Font("굴림", 20F);
            this.tbQ2Result.Location = new System.Drawing.Point(158, 146);
            this.tbQ2Result.Name = "tbQ2Result";
            this.tbQ2Result.Size = new System.Drawing.Size(246, 38);
            this.tbQ2Result.TabIndex = 3;
            // 
            // tbQ1Input
            // 
            this.tbQ1Input.Font = new System.Drawing.Font("굴림", 20F);
            this.tbQ1Input.Location = new System.Drawing.Point(158, 28);
            this.tbQ1Input.Name = "tbQ1Input";
            this.tbQ1Input.Size = new System.Drawing.Size(516, 38);
            this.tbQ1Input.TabIndex = 1;
            // 
            // btnQ1
            // 
            this.btnQ1.AutoSize = true;
            this.btnQ1.Font = new System.Drawing.Font("굴림", 20F);
            this.btnQ1.Location = new System.Drawing.Point(26, 29);
            this.btnQ1.Name = "btnQ1";
            this.btnQ1.Size = new System.Drawing.Size(117, 37);
            this.btnQ1.TabIndex = 0;
            this.btnQ1.Text = "문제1";
            this.btnQ1.UseVisualStyleBackColor = true;
            // 
            // dataGridView
            // 
            this.dataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.dataGridView.Location = new System.Drawing.Point(3, 297);
            this.dataGridView.Name = "dataGridView";
            this.dataGridView.RowTemplate.Height = 23;
            this.dataGridView.Size = new System.Drawing.Size(794, 150);
            this.dataGridView.TabIndex = 0;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.groupBox1);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.Text = "맹성호 퀴즈";
            this.groupBox1.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnQ3;
        private System.Windows.Forms.TextBox tbQ2Input;
        private System.Windows.Forms.Button btnQ2;
        private System.Windows.Forms.TextBox tbQ2Result;
        private System.Windows.Forms.TextBox tbQ1Input;
        private System.Windows.Forms.Button btnQ1;
        private System.Windows.Forms.DataGridView dataGridView;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox tbName;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox tbNum;
        private System.Windows.Forms.ComboBox comboBox;
    }
}

