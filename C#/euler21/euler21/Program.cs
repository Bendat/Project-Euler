using System;
using System.Collections.Generic;
using System.Data;
using System.Diagnostics;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;
/*
    Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
    If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

    For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

    Evaluate the sum of all the amicable numbers under 10000.
*/
namespace euler21
{
    class Program
    {
        static void Main(string[] args)
        {
            Stopwatch sw = Stopwatch.StartNew();
            Dictionary<int, int> sumDictionary = new Dictionary<int, int>();
            int totalSum = 0;
            for (int i = 1; i < 10000; i++)
            {
                int sumOfNumber = GetProperDivisorsSum(i);
                if (GetProperDivisorsSum(sumOfNumber) == i && i != sumOfNumber)
                {
                    totalSum += i;
                }
            }
            Console.WriteLine(totalSum +" Run in: " + sw.ElapsedMilliseconds);
            Console.ReadKey();
        }

        public static int GetProperDivisorsSum(int num)
        {
            int sum = 0;
            for (int i = 1; i < num; i++)
            {
                if (num % i == 0)
                {
                    sum += i;
                }
            }
            return sum;
        }
      
    }
}
