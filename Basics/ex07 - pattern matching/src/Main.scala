object Main {
    object MyExtractorObject {
        def apply(x: Double): Double = x + 1
        def unapply(x: Double): Option[Double] = Some(x - 1)
    }
    
    case class MyDataRecord(x: Int, y: Int)
    val myregexpattern = "\\AHello, (.*)!\\Z".r
    
    def main (args: Array[String]): Unit = {
        val x = 9f
        println(f(MyDataRecord(10, 8))) // DataRecord(x=10,y=8)
        println(f(MyDataRecord(7, 7))) // DataRecord(x=7)
        println(f(MyDataRecord(6, 8))) // DataRecord(x=6)
        println(f(10, "b")) // (10, b)
        println(f("Hello, pattern!")) // pattern
        println(f(7)) // seven!
        println(f(9)) // Int: 9
        println(f(MyExtractorObject(10f))) // 10.0
        println(f("whatevs")) // Unknown
    }
    
    def f(x: Any): String = x match {
        case MyDataRecord(10, a) => s"DataRecord(x=10,y=$a)"
        case MyDataRecord(7, _) => "DataRecord(x=7)"
        case MyDataRecord(a, _) => s"DataRecord(x=$a)"
        case (a, b) => s"($a, $b)"
        case myregexpattern(a) => a
        case 7 => "seven!"
        case x:Int => s"Int: $x"
        case MyExtractorObject(x) => s"$x"
        case _ => "Unknown"
    }
}
