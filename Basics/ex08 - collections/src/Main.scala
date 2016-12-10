object Main {
    def main(args: Array[String]): Unit = {
        // mutable collection (constant time random access?):
        val array = Array(1, 2, 3)
        array foreach print // 123
        println()
        
        array(1) = 7
        array foreach print // 173
        println()
        
        // immutable collection:
        val map = Map("Han Solo" -> "Chewbacca", "Bonny" -> "Clyde")
            .withDefaultValue("Unknown")
            
        println(map("Han Solo")) // Chewbacca
        println(map("Bonny")) // Clyde
        println(map("Cat")) // Unknown
        println(map("Chewbacca")) // Unknown
        
        // immutable collection of unique values:
        val set = Set(1, 2, 2)
        set foreach print // 12
        println()
        println(set(0)) // false
        println(set(1)) // true
        println(set(2)) // true
        
        // immutable collection:
        val tuple = (1, 2, "three", true)
        println(tuple._1) // 1
        println(tuple._2) // 2
        println(tuple._3) // three
        println(tuple._4) // true
        
        // immutable collection:
        val list = List(1, 2, 3)
        list foreach print // 123
        println()
        
        // list1 ::: list2 joins two lists
        // value :: list prepends value to list (fast!)
        // list :: value appends value to list (slow!)
        
        // list comprehensions:
        val evens = for (i <- List.range(0, 10) if i % 2 == 0) yield i
        evens foreach print // 02468
        println()
        val odds = for (i <- Array.range(0, 10) if i % 2 != 0) yield i * 10
        odds foreach print // 1030507090
    }
}
