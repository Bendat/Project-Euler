using System;
using System.Numerics;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Euler13
{
    class Program
    {
        public const string NumFile = "TextFile1.txt";
        static void Main(string[] args)
        {
            if (!File.Exists(NumFile))
            {
                throw new NullReferenceException();
            }
            var numbers = File.ReadAllLines(NumFile).ToList();
            string result = calculateSumOfList(numbers).ToString();
            result = result.Substring(0, 10);
            Console.WriteLine(result);
            Console.ReadKey();
        }

        public static BigInteger calculateSumOfList(List<string> list)
        {
            BigInteger num = new BigInteger();
            num = 0;
            foreach (string line in list)
            {
                num += BigInteger.Parse(line);
            }
            return num;
        }
    }
}
