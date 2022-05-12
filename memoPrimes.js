let primes = [];

const getPrimes = () => {
    primes.push(2);
    for (i = 3; i < 100; i++) {
        for (j = 0; j <= primes.length; j++) {
            if (i % primes[j] == 0) {
                j = primes.length;
            } else if (j + 1 === primes.length) {
                primes.push(i);
            }
        }
    }
};

getPrimes();
for (i of primes) {
    console.log(i);
}
