number = int(input("Enter number of choice: "))
first_number = int(number / 100)
second_number = int(number % 100) / 10
third_number = int(number % 100) % 10

cube_first_number = int(first_number ** 3)
cube_second_number = int(second_number ** 3)
cube_third_number = int(third_number ** 3)

sum = (int(cube_first_number + cube_second_number + cube_third_number))
print(sum)
same = True;
notsame = False;
if(number == sum):
    print(same)
else:
    print(notsame)
