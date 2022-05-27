using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PlayerData
{
    public class DataUtil
    {
        public static double GetAvg(int[] values)
        {
            double avg = 0;
            int sum = 0;

            for (int i = 0; i < values.Length; i++)
            {
                sum += values[i];
            }

            avg = sum / values.Length;
            return avg;
        }

        public static int GetMax(int[] values) {
            int max = values[0];

            for(int i = 1; i < values.Length; i++) { 
                if(max < values[i])
                {
                    max = values[i];
                }
            }

            return max;
        }
    }
}
