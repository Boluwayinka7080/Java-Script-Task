first_number = int(input("Enter first number of choice: "))
second_number = int(input("Enter second number of choice: "))
count = 0;
counter = 0;
largest = 0;

for count in range(1,first_number):
    if(first_number % count == 0):
        if(second_number % count == 0):
            print(count)
            largest = count
#    if(largest < count):
#      largest = count 
#      print(larges

print("The greatest divisor is " ,largest)
