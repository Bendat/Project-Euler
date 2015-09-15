import sys

def main():
    table = get_array_from_file("triangle.txt")
    print "Maximum top-bottom total in triangle", find_maximum_path(table)
    
def find_maximum_path(table):
    table_size = len(table)
    for row in range(table_size - 1, 0, -1):
        for col in range(0, row):
            table[row-1][col] += max(table[row][col], table[row][col+1])
    return table[0][0]
        
def get_array_from_file(filename):
    return [[int(n) for n in s.split()] 
            for s in open(filename)
            .readlines()]

if __name__ == "__main__":
    main()
            