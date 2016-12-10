object Main {
    def main(args: Array[String]):Unit = {
        var x = 5 // mutable
        val y = 7 // immutable
        
        val z: Int = 9 // explicit type signature
        
        x = 8
        // y = 9 // will not compile

        println(x)
        println(y)
        println(z)
    }
}
