using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 2, 4, 8, 1, 5 };
            int temp;

            for (int i = 0; i < arr.Length - 1; i++) {
                for (int j = i + 1; j < arr.Length; j++) {
                    if (arr[i] > arr[j])
                    {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                    }
                }
            }
            for (int i = 0; i < arr.Length; i++) {
                Console.Write(arr[i].ToString() +"\t");
            }

            int[] values = { 100, 200, 300, 400, 500, 600, 700, 800 };
            double result = PlayerData.DataUtil.GetAvg(values);
            int max = PlayerData.DataUtil.GetMax(values);
            Console.WriteLine(result);
            Console.WriteLine(max);
            Console.ReadLine();


        }
    }
}
