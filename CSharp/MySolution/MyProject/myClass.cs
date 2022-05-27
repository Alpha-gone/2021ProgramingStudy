using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyProject
{
    class myClass
    {
        public int MyField1;
        public int MyField2;

       public myClass DeepCopy(){
            myClass newCopy = new myClass();

            newCopy.MyField1 = this.MyField1;
            newCopy.MyField2 = this.MyField2;
            return newCopy;
        }
    }
}
