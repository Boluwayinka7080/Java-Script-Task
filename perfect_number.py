number = int(input("Enter number of choice: "))
sum = 0

for index in range(1, number):
    if(number % index == 0):
        print(index)
        sum += index
if sum == number: 
    print(number, "is a perfect number")
else: 
    print(number, "is not a perfect number")
        
