import sys

try:
    test_cases = open(sys.argv[1], 'r')
except:
    raise Exception("Cannot open file!")
alphabet = ""
for letter in range(ord('a'),ord('z')+1):
        alphabet += chr(letter)

test = ""        
for test in test_cases:
    if not test.strip():
        continue
    missing_alphabet = alphabet
    for letter in test.lower():
        if letter in missing_alphabet:
            missing_alphabet = missing_alphabet.replace(letter, "")
        if missing_alphabet == '':
            break
    if missing_alphabet == "":
        print "NULL"
    else: 
        print missing_alphabet.strip()
test_cases.close()    