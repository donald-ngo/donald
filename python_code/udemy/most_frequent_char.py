# Implement your function below.
def most_frequent(given_list):
    max_item = None
    num_dict = {}
    if (given_list == None):
        return max_item
    else:
        for number in given_list:
            if number in num_dict:
                num_dict[number] = num_dict[number] + 1
            else:
                 num_dict[number] = 1
    max_count = 1
    for item in num_dict:
        if num_dict[item] >= max_count:
            max_item = item
            max_count = num_dict[item];
    return max_item

# NOTE: The following input values will be used for testing your solution.
# most_frequent(list1) should return 1
list1 = [1, 3, 1, 3, 2, 1]
# most_frequent(list2) should return 3
list2 = [3, 3, 1, 3, 2, 1]
# most_frequent(list3) should return None
list3 = []
# most_frequent(list4) should return 0
list4 = [0]
# most_frequent(list5) should return -1
list5 = [0, -1, 10, 10, -1, 10, -1, -1, -1, 1]