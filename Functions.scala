object Functions extends App{

    def aGreeting(name: String, age: Int): String = "My name is " + name + ", I am " + age +" year's old"
    
    println(aGreeting("Durga Prasad, L", 24))

    def aFactorial(num: Int): Int = {
        if(num == 1) 
            1
        else
            num * aFactorial(num-1)
    }
    
    println(aFactorial(5))

    def aFibonoci(n: Int): Int = {
        if(n <= 2) 1
        else
            aFibonoci(n - 1) + aFibonoci(n - 2)
    }

    println(aFibonoci(8))

    def isPrime(n: Int): Boolean = {
        def isPrimeUntil(t: Int): Boolean = {
            if(t <= 1)  true
            else    n % t != 0 && isPrimeUntil(t - 1)
        }
        isPrimeUntil(n/2)
    }

    println(isPrime(10))
    println(isPrime(5))

}