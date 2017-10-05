def my_reverse(input_string):
    my_list = list(input_string)
    i = 0
    j = len(my_list)-1
    while(j>i):
        my_list[i],my_list[j] = my_list[j],my_list[i]
        i += 1
        j -= 1
    return(my_list)

b = raw_input("Please enter a string to be reversed:")

#a = {'donald','cat','tree'}
#for words in a:
print(my_reverse(b))
