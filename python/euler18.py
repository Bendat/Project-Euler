__author__ = 'Ben'


def main(args=None):
    table_18 = make_array_from_file("triangle17.txt")
    print("Hello")
    table_67 = make_array_from_file("triangle68.txt")
    print("Solution 17: " + table_18 + "\n Solution 68: " + table_67)


def make_array_from_file(self, filename):
    with open(filename) as file:
        res = [[int(number) for number in line.split()] for line in file]
    return res

def find_largest_path(self, table):
    array_size = len(table) - 1
    for row in range(array_size, 0, -1):
        for col in range(0, row):
            table[row-1][col] += max(table[row][col], table[row][col+1])
    return table[0][0]