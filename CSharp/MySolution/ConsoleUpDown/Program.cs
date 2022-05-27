using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleUpDown
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rdNum = new Random();
            int resultNum = rdNum.Next(60) + 1;
            Console.WriteLine("1 ~ 60 까지 값을 입력하여 알아맞추세요");

            while (true)
            {
                int inputValue = int.Parse(Console.In.ReadLine());

                if (resultNum == inputValue)
                {
                    Console.WriteLine("정답 " + resultNum + "! 알아맞히셨습니다.");
                    break;
                }
                else if (resultNum > inputValue)
                {
                    Console.WriteLine("Up!");
                }
                else
                {
                    Console.WriteLine("Down!");
                }

            }

            Console.ReadLine();
        }
    }
}
