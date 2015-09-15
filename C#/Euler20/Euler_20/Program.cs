using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Numerics;
/*
n! means n × (n − 1) × ... × 3 × 2 × 1
*For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
*and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
*Find the sum of the digits in the number 100!
    */
namespace Euler_20
{
    class Program
    {

        static void Main(string[] args)
        {
            var num = factorial(100);
            var sum = SumDigits(num);
            Console.WriteLine(sum);
            Console.ReadKey();
        }

        public static BigInteger factorial(int number)
        {
            if (number <= 0)
            {
                throw new ArgumentOutOfRangeException(nameof(number), "Input must be greater than 1");
            }
            if (number == 1)
            {
                return 1;
            }
            BigInteger num = new BigInteger(number);
            return number*(factorial(number - 1));
        }

        public static BigInteger SumDigits(BigInteger num)
        {
            BigInteger sum = 0;
            while (!num.Equals(0))
            {
                sum += (num%10);
                num /= 10;
            }
            return sum;
        }
    }
}
