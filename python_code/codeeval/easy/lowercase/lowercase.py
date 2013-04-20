import sys

test_cases = open(sys.argv[1], 'r')
#test_cases = open("lowercase.txt", 'r')
test = ""
for test in test_cases:
    if test.strip():
        print (test.lower().strip())
test_cases.close()
