'''
Input sample:

Your program should accept a file as its first argument. 
The file contains multiple separated lines; each line contains 3 numbers that are space delimited. 
The first number is the first divider (X), the second number is the second divider (Y), 
and the third number is how far you should count (N). 
You may assume that the input file is formatted correctly and the numbers are valid positive integers.

For example:
3 5 10
2 7 15

Output sample:
1 2 F 4 B F 7 8 F B
1 F 3 F 5 F B F 9 F 11 F 13 FB 15

Print out the series 1 through N replacing numbers divisible by X with "F",
numbers divisible by Y with "B" and numbers divisible by both with "FB".
Since the input file contains multiple sets of values, your output should print out one line per set.
Ensure that there are no trailing empty spaces in each line you print.

Constraints:
    The number of test cases <= 20
    "X" is in range [1, 20]
    "Y" is in range [1, 20]
    "N" is in range [21, 100]
'''

"""Sample code to read in test cases:
import sys

with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        # ignore test if it is an empty line
        # 'test' represents the test case, do something with it
        # ...
        # ...
"""

import sys

#with open('testcases.txt', 'r') as test_cases:
with open(sys.argv[1], 'r') as test_cases: 
    for test in test_cases:
        line = test.strip()
        if ( not line ): #Ignore test if it is an empty line
            continue #Return control to the beginning of for loop

        x, y, n = (int(i) for i in line.split(" "))

        number_list = list()
        for number in range(1,n+1):
            if ((number % x == 0) and (number % y == 0)):
                number_list.append('FB')    
            elif (number % x == 0):
                number_list.append('F')
            elif (number % y == 0):
                number_list.append('B')
            else:
                number_list.append(str(number))
        print(' '.join(number_list).strip())