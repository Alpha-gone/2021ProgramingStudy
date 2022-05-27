using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyProjectConsole
{
    class Program
    {
        static void Main(string[] args)
        {
            //복합 대입 연산자 (문자열)
            //String strResult = "hello ";
            //strResult += "sungho !";

            //Console.WriteLine(strResult);
            //Console.ReadLine();
            //int intOp1 = 100;
            //int intResult = 250;

            //복합 대입 연산자
            //intResult += intOp1;
            //Console.WriteLine(intResult);
            //Console.ReadLine();
            //double inch, kg, radius;


            //Console.Write("inch 단위 입력: ");
            //inch = double.Parse(Console.ReadLine());

            //Console.WriteLine(inch + "inch는 " + (inch * 2.54) + "cm 입니다.");

            //Console.Write("kg 단위 입력: ");
            //kg = double.Parse(Console.ReadLine());

            //Console.WriteLine(kg + "kg은 " + (kg * 2.20462262) + "pound 입니다.");

            //Console.Write("원의 반지름 입력: ");
            //radius = double.Parse(Console.ReadLine());
            //Console.WriteLine("원의 둘레: " + (2 * 3.14 * radius));
            //Console.WriteLine("원의 넓이: " + (3.14 * radius * radius));

            //삼항 연산자
            int number = int.Parse(Console.ReadLine());

            String value = number % 2 == 0 ? "짝수" : "홀수";
            Console.WriteLine(number + "는 " + value + "입니다.");


            Console.ReadLine();
        }
    }
}
