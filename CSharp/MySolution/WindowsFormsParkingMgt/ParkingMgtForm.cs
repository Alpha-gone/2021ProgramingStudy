using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsParkingMgt
{
    public partial class ParkingMgtForm : Form
    {
        ArrayList carNumberList = new ArrayList();
        List<Car> cars = new List<Car>();
        Car car;
        int seq = 0;

        public ParkingMgtForm()
        {
            InitializeComponent();
            btnCarIn.Click += BtnCarIn_Click;
            btnCarOut.Click += BtnCarOut_Click;
        }
        private void BtnCarIn_Click(object sender, EventArgs e)
        {
            foreach (var car in cars)
            {
                if (car.CarNumber.Contains(cboCarList.Text))
                {
                    listBoxState.Items.Add(cboCarList.Text +" 이미입고되어있음");
                    return;
                }
            }

            car = new Car();
            car.Seq = ++seq;
            car.CarNumber = cboCarList.Text;
            car.SetInTime();
            cars.Add(car);
            carNumberList.Add(cboCarList.Text);
            cboCarList.Items.Clear();
            cboCarList.Items.AddRange(carNumberList.ToArray());
            StringBuilder sb = new StringBuilder();
            sb.Append("차량번호: ");
            sb.Append(cboCarList.Text);
            sb.Append("[입고시간] ");
            sb.Append(car.GetInTime());
            listBoxState.Items.Add(sb.ToString());
            lbCarsCount.Text = "현재 차량 대수: " + cars.Count;
        }

        private void BtnCarOut_Click(object sender, EventArgs e)
        {
            foreach (var car in cars) {
                if (car.CarNumber.Contains(cboCarList.Text)) {
                    car.SetOutTime();
                    StringBuilder sb = new StringBuilder();
                    sb.Append("차량번호: ");
                    sb.Append(cboCarList.Text);
                    sb.Append("[입차시간] ");
                    sb.Append(car.GetInTime());
                    sb.Append(" [출차시간] ");
                    sb.Append(car.GetOutTime());
                    listBoxState.Items.Add(sb.ToString());
                    MessageBox.Show("출차\n입차시간: " + car.GetInTime().ToString() + "\n"
                        + "출차시간: " + car.GetOutTime().ToString() + "\n"
                        + "주차요금: " + price(car.GetInTime(), car.GetOutTime()) +"원", "");
                    cars.Remove(car);
                    break;
                }
            }
            carNumberList.Remove(cboCarList.Text);
            cboCarList.Items.Clear();
            cboCarList.Items.AddRange(carNumberList.ToArray());
            cboCarList.Text = "";
            lbCarsCount.Text = "현재 차량 대수: " + cars.Count;
        }

        public int price(DateTime inTime, DateTime outTime) {
            int price = 0;
            double oATimeInterValValue = outTime.ToOADate() - inTime.ToOADate();
            DateTime TimeInterValValue = DateTime.FromOADate(oATimeInterValValue);
            int days = TimeInterValValue.Day;
            int hours = TimeInterValValue.Hour;
            int mins = TimeInterValValue.Minute;
            int second = TimeInterValValue.Second;

            price = (hours * 1000) + (mins * 100) + (second * 10);
            return price;
        }
    }
}
