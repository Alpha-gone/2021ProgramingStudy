using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyProject
{
    class Program
    {
        static void Main(string[] args)
        {
            myClass source = new myClass();
            source.MyField1 = 10;
            source.MyField2 = 20;

            myClass target = source;
            target.MyField2 = 30;

            Console.WriteLine(source.MyField1 + " " + source.MyField2);
            Console.WriteLine(target.MyField1 + " " + target.MyField2);
            Console.WriteLine("\\");
            Console.ReadLine();
            //Console.Write("정수값 : " + (23 / 5) + "\n나머지 : " +(23%5));
            /*    Console.Write("\tMaxValue\t\t\t\tMinValue\n");
                Console.Write("short\t" + short.MaxValue + "\t\t\t\t\t" + short.MinValue +"\n");
                Console.Write("ushort\t" + ushort.MaxValue + "\t\t\t\t\t" + ushort.MinValue + "\n");
                Console.Write("int\t" + int.MaxValue + "\t\t\t\t" + int.MinValue + "\n");
                Console.Write("uint\t" + uint.MaxValue + "\t\t\t\t" + uint.MinValue + "\n");
                Console.Write("long\t" + long.MaxValue + "\t\t\t" + long.MinValue + "\n");
                Console.Write("ulong\t" + ulong.MaxValue + "\t\t\t" + ulong.MinValue + "\n");
                Console.Write("float\t" + float.MaxValue + "\t\t\t\t" + float.MinValue + "\n");
                Console.Write("double\t" + double.MaxValue + "\t\t\t" + double.MinValue + "\n");
                Console.Write("decimal\t" + decimal.MaxValue + "\t" + decimal.MinValue + "\n");
                Console.ReadLine();*/
        }
    }
}
