using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Euler17
{
    class Program
    {
        private static string[] Ones = { "zero", "one", "two", "three", "four",
                                         "five", "six", "seven", "eight", "nine"};

        private static string[] Teens = { "ten", "eleven", "twelve", "thirteen",
                                          "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

        private static string[] Tens = { "twenty", "thirty", "forty", "fifty",
                                         "sixty", "seventy", "eighty", "ninety" };

        public static String[] hundreds = {"onehundred", "twohundred", "threehundred",
                                            "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
        public static void Main(string[] args)
        {
        }

        private static String MakeEnglish(int number)
        {
            if (number >= 0 && number < 10)
            {
                return Ones[number];
            }

            return null;
        }
    }
}
