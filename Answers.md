# COMP 271 002 F17 Lab 3

# TestList Questions

- Because both Arraylist and LinkedList implement the list interface
and therefore fulfill the methods in the list interface as long as we 
use methods from that interface with these lists there is no differnce except in 
performance.
- list.remove(5) will remove the element at index 5 because an int is passed as the argument.
- list.remove(Integer.valueOf(5)); will remove the first element that is of value 5 because an object, Integer,
was passed as the argument

# TestIterator Questions

- This is the same as the first answer in TestList: Because both Arraylist and LinkedList 
implement the list interfaceand therefore fulfill the methods in the list interface as long 
as we use methods from that interface with these lists there is no differnce except in 
performance.

# TestPerformance Questions
REPS = 10000000
Size:                    10  -  100  -  1000  -  10000

time LinkedList Access: 0.063- 0.248 -  4.296 - 57.88
AddRemove:              0.201- 1.108 -  0.547 - 0.857

time Arraylist Access : 0.145- 0.034 -  0.161 - 0.047
AddRemove:              0.211- 0.33  -  1.76  - 22.37

- it appears that the linkedlist has better performance at large size when adding 
and removing objects but not for accessing data
- The arraylist is the opposite, it is better for accessing data and worse for 
adding and removing it.