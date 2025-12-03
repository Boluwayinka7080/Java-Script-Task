for counter in range(1, 1001):
    number = counter
    sum = 0
    for count in range(1, number):
        if number % count == 0:
            sum += count
    if number == sum:
        print(sum)

