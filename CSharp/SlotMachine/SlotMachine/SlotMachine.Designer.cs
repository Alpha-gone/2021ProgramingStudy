
namespace SlotMachine
{
    partial class SlotMachine
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
            this.lbTitle = new System.Windows.Forms.Label();
            this.panel3 = new System.Windows.Forms.Panel();
            this.lbResult = new System.Windows.Forms.Label();
            this.tbBat = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.lbMyWallet = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.btnStart = new System.Windows.Forms.Button();
            this.btnStop = new System.Windows.Forms.Button();
            this.panel4 = new System.Windows.Forms.Panel();
            this.lbSlot1_3 = new System.Windows.Forms.Label();
            this.lbSlot1_1 = new System.Windows.Forms.Label();
            this.lbSlot1_2 = new System.Windows.Forms.Label();
            this.panel5 = new System.Windows.Forms.Panel();
            this.lbSlot2_3 = new System.Windows.Forms.Label();
            this.lbSlot2_1 = new System.Windows.Forms.Label();
            this.lbSlot2_2 = new System.Windows.Forms.Label();
            this.panel6 = new System.Windows.Forms.Panel();
            this.lbSlot3_3 = new System.Windows.Forms.Label();
            this.lbSlot3_1 = new System.Windows.Forms.Label();
            this.lbSlot3_2 = new System.Windows.Forms.Label();
            this.panel2 = new System.Windows.Forms.Panel();
            this.panel7 = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.panel3.SuspendLayout();
            this.panel4.SuspendLayout();
            this.panel5.SuspendLayout();
            this.panel6.SuspendLayout();
            this.panel2.SuspendLayout();
            this.panel7.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.lbTitle);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(800, 94);
            this.panel1.TabIndex = 5;
            // 
            // lbTitle
            // 
            this.lbTitle.Dock = System.Windows.Forms.DockStyle.Fill;
            this.lbTitle.Font = new System.Drawing.Font("돋움", 48F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lbTitle.Location = new System.Drawing.Point(0, 0);
            this.lbTitle.Name = "lbTitle";
            this.lbTitle.Size = new System.Drawing.Size(800, 94);
            this.lbTitle.TabIndex = 0;
            this.lbTitle.Text = "**SLOT MACHINE**";
            this.lbTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.lbResult);
            this.panel3.Controls.Add(this.tbBat);
            this.panel3.Controls.Add(this.label3);
            this.panel3.Controls.Add(this.lbMyWallet);
            this.panel3.Controls.Add(this.label1);
            this.panel3.Controls.Add(this.btnStart);
            this.panel3.Controls.Add(this.btnStop);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel3.Location = new System.Drawing.Point(0, 344);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(800, 106);
            this.panel3.TabIndex = 7;
            // 
            // lbResult
            // 
            this.lbResult.Font = new System.Drawing.Font("돋움", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lbResult.Location = new System.Drawing.Point(213, 15);
            this.lbResult.Name = "lbResult";
            this.lbResult.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.lbResult.Size = new System.Drawing.Size(110, 19);
            this.lbResult.TabIndex = 6;
            // 
            // tbBat
            // 
            this.tbBat.Font = new System.Drawing.Font("돋움", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.tbBat.Location = new System.Drawing.Point(96, 44);
            this.tbBat.Name = "tbBat";
            this.tbBat.Size = new System.Drawing.Size(111, 29);
            this.tbBat.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("돋움", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label3.Location = new System.Drawing.Point(12, 54);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(78, 19);
            this.label3.TabIndex = 4;
            this.label3.Text = "내 베팅:";
            // 
            // lbMyWallet
            // 
            this.lbMyWallet.Font = new System.Drawing.Font("돋움", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lbMyWallet.Location = new System.Drawing.Point(97, 15);
            this.lbMyWallet.Name = "lbMyWallet";
            this.lbMyWallet.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.lbMyWallet.Size = new System.Drawing.Size(110, 19);
            this.lbMyWallet.TabIndex = 3;
            this.lbMyWallet.Text = "100000";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("돋움", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label1.Location = new System.Drawing.Point(13, 15);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(78, 19);
            this.label1.TabIndex = 2;
            this.label1.Text = "내 지갑:";
            // 
            // btnStart
            // 
            this.btnStart.Location = new System.Drawing.Point(499, 15);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(134, 79);
            this.btnStart.TabIndex = 1;
            this.btnStart.Text = "START";
            this.btnStart.UseVisualStyleBackColor = true;
            // 
            // btnStop
            // 
            this.btnStop.Location = new System.Drawing.Point(654, 15);
            this.btnStop.Name = "btnStop";
            this.btnStop.Size = new System.Drawing.Size(134, 79);
            this.btnStop.TabIndex = 0;
            this.btnStop.Text = "STOP";
            this.btnStop.UseVisualStyleBackColor = true;
            // 
            // panel4
            // 
            this.panel4.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.panel4.Controls.Add(this.lbSlot1_1);
            this.panel4.Controls.Add(this.lbSlot1_3);
            this.panel4.Location = new System.Drawing.Point(141, 0);
            this.panel4.Name = "panel4";
            this.panel4.Size = new System.Drawing.Size(116, 250);
            this.panel4.TabIndex = 11;
            // 
            // lbSlot1_3
            // 
            this.lbSlot1_3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.lbSlot1_3.Font = new System.Drawing.Font("돋움", 30F);
            this.lbSlot1_3.Location = new System.Drawing.Point(-3, 183);
            this.lbSlot1_3.Name = "lbSlot1_3";
            this.lbSlot1_3.Size = new System.Drawing.Size(122, 37);
            this.lbSlot1_3.TabIndex = 5;
            this.lbSlot1_3.Text = "1_3";
            this.lbSlot1_3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbSlot1_1
            // 
            this.lbSlot1_1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.lbSlot1_1.Font = new System.Drawing.Font("돋움", 30F);
            this.lbSlot1_1.Location = new System.Drawing.Point(-3, 25);
            this.lbSlot1_1.Name = "lbSlot1_1";
            this.lbSlot1_1.Size = new System.Drawing.Size(122, 37);
            this.lbSlot1_1.TabIndex = 3;
            this.lbSlot1_1.Text = "1_1";
            this.lbSlot1_1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbSlot1_2
            // 
            this.lbSlot1_2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.lbSlot1_2.Font = new System.Drawing.Font("돋움", 35F);
            this.lbSlot1_2.Location = new System.Drawing.Point(123, 0);
            this.lbSlot1_2.Name = "lbSlot1_2";
            this.lbSlot1_2.Size = new System.Drawing.Size(150, 47);
            this.lbSlot1_2.TabIndex = 4;
            this.lbSlot1_2.Text = "1_2";
            this.lbSlot1_2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // panel5
            // 
            this.panel5.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.panel5.Controls.Add(this.lbSlot2_1);
            this.panel5.Controls.Add(this.lbSlot2_3);
            this.panel5.Location = new System.Drawing.Point(335, 0);
            this.panel5.Name = "panel5";
            this.panel5.Size = new System.Drawing.Size(116, 250);
            this.panel5.TabIndex = 12;
            // 
            // lbSlot2_3
            // 
            this.lbSlot2_3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.lbSlot2_3.Font = new System.Drawing.Font("돋움", 30F);
            this.lbSlot2_3.Location = new System.Drawing.Point(-3, 183);
            this.lbSlot2_3.Name = "lbSlot2_3";
            this.lbSlot2_3.Size = new System.Drawing.Size(122, 37);
            this.lbSlot2_3.TabIndex = 5;
            this.lbSlot2_3.Text = "2_3";
            this.lbSlot2_3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbSlot2_1
            // 
            this.lbSlot2_1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.lbSlot2_1.Font = new System.Drawing.Font("돋움", 30F);
            this.lbSlot2_1.Location = new System.Drawing.Point(-3, 25);
            this.lbSlot2_1.Name = "lbSlot2_1";
            this.lbSlot2_1.Size = new System.Drawing.Size(122, 37);
            this.lbSlot2_1.TabIndex = 3;
            this.lbSlot2_1.Text = "2_1";
            this.lbSlot2_1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbSlot2_2
            // 
            this.lbSlot2_2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.lbSlot2_2.Font = new System.Drawing.Font("돋움", 35F);
            this.lbSlot2_2.Location = new System.Drawing.Point(318, 0);
            this.lbSlot2_2.Name = "lbSlot2_2";
            this.lbSlot2_2.Size = new System.Drawing.Size(150, 47);
            this.lbSlot2_2.TabIndex = 4;
            this.lbSlot2_2.Text = "2_2";
            this.lbSlot2_2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // panel6
            // 
            this.panel6.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.panel6.Controls.Add(this.lbSlot3_1);
            this.panel6.Controls.Add(this.lbSlot3_3);
            this.panel6.Location = new System.Drawing.Point(529, 0);
            this.panel6.Name = "panel6";
            this.panel6.Size = new System.Drawing.Size(116, 250);
            this.panel6.TabIndex = 13;
            // 
            // lbSlot3_3
            // 
            this.lbSlot3_3.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.lbSlot3_3.Font = new System.Drawing.Font("돋움", 30F);
            this.lbSlot3_3.Location = new System.Drawing.Point(-3, 183);
            this.lbSlot3_3.Name = "lbSlot3_3";
            this.lbSlot3_3.Size = new System.Drawing.Size(122, 37);
            this.lbSlot3_3.TabIndex = 5;
            this.lbSlot3_3.Text = "3_3";
            this.lbSlot3_3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbSlot3_1
            // 
            this.lbSlot3_1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.lbSlot3_1.Font = new System.Drawing.Font("돋움", 30F);
            this.lbSlot3_1.Location = new System.Drawing.Point(-3, 25);
            this.lbSlot3_1.Name = "lbSlot3_1";
            this.lbSlot3_1.Size = new System.Drawing.Size(122, 37);
            this.lbSlot3_1.TabIndex = 3;
            this.lbSlot3_1.Text = "3_1";
            this.lbSlot3_1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lbSlot3_2
            // 
            this.lbSlot3_2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.lbSlot3_2.Font = new System.Drawing.Font("돋움", 35F);
            this.lbSlot3_2.Location = new System.Drawing.Point(513, 0);
            this.lbSlot3_2.Name = "lbSlot3_2";
            this.lbSlot3_2.Size = new System.Drawing.Size(150, 47);
            this.lbSlot3_2.TabIndex = 4;
            this.lbSlot3_2.Text = "3_2";
            this.lbSlot3_2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // panel2
            // 
            this.panel2.BackColor = System.Drawing.Color.White;
            this.panel2.Controls.Add(this.panel7);
            this.panel2.Controls.Add(this.panel6);
            this.panel2.Controls.Add(this.panel5);
            this.panel2.Controls.Add(this.panel4);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel2.Location = new System.Drawing.Point(0, 94);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(800, 356);
            this.panel2.TabIndex = 6;
            // 
            // panel7
            // 
            this.panel7.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.panel7.Controls.Add(this.lbSlot1_2);
            this.panel7.Controls.Add(this.lbSlot2_2);
            this.panel7.Controls.Add(this.lbSlot3_2);
            this.panel7.Location = new System.Drawing.Point(0, 104);
            this.panel7.Name = "panel7";
            this.panel7.Size = new System.Drawing.Size(800, 47);
            this.panel7.TabIndex = 14;
            // 
            // SlotMachine
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.MaximizeBox = false;
            this.Name = "SlotMachine";
            this.Text = "Slot Machine";
            this.panel1.ResumeLayout(false);
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            this.panel4.ResumeLayout(false);
            this.panel5.ResumeLayout(false);
            this.panel6.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.panel7.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.Label lbTitle;
        private System.Windows.Forms.Panel panel4;
        private System.Windows.Forms.Label lbSlot1_3;
        private System.Windows.Forms.Label lbSlot1_1;
        private System.Windows.Forms.Label lbSlot1_2;
        private System.Windows.Forms.Panel panel5;
        private System.Windows.Forms.Label lbSlot2_3;
        private System.Windows.Forms.Label lbSlot2_1;
        private System.Windows.Forms.Label lbSlot2_2;
        private System.Windows.Forms.Panel panel6;
        private System.Windows.Forms.Label lbSlot3_3;
        private System.Windows.Forms.Label lbSlot3_1;
        private System.Windows.Forms.Label lbSlot3_2;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Panel panel7;
        private System.Windows.Forms.TextBox tbBat;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label lbMyWallet;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Button btnStop;
        private System.Windows.Forms.Label lbResult;
    }
}

