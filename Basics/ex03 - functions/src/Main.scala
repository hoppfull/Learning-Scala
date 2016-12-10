object Main {
    def main (args: Array[String]): Unit = {
        val x = f(7)
        val y = g(7)
        
        /* Functions are first class and can be passed as values but requires
         * the underscore sign which is Scala's mechanism for partial
         * application:
         */
        val myfunc = f _
        println(myfunc(8)) // 16
        println(h(10)) // 30
        
        val myfunc2 = curried(7)(_)
        val myfunc3:Int => Int = f2(7, _)
        println(curried(5)(6)) // 11
        println(myfunc3(7)) // 14
    }
    
    /* Function definition:
     * Requires argument types!
     * Return argument can be inferred
     */
    
    // Function without a body:
    def f (x: Int) = x * 2
    
    // Function with a body:
    def g (x: Int) = {
        val y = x + 5
        y // Last expression is returned
    }
    
    // function composition:
    val h = f _ compose g _ // equivalent to: h(x:Int) = f(g(x))
    
    // curried function
    def curried (x: Int)(y: Int) = x + y
    
    // function with arity 2:
    def f2 (x: Int, y: Int) = x + y
}
