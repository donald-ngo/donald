my_list = [1,2,3]
my_list = [0] + my_list
my_set = {4,4,5,5,6,6}
my_set.add(6)

my_tuple = (7,8,9)
my_dict = {'first_name':'donald','last_name':'ngo'}
my_number = 5

#my_set + my_number #Runtime error TypeError: unsupported operand type(s) for +: 'set' and 'int'
#print "mylist: " + my_set #Runtime error  TypeError: cannot concatenate 'str' and 'set' objects

print 'my_list contains:' + ''.join(str(values) for values in my_list)
print 'my_set contains:' + ''.join(str(values) for values in my_set)
print 'my_tuple contains:' + ''.join(str(values) for values in my_tuple)


print 'my_dict contains:' + ''.join(str(values) + ":" + str(my_dict[values] + ",") for values in my_dict)
