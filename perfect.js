let number = 0
for (let counter = 1; counter <= 1000; counter++) {
    let number = counter;
    let sum = 0;
    for (let count = 1; count < number; count++) {
        if (number % count === 0) {
            sum += count;
        }
    }
    if (number === sum) {
        console.log(sum);
    }
}

