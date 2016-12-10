object Main {
    def main (args: Array[String]): Unit = {
        // instantiate class as object:
        val myObj = new MyClass(10, 8)
        
        println(myObj.x) // 10
        println(myObj.y) // 8
        println(myObj.z) // 0
        
        myObj.y = 11 // y is mutable
        myObj.z = 50 // calling function "z_="
        
        println(myObj.x) // 10
        println(myObj.y) // 11
        println(myObj.z) // 50
        
        println(myObj.myMethod(10)) // 100
    }
}
