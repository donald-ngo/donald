HIGHEST_NUMBER = 1000

def isprime(number):
    #print "Checking isprime() for:", number
    if number < 1:
        return False
    for i in range(2,number):
        if number%i == 0:
            return False
    return True

for number in reversed(range(1,HIGHEST_NUMBER+1)):
    #print "Current number is: ", number
    if isprime(number):
        number_string = str(number)
        reversed_number_string = number_string[::-1]
        if number_string == reversed_number_string: 
            print number_string
            break

