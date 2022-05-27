
namespace WindowsFormsAppEx
{
    partial class MyForm
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
            this.cbApple = new System.Windows.Forms.CheckBox();
            this.cbPoire = new System.Windows.Forms.CheckBox();
            this.cbGrape = new System.Windows.Forms.CheckBox();
            this.cbBerry = new System.Windows.Forms.CheckBox();
            this.btnPopup = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // cbApple
            // 
            this.cbApple.AutoSize = true;
            this.cbApple.Location = new System.Drawing.Point(40, 86);
            this.cbApple.Name = "cbApple";
            this.cbApple.Size = new System.Drawing.Size(48, 16);
            this.cbApple.TabIndex = 0;
            this.cbApple.Text = "사과";
            this.cbApple.UseVisualStyleBackColor = true;
            // 
            // cbPoire
            // 
            this.cbPoire.AutoSize = true;
            this.cbPoire.Location = new System.Drawing.Point(172, 86);
            this.cbPoire.Name = "cbPoire";
            this.cbPoire.Size = new System.Drawing.Size(36, 16);
            this.cbPoire.TabIndex = 1;
            this.cbPoire.Text = "배";
            this.cbPoire.UseVisualStyleBackColor = true;
            // 
            // cbGrape
            // 
            this.cbGrape.AutoSize = true;
            this.cbGrape.Location = new System.Drawing.Point(292, 86);
            this.cbGrape.Name = "cbGrape";
            this.cbGrape.Size = new System.Drawing.Size(48, 16);
            this.cbGrape.TabIndex = 3;
            this.cbGrape.Text = "딸기";
            this.cbGrape.UseVisualStyleBackColor = true;
            // 
            // cbBerry
            // 
            this.cbBerry.AutoSize = true;
            this.cbBerry.Location = new System.Drawing.Point(424, 86);
            this.cbBerry.Name = "cbBerry";
            this.cbBerry.Size = new System.Drawing.Size(48, 16);
            this.cbBerry.TabIndex = 2;
            this.cbBerry.Text = "포도";
            this.cbBerry.UseVisualStyleBackColor = true;
            // 
            // btnPopup
            // 
            this.btnPopup.Location = new System.Drawing.Point(556, 65);
            this.btnPopup.Name = "btnPopup";
            this.btnPopup.Size = new System.Drawing.Size(124, 57);
            this.btnPopup.TabIndex = 4;
            this.btnPopup.Text = "팝업";
            this.btnPopup.UseVisualStyleBackColor = true;
            // 
            // MyForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(716, 199);
            this.Controls.Add(this.btnPopup);
            this.Controls.Add(this.cbGrape);
            this.Controls.Add(this.cbBerry);
            this.Controls.Add(this.cbPoire);
            this.Controls.Add(this.cbApple);
            this.Name = "MyForm";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.CheckBox cbApple;
        private System.Windows.Forms.CheckBox cbPoire;
        private System.Windows.Forms.CheckBox cbGrape;
        private System.Windows.Forms.CheckBox cbBerry;
        private System.Windows.Forms.Button btnPopup;
    }
}

