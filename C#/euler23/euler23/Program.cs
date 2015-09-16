using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace euler23
{
    class Program
    {
        const int Max = 28123;
        private static readonly bool[] IsAbundent = new bool[Max+1];

        static void Main(string[] args)
        {
            AddAbundentsToArray();
            int sum = SumNoneAbundentNumbers();
            Console.WriteLine(sum + " ");
            Console.ReadKey();
        }

        private static int SumNoneAbundentNumbers()
        {
            int sum = 0;
            for (int i = 1; i < Max; i++)
            {
                if (!IsSumOfAbundent(i))
                {
                    sum += i;
                }
            }
            return sum;
        }

        private static void AddAbundentsToArray()
        {
            for (int i = 1; i < IsAbundent.Count(); i++)
            {
                IsAbundent[i] = IsAbundant(i);
            }
        }

        private static bool IsSumOfAbundent(int n)
        {
            for (int i = 0; i <= n; i++)
            {
                if(IsAbundent[i] && IsAbundent[n - i])
                {
                    return true;
                }
            }
            return false;
        }

        private static bool IsAbundant(int num)
        {
            int sum = 0;
            for (int i = 1; i < num; i++)
            {
                if (num % i == 0)
                {
                    sum += i;
                }
            }
            return sum > num;
        }
    }
}
