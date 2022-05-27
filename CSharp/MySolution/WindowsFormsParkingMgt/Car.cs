using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsParkingMgt
{
    class Car
    {
        private int seq;
        private string carNumber;
        private DateTime inTime;
        private DateTime outTime;

        public int Seq { get => seq; set => seq = value; }
        public string CarNumber { get => carNumber; set => carNumber = value; }

        public void SetInTime()
        {
            inTime = DateTime.Now;
        }

        public void SetOutTime()
        {
            outTime = DateTime.Now;
        }

        public DateTime GetInTime()
        {
            return inTime;
        }

        public DateTime GetOutTime()
        {
            return outTime;
        }

        
    }
}
