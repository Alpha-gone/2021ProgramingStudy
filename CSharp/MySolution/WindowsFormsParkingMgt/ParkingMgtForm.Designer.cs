
namespace WindowsFormsParkingMgt
{
    partial class ParkingMgtForm
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
            this.listBoxState = new System.Windows.Forms.ListBox();
            this.panel2 = new System.Windows.Forms.Panel();
            this.cboCarList = new System.Windows.Forms.ComboBox();
            this.btnCarIn = new System.Windows.Forms.Button();
            this.btnCarOut = new System.Windows.Forms.Button();
            this.lbCarsCount = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.btnCarOut);
            this.panel1.Controls.Add(this.btnCarIn);
            this.panel1.Controls.Add(this.cboCarList);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(800, 63);
            this.panel1.TabIndex = 0;
            // 
            // listBoxState
            // 
            this.listBoxState.Dock = System.Windows.Forms.DockStyle.Fill;
            this.listBoxState.FormattingEnabled = true;
            this.listBoxState.ItemHeight = 12;
            this.listBoxState.Location = new System.Drawing.Point(0, 63);
            this.listBoxState.Name = "listBoxState";
            this.listBoxState.Size = new System.Drawing.Size(800, 387);
            this.listBoxState.TabIndex = 1;
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.lbCarsCount);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel2.Location = new System.Drawing.Point(0, 350);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(800, 100);
            this.panel2.TabIndex = 2;
            // 
            // cboCarList
            // 
            this.cboCarList.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.cboCarList.FormattingEnabled = true;
            this.cboCarList.Location = new System.Drawing.Point(378, 25);
            this.cboCarList.Name = "cboCarList";
            this.cboCarList.Size = new System.Drawing.Size(179, 20);
            this.cboCarList.TabIndex = 0;
            // 
            // btnCarIn
            // 
            this.btnCarIn.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnCarIn.Location = new System.Drawing.Point(575, 22);
            this.btnCarIn.Name = "btnCarIn";
            this.btnCarIn.Size = new System.Drawing.Size(81, 23);
            this.btnCarIn.TabIndex = 1;
            this.btnCarIn.Text = "입차";
            this.btnCarIn.UseVisualStyleBackColor = true;
            // 
            // btnCarOut
            // 
            this.btnCarOut.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnCarOut.Location = new System.Drawing.Point(662, 23);
            this.btnCarOut.Name = "btnCarOut";
            this.btnCarOut.Size = new System.Drawing.Size(81, 23);
            this.btnCarOut.TabIndex = 2;
            this.btnCarOut.Text = "출차";
            this.btnCarOut.UseVisualStyleBackColor = true;
            // 
            // lbCarsCount
            // 
            this.lbCarsCount.AutoSize = true;
            this.lbCarsCount.Location = new System.Drawing.Point(12, 10);
            this.lbCarsCount.Name = "lbCarsCount";
            this.lbCarsCount.Size = new System.Drawing.Size(85, 12);
            this.lbCarsCount.TabIndex = 0;
            this.lbCarsCount.Text = "현재 차량 대수";
            // 
            // ParkingMgtForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.listBoxState);
            this.Controls.Add(this.panel1);
            this.Name = "ParkingMgtForm";
            this.Text = "parking";
            this.panel1.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button btnCarOut;
        private System.Windows.Forms.Button btnCarIn;
        private System.Windows.Forms.ComboBox cboCarList;
        private System.Windows.Forms.ListBox listBoxState;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Label lbCarsCount;
    }
}

