import sys
import math

try:
    test_cases = open(sys.argv[1], 'r')
except:
    raise Exception("Cannot open file!")

test = ""
log2value =  0.0
number = 0
#10 = 101 2^3=9 + 2^0=1 =  10 
for test in test_cases:
    number = int(test)
    print "number:", number
    log2value = math.log( number ) / math.log( 2 )
    floating_value = log2value - int(log2value)
    integer_value = int(log2value)
    print "floating_value:", floating_value
    print "integer_value:", integer_value
test_cases.close()
