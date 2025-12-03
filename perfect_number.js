let number = 28
let sum = 0;

for (let index = 1; index < number; index++) {
    if (number % index == 0) {
        console.log(index);
        sum += index;
    }
}

if (sum == number) {
    console.log(number + " is a perfect number");
} else {
    console.log(number + " is not a perfect number");
}

