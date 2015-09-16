using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Euler22
{
    class Program
    {
        static void Main(string[] args)
        {
            Stopwatch sw = Stopwatch.StartNew();
            string[] names = GetInput("p022_names.txt");
            Quicksort(names, 0, names.Length - 1);
            int sum = 0;
            for (int i = 0; i < names.Length; i++)
            {
                sum += (Score(names[i]) * (i + 1));
            }
            Console.WriteLine(sum);
            Console.ReadKey();
        }

        private static int Score(string name)
        {
            name = name.ToUpper();
            int sum = 0;
            for (int i = 0; i < name.Length; i++)
            {
                sum += (name[i] - 64);
            }
            return sum;
        }

        private static string[] GetInput(string filename)
        {
            string[] names;
            if (!File.Exists(filename))
            {
                throw  new FileNotFoundException(nameof(filename));
            }
            names = File.ReadAllText(filename).Split(',');
            for(int i = 0; i < names.Length; i++)
            {
                names[i] = names[i].Trim('"');

            }
            return names;
        }

        public static void Quicksort(string[] elements, int left, int right)
        {
            if (elements == null || elements.Length == 0)
                return;
            int leftPivot = left;
            int rightPivot = right;
            string pivot = elements[(left + right) / 2];

            while (leftPivot <= rightPivot)
            {
                while (String.Compare(elements[leftPivot], pivot, StringComparison.Ordinal) < 0)
                {
                    leftPivot++;
                }

                while (String.Compare(elements[rightPivot], pivot, StringComparison.Ordinal) > 0)
                {
                    rightPivot--;
                }

                if (leftPivot <= rightPivot)
                {
                    string tmp = elements[leftPivot];
                    elements[leftPivot] = elements[rightPivot];
                    elements[rightPivot] = tmp;

                    leftPivot++;
                    rightPivot--;
                }
            }
            if (left < rightPivot)
            {
                Quicksort(elements, left, rightPivot);
            }

            if (leftPivot < right)
            {
                Quicksort(elements, leftPivot, right);
            }
        }
    }
}
