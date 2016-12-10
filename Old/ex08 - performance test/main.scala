object Main {
  def main(args: Array[String]) = {
    def isPrime(n: Int): Boolean = {
      var isprime = true
      var i = 2
      val upper = scala.math.sqrt(n).toInt
      while (i <= upper && isprime) {
        if (n % i == 0)
          isprime = false
        i += 1
      }
      isprime
    }
    
    val l0 = 2 to 500000  // am I cheating here?
    
    val t0 = System.nanoTime()  // Start time
    val primes = l0 filter(isPrime)
    val t1 = System.nanoTime()  // Stop time
    
    val dt = (t1 - t0)/1000000
    println("Scala time: " + dt + " ms")
  }
}
// 30000 samples:
// 8ms
// 500000 samples:
// 100ms (compiled is only sligthly faster than script)