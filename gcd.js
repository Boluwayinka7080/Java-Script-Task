let first_number = 24
let second_number = 20
let count = 0
let counter = 0
let largest = 0
    for(count = 1; count < first_number ; count++)
        if(first_number % count == 0 && second_number % count == 0){
    console.log(count)
    counter=count
    }
console.log("The greatest divisor is ", counter)

