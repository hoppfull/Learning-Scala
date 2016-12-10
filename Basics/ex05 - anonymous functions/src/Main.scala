object Main {
    def main (args: Array[String]): Unit = {
        val f = (x: Int) => x * 2
        val g = f(_)
        
        println(f(10)) // 20
        println(g(10)) // 20
        
        val h = genInc(5)
        
        println(h(7)) // 12
        println(apply(h)) // 15
    }
    
    // Higher order function (returns function):
    def genInc(i: Int): Int => Int = i + _
    
    // Higher order function (takes function as argument):
    def apply(f: Int => Int):Int = f(10)
}
